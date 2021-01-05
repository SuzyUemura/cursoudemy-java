package Sessão_05;

public class ValorNull {
public static void main(String[] args) {
	String s1 = " ";
	System.out.println(s1.concat("!!!!"));
	
	
	String s2 = Math.random() > 0.5 ? "Opa" : null;	
		if (s2 != null) {
			System.out.println(s2.concat("???"));
		}
	
	Data d1 = Math.random() > 0.5 ? new Data () : null;
//			se for maior que 0.5, cria nova data senão é nulo.
	
	if (d1 != null) {
		d1.mes = 3;
		System.out.println(d1.obterDataFormatada());
	}
	
	
	
}
}
