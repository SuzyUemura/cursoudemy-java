package Sessão_03;

public class ConversaoPrimit {
	public static void main(String[] args) {
		double a = 1.12345678933333; // implicita
		System.out.println(a);
// cast
		float b = (float) 1.12345678933333; /* conversão explicita, informa ao sistema que vc esta ciente
						 						que pode  causar perda de informações */
		System.out.println(b);

		int c = 234;
		byte d = (byte) c;		// explicita 
		// o maior valor de byte é 127, os proximos números serão apresentados como negativos
		// conforme for aumentando ele se aproxima do zero e passa a ser positivos.
		System.out.println(d); 
//---------------------------------------------------------------------------------------------------------------------------		
		Integer num1 = 10000;
		System.out.println(num1.toString().length());
		// ou System.out.println(Integer.toString(num1).length())
		
		// outra forma também:
		int num2 = 10008;
		System.out.println((" " + num2).length());
//---------------------------------------------------------------------------------------------------------------------------		
		
		
}
}
