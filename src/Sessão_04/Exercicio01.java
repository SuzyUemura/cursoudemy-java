package Sessão_04;

import java.util.Scanner;

public class Exercicio01 {
public static void main(String[] args) {
	
	

	
	Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um número inteiro: ");
			int num = entrada.nextInt();
			switch (num) {
			 case 1: 
				if (num <= 10 && num >=0) {
					System.out.println("numero informado está entre 0 e 10");
				} 
			case 2: 
				 if (num % 2 == 0) {
					System.out.println("Numero informado é par.");
				}
			}
	entrada.close();
 }

}
