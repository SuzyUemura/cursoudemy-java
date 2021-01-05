package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {
	public static void main(String[] args) {
		
		Deque<String> livros = new ArrayDeque<String>();
		
		livros.add("O pequeno principe");
		livros.add("Dom quixote");
		livros.push("O hobbit"); // push retorna exceção
		
		System.out.println(livros.peek());
		System.out.println(livros.peekLast());
		System.out.println(livros.peekFirst());
		
		System.out.println(livros.element());
		
		System.out.println(livros.poll());
		System.out.println(livros.pop()); // assim como remove retorna exceção
		System.out.println(livros.contains("Dom quixote"));
		
		for(String livro : livros) {
			System.out.println(livro );
		}
	}
}
