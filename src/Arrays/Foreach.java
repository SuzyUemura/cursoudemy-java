package Arrays;

public class Foreach {
public static void main(String[] args) {
	double [] notas = {4.5, 7.8, 9.9, 6};
	
	
	
	for (int i = 0; i <notas.length; i++)	{
		System.out.print(notas [i] + " ");
	} // para mostrar todas as notas sem foreach
	
	System.out.println();
		
	for (double nota : notas) {
		System.out.print(nota + " ");
	} // percorrendo todas index com Foreach
		
		
		}
}
