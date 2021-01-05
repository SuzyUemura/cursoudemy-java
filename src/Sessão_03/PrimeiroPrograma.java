package Sessão_03;

import java.util.Date;
import java.util.Scanner;

public class PrimeiroPrograma {
	public static void main(String[] args) {
		//final int n=2;
		byte anosde = 99;
		short c = 999;
		//int g =1234567891;
		
		System.out.println(anosde * c);
		System.out.println("Olá mundo!");
		System.out.println("hello word !!".toUpperCase());
		
		String s = "Boa tarde, X";
		
		System.out.println(s.toUpperCase());
		
		String a = "coração";
		a = s.toUpperCase();
		System.out.println(a);
		
		Date d = new Date();
		System.out.println(d);
		
		Scanner ler = new Scanner (System.in);
		
		System.out.println("Digite seu nome:");
		String nome = ler.nextLine(); // só o next le apenas a primeira palavra 
		
		System.out.println("ola, ".concat(nome));
		
		ler.close(); // fechar a leitura
	}
}
