package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList <>();
		
// ambos add se diferenciam apenas quando a fila esta cheia
		fila.add("Arthur");
		fila.offer("Sophia");
		fila.offer("Matheus");
		fila.add("Ana");
		fila.offer("Pedro");
		fila.add("Gui");
//A diferença ocorre na fila vazia 
// peek e element: obtem o próximo elemento da fila sem remover
		System.out.println(fila.peek());// retorna null
		System.out.println(fila.element()); // lança exceção
	
	// fila.size ();
	// fila.clear ();
	// fila.isEmpty();
// ambos obtem o proximo elemento da fila e remove
		System.out.println(fila.poll()); // quando acaba retorna null
		System.out.println(fila.poll());
		System.out.println(fila.remove()); // quando acaba retorna uma exceção

	}
}
