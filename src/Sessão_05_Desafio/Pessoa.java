package Sessão_05_Desafio;

public class Pessoa {
	
	String nome;
	double peso;

	 Pessoa (String nome, double peso) {
		this.nome = nome;
		this.peso = peso;
	}
	 
	 
	void comer (Comida comida) {
		if (comida !=null) {
			this.peso += comida.pesoc + comida.pesos;
		}
	}
		 
	String apresentar() {
		return "Olá eu sou " + nome + "e tenho " + peso + "kgs.";
		}
	}

