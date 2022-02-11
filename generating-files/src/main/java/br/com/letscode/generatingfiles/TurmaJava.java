package br.com.letscode.generatingfiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.Getter;


@Getter
public class TurmaJava extends Turma{

	private List<String> listaAlunosJava = new ArrayList<String>();



	public TurmaJava() {

		super("Java");


		this.listaAlunosJava.addAll(new ArrayList<String> (Arrays.asList("Alexandre Martins", 
				"Vitor Hugo Lima", 
				"Esther Rodrigues",
				"Lavínia Cunha",
				"Natália Gomes",
				"Yago Ramos",
				"Letícia Cunha",
				"Srta. Ana Júlia Ramos",
				"Pietra Martins",
				"Thomas Peixoto",
				"Thales Farias")));

		this.setTotalAlunos(this.listaAlunosJava.size());
	}
	
	
	@Override
	public String getInformacoesTurma() {
		var infoTurma = "Nome da turma: " + this.getNomeTurma() + "\n\n";

		for (String aluno : this.listaAlunosJava)
		{
			infoTurma += aluno + "\n";
		}


		infoTurma += "\n \nTotal de alunos:" + this.getTotalAlunos();
		infoTurma += "\n \n---------------------------------";

		return infoTurma;
	}


}
