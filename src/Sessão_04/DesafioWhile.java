package Sessão_04;

import java.util.Scanner;

public class DesafioWhile {
public static void main(String[] args) {
	/*
calcular media
sem valor definido de notas
total soma todas as notas
para sair do programa digitar -1
	 */
	Scanner entrada = new Scanner (System.in);
	int cont=0; 
	double nota=0, total=0, media;
	
	System.out.println("DESCUBRA SUA MÉDIA");
	
	while (nota!= -1) {
			
		System.out.println("Digite uma nota: \nOu digite '-1' para sair...");
			nota = entrada.nextDouble();
				while (nota <-1 || nota >10) {
					System.out.println("Digite uma nota valida: ");
					nota = entrada.nextDouble();
				}
				if (nota >=0 && nota <= 10) {
					
					total = total + nota;
					cont ++;
					} 	
		
	}
	
	media = total / cont;

System.out.println("A media das notas digitadas é: "+ media);
	entrada.close();
}
}
