package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class Desafio {
	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		
		int quantidade;
	
		System.out.println("Quantidade de notas que será informada:");
			quantidade = ler.nextInt();
		double aluno [] = new double [quantidade];

		for (int i = 0; i < aluno.length; i ++  ) {
			System.out.println("Digite a nota " + i + ":");
			aluno [i] = ler.nextDouble(); 
		}
		
		double total = 0;
		for (double notas: aluno) {
			total += notas;
		}
		System.out.println("Sua média é: " + total/aluno.length);
		ler.close();
	}	
}
