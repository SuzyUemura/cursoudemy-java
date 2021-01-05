package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
@SuppressWarnings("unchecked") // resolve o warning 
public static void main(String[] args) {
	HashSet conjunto = new HashSet ();
	// NÃO ACEITA TIPOS PRIMITIVOS, CONVERTE AUTOMATICAMENTE EM:
	conjunto.add(1.2); // -> double em Double
	conjunto.add(true); // boolean em Boolean
	conjunto.add("Teste"); 
	conjunto.add(1); // int em Integer
	conjunto.add('x'); // char em Caracter
	
//mostrar o tamanho 	
	System.out.println("Tamanho é " + conjunto.size());
	
	conjunto.add("teste");
	
	System.out.println("Tamanho é " + conjunto.size());// passa a ser 6 elementos porque teste esta com letra minuscula
	
// para remover
	conjunto.remove("teste");
	System.out.println(conjunto.remove('x'));
	System.out.println(conjunto.remove(1.2));
	
	System.out.println("Tamanho é " + conjunto.size());
	
// para verificar se contem
	
	System.out.println(conjunto.contains(1.2)); // ja foi retirado
	System.out.println(conjunto.contains("Teste"));
	
	Set nums = new HashSet();
	nums.add(1);
	nums.add(2);
	nums.add(3);
	
	System.out.println(nums);
	System.out.println(conjunto); // oq sobrou
	

//	conjunto.addAll(nums);  união entre conjuntos
	
//	System.out.println(conjunto);
	
// intersecção
	conjunto.retainAll(nums);
	
	System.out.println(conjunto);
	
// para limpar
	
	conjunto.clear();
	System.out.println(conjunto); 
	
	
	
	
	
}
}
