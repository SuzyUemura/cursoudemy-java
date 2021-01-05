package Sessão_05_Desafio;

public class Jantar {
 public static void main(String[] args) {
	Comida c1 = new Comida ("Lasanha", 0.789, "Sorvete",  0.300);
	
	Pessoa p = new Pessoa ("Pedro", 68.78);
	
	System.out.println(p.apresentar());
	p.comer(c1);
	System.out.println(p.apresentar());
}
}
