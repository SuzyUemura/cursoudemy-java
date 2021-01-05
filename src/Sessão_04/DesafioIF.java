package Sessão_04;

import java.util.Scanner;

public class DesafioIF {
public static void main(String[] args) {
	Scanner entrada = new Scanner (System.in);
	
	System.out.println("Escolha um dia da semana: ");
		String escolhaDia = entrada.nextLine();

		String semana = escolhaDia.trim();
		
		if (semana.equalsIgnoreCase("domingo")) {
			System.out.println("Domingo -> 1° ");
		}
		else if (semana.equalsIgnoreCase("segunda")) {
			System.out.println("Segunda -> 2°");
		}
		else if (semana.equalsIgnoreCase("terça")) {
			System.out.println("Terça -> 3°");
		}
		else if (semana.equalsIgnoreCase("quarta")) {
			System.out.println("Quarta -> 4°");
		}
		else if (semana.equalsIgnoreCase("quinta")) {
			System.out.println("Quinta -> 5°");
		}
		else if (semana.equalsIgnoreCase("sexta")) {
			System.out.println("Sexta -> 6°");
		}
		else if (semana.equalsIgnoreCase("sabado")) {
			System.out.println("Sábado -> 7°");
		}
		entrada.close();
		
}
		
}
