package Sessão_05;

public class Produto {

	String n1, n2, n3;
	double p1, p2, p3, total;
	static double DESCONTO = 0.25;
	
	
	Produto (String a1, String a2, String a3,
			double c1, double c2, double c3) {
		n1 = a1; 
		n2 = a2;
		n3 = a3;
		p1 = c1; 
		p2 = c2; 
		p3 = c3;
		
	}
	
double precoComDesconto () { // não entra parametros pois ja esta declarado
	
	total = p1 + p2 + p3;
	return total * (1- (DESCONTO));
}
	
}
