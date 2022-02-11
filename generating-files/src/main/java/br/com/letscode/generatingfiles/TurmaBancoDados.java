package br.com.letscode.generatingfiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.Getter;




@Getter
public class TurmaBancoDados extends Turma{

	
	 private List<String> listaAlunosBancoDados = new ArrayList<String>();

	
	public TurmaBancoDados() {
		
		super("Banco de Dados");
		
		
		
		this.listaAlunosBancoDados.addAll(new ArrayList<String> (Arrays.asList(
				"Vitor Hugo Lima", 
				"Esther Rodrigues",
				"Nathan Nascimento",
				"Lavínia Cunha",
				"Natália Gomes",
				"Dra. Lavínia Lopes",
				"Yago Ramos",
				"Letícia Cunha",
				"Luiz Miguel Azevedo",
				"Srta. Ana Júlia Ramos",
				"Thales Farias",
				"Dra. Alana Porto")));
		
	
		this.setTotalAlunos(this.listaAlunosBancoDados.size());
	}
	
	@Override
	public String getInformacoesTurma() {
		var infoTurma = "Nome da turma: " + this.getNomeTurma() + "\n\n";

		for (String aluno : this.listaAlunosBancoDados)
		{
			infoTurma += aluno + "\n";
		}


		infoTurma += "\n \nTotal de alunos:" + this.getTotalAlunos();
		infoTurma += "\n \n---------------------------------";

		return infoTurma;
	}

}
