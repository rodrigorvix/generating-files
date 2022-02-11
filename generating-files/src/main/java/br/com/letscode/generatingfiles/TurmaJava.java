package br.com.letscode.generatingfiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import lombok.Getter;


@Getter
public class TurmaJava extends Turma{
	
	private List<String> alunosJava = new ArrayList<String>();

	
	
	public TurmaJava() {
		
		super("Java");
		
		this.alunosJava.addAll(new ArrayList<String> (Arrays.asList("Alexandre Martins", 
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
		
	}
	
	public void exibeAlunos() {
		System.out.println(this.alunosJava);
	}
}
