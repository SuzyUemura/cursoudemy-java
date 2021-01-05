package Sessão_05;

public class AreaCircTeste {
	public static void main(String[] args) {
		AreaCirc a = new AreaCirc (2);
		a.pi = 3;
		
		AreaCirc b = new AreaCirc (8);
		
	//	AreaCirc.pi = 2.; utilizar desta forma quando for declarado STATIC
		
		System.out.println (a.area());
		System.out.println(b.area());
	}



}

