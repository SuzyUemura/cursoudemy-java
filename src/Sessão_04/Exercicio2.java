package Sessão_04;

import java.util.Scanner;

public class Exercicio2 {
	
public static void main (String[] args) {
	

	
	Scanner entrada = new Scanner (System.in);
	
	System.out.println("Informe o ano: ");
	
	int ano = entrada.nextInt();
	
	if (ano % 4 == 0) {
		System.out.println("O ano digitado é bixesto.");
	} else {
		System.out.println("O ano digitado não é bixesto.");
	}
	entrada.close();
	
}
}
