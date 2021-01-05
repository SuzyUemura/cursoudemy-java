package Sessão_03;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
			Scanner ler = new Scanner (System.in);
		String sal1, sal2, sal3;
		
		System.out.print ("Digite o primeiro salario: R$");
			sal1 = ler.nextLine().replace(",", ".");
			
			System.out.print ("Digite o segundo salario: R$");
			sal2 = ler.nextLine().replace(",", ".");
		
			System.out.println ("Digite o terceiro salario: R$");
			sal3 = ler.nextLine().replace(",", ".");
	
	double s1 = Double.parseDouble(sal1);
	double s2 = Double.parseDouble(sal2);
	double s3 = Double.parseDouble(sal3);
	
	double media = (s1 + s2 + s3)/3; // da para usar var
	
	System.out.printf ("A media dos salarios informados é R$ %.2f", media);
			
		ler.close();
	}
		
}
