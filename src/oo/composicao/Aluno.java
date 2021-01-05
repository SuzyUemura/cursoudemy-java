package oo.composicao;

import java.util.ArrayList;

public class Aluno {
	
	final String nome;
	final ArrayList<Curso> cursos = new ArrayList<>();
	 
	Aluno (String nome) {
		this.nome = nome;
	}
	
	
	void adicionarCurso (Curso curso) {
		this.cursos.add(curso);
		curso.alunos.add(this);
	}
	
	public String toString () {
		return nome; // converter um obj em string
	}
	Curso obterCursoPorNome (String nome) {
		for (Curso curso: this.cursos) {
			if (curso.nome.equalsIgnoreCase(nome)) {
				return curso;
			}
		}
// procurar curso a partir do nome
		return null;
		 
	}
}
