package Sessão_05;

public class DataTeste {
	public static void main(String[] args) {
		Data casamento = new Data ();
		
		
		Data namoro = new Data (07, 11, 2021);
		
		
		System.out.printf("Comecei namorar em %d/%d/%d.\n", namoro.dia, namoro.mes, namoro.ano);
		System.out.println(casamento.obterDataFormatada());
		
	}
}
