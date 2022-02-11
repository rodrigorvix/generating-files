package br.com.letscode.generatingfiles;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.io.FileUtils;

public class App {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub



		TurmaJava alunosJava = new TurmaJava();
		TurmaBancoDados alunosBancoDados = new TurmaBancoDados();

		imprimeTurmas(alunosJava.getInformacoesTurma(), alunosBancoDados.getInformacoesTurma());

		List<String> listaAlunos = comparaTurmasSemDuplicados(alunosJava, alunosBancoDados);


		imprimeAlunos(listaAlunos);

	}


	public static void imprimeTurmas(String infoJava, String infoBancoDados) throws IOException {

		List<String> infoTurmas = new ArrayList<String>();

		infoTurmas.addAll(Arrays.asList(infoJava,infoBancoDados));

		String writeFilePath = "docs".concat(File.separator).concat("info-turmas.txt");
		File writeFile = FileUtils.getFile(writeFilePath);
		boolean append = true;
		FileUtils.writeLines(writeFile, infoTurmas, append);

	}
	
	public static void imprimeAlunos(List<String> listaAlunos) throws IOException {

		
		String writeFilePath = "docs".concat(File.separator).concat("info-alunos.txt");
		File writeFile = FileUtils.getFile(writeFilePath);
		boolean append = true;
		FileUtils.writeLines(writeFile, listaAlunos, append);

	}

	public static List<String> comparaTurmasSemDuplicados(TurmaJava alunosJava, TurmaBancoDados alunosBancoDados ) {

		List<String> existeEmAmbasTurma = alunosJava.getListaAlunosJava()
				.stream()
				.filter(aluno -> alunosBancoDados.getListaAlunosBancoDados().contains(aluno))
				.collect(Collectors.toList());

		List<String> existeApenasJava = alunosJava.getListaAlunosJava();
		existeApenasJava.removeAll(existeEmAmbasTurma);

		List<String> existeApenasBancoDados = alunosBancoDados.getListaAlunosBancoDados();
		existeApenasBancoDados.removeAll(existeEmAmbasTurma);


		List<String> listaAlunos = Stream.of(existeApenasJava, existeApenasBancoDados, existeEmAmbasTurma)
				.flatMap(x -> x.stream())
				.collect(Collectors.toList());
		
		Collections.sort(listaAlunos);

		return listaAlunos;
	}



}
