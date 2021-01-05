package Sessão_04;

import java.util.Scanner;

public class Exercicio08 {
public static void main(String[] args) {
	
Scanner entrada = new Scanner (System.in);

System.out.println("Ditige uma palavra");
String palavra = entrada.next();

System.out.println(palavra.charAt(5));

entrada.close();
}
}
