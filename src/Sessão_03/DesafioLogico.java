package Sessão_03;

public class DesafioLogico {
	public static void main(String[] args) {
/*
 * trab - terç
 * trab - quin
 * 
 * duas verdades = compra tv 50
 * uma verdade = compra tv 35
 * terç deu certo = ir no shopping
 */
		
	boolean trab1 = false;
	boolean trab2 = false;
	
	boolean comptv50 = trab1 && trab2;
	boolean comptv32 = trab1 ^ trab2;
	boolean sorvete = trab1 || trab2;
	
	
	
	System.out.println("Comprou TV de 50?" + comptv50);
	System.out.println("Comprou TV de 32?" + comptv32);
	System.out.println("Comprou sorvete?" + sorvete);
	System.out.println("Mais saudavel?" + !sorvete);
}
}
