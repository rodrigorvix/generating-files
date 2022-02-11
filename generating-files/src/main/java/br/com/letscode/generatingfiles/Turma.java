package br.com.letscode.generatingfiles;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public abstract class Turma {
	
	 private String nomeTurma;
	 private int totalAlunos;
	
	
	
	public Turma(String nomeTurma) {
		
		this.nomeTurma = nomeTurma;
	}
	
	
	 public abstract String getInformacoesTurma();


}
