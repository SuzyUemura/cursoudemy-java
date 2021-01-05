package colecoes;

import java.util.HashSet;
import java.util.Set;
public class conjuntoComportado {
	
	public static void main(String[] args) {
		
	
	Set <String> lista  = new HashSet <>(); //define o tipo da lista
// se não colocar o operador diamon ou <String> aceitará qualquer dado
	
	lista.add("Ana");
	lista.add("Carlos");
	lista.add("Luca");
	lista.add("Pedro");
	
	for (String candidato: lista) {
		System.out.println(candidato);
	}
// para sair em ordem, trocar o 'HashSet' por 'TreeSet'	

	Set <Integer> nums = new HashSet <>(); // dentro do collextions não converte 
	nums.add(1);
	nums.add(2);
	nums.add(3);
	nums.add(4);

	for (int n: nums) { // aqui converte automatico
		System.out.println(n);
	}

	}
}
