package Sess�o_04;

import java.util.Scanner;

public class Exercicio06 {
public static void main(String[] args) {
	Scanner ler = new Scanner (System.in);
	int n = 78, tentativas, numero;
		 
		System.out.println("Advinhe um n�mero de 0 - 100");
		for (tentativas = 10; tentativas >0; tentativas --) {
		
		System.out.println("Voce possui " + tentativas + " tentativas.");	
		numero = ler.nextInt();
		
		
		
			if (numero == n) {
				System.out.println("PARAB�NS VOCE ACERTOU !!!");
					break;
			} else if (numero > n) {
				System.out.println("O numero � menor que " + numero);
				
			} else if (numero < n ) {
				System.out.println("O numero � maior que " + numero);
			}
			
		
			ler.close();	
			
			
	} 
		
	
	
}
}
