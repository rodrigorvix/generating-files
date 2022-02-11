package br.com.letscode.generatingfiles;

import lombok.Getter;


public  class Turma {
	
	@Getter private String nomeTurma;
	
	
	public Turma(String nomeTurma) {
		
		this.nomeTurma = nomeTurma;
	}

}
