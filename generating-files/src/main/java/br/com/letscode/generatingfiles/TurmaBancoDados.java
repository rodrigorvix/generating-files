package br.com.letscode.generatingfiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.Getter;


@Getter
public class TurmaBancoDados extends Turma{

	
private List<String> alunosBancoDados = new ArrayList<String>();

	
	public TurmaBancoDados() {
		
		super("Banco de Dados");
		
		this.alunosBancoDados.addAll(new ArrayList<String> (Arrays.asList(
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
		
	}
	
	public void exibeAlunos() {
		System.out.println(this.alunosBancoDados);
	}
}
