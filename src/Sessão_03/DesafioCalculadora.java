package Sessão_03;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		double n1, n2, resultado;
		String op;
		
		System.out.println("Escolha um numero: ");
		 	n1 = ler.nextDouble();
		 System.out.println("Escolha outro numero: ");
		 	n2 = ler.nextDouble();
		 System.out.println("Qual operação deseja realizar? (Digite: +, -,  *, / ou  % (modulo)");
		 	op = ler.next();
		 	
		 resultado = "+".equals(op) ? n1 + n2 : 0;
		 resultado = "-".equals(op) ? n1 - n2 : resultado;
		 resultado = "*".equals(op) ? n1 * n2 : resultado;
		 resultado = "/".equals(op) ? n1 / n2 : resultado;
		 resultado = "%".equals(op) ? n1 % n2 : resultado;
		 
		 
		 
		 System.out.printf("%.2f, %s, %.2f = %.2f", n1, op, n2, resultado);
		
		 ler.close();
	}
}
