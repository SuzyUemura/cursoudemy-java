package Sessão_05;


public class Data {
	int dia, mes, ano;
	
	
	public Data () {
//		dia = 01;
//		mes = 01;
//		ano = 1970;
		
		this(01, 01, 1970);
	}
	
	public Data (int diaD, int mesM, int anoA) {
		dia = diaD;
		mes = mesM;
		ano = anoA;
		
	}
	
	
	public String obterDataFormatada () {
		  
		  return String.format ("%d/%d/%d", dia, mes, ano);
		  
	 }
	
	
// String obterDataFormatada () {
// String DataFormatada = dia + "/" + mes + "/" + ano + ".";
// return DataFormatada;
	
}
