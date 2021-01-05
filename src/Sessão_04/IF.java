package Sessão_04;

import javax.swing.JOptionPane;

public class IF {

	public static void main(String[] args) {
		
	 
	 	String valor = JOptionPane.showInputDialog ("Informe um numero:");
	 	int numero = Integer.parseInt(valor);
	 		if (numero %2 == 0) {
	 			 JOptionPane.showMessageDialog(null,"Número digitado é PAR");
	 		}
	 		else {
	 			JOptionPane.showMessageDialog (null,"Número digitado é IMPAR");
	 		}
	 		
	 // por ter uma sentessa de cod pode tirar as CHAVES tanto de IF quanto de ELSE
		
	}

}
