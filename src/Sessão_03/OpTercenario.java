package Sessão_03;

public class OpTercenario {
	public static void main(String[] args) {
		
		double media = 7.6;
		String resultparcial = media >= 5.0 ? "EM RECUPERAÇÃO." :  "REPROVADO.";
		String resultado = media >= 7.0 ? "APROVADO." : resultparcial;
		System.out.println("o aluno esta: " + resultado);
		
		
		double nota = 9.9;
		boolean BomComportamento = false;
		
		boolean passou = nota >= 7;
		boolean desconto = BomComportamento && passou;
		
		String result = desconto ? "sim" : "não";
		
		System.out.println("Tem desconto? " + result);
}
}
