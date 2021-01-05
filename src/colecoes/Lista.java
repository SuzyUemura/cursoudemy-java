package colecoes;

import java.util.ArrayList;

public class Lista {
	public static void main(String[] args) {
		// não precisa importar a classe usuario porque esta no mesmo pacote
		 ArrayList <Usuario> lista = new ArrayList <>(); 
// adicionando na lista:	
		 Usuario u1 = new Usuario ("Ana");
		 lista.add(u1);
		 
// ou add desta forma:
		 lista.add(new Usuario("Carlos"));
		 lista.add(new Usuario("Lia"));
		 lista.add(new Usuario("Bia"));
		 lista.add(new Usuario("Manu"));
		 
		 for (Usuario u: lista) {
			 System.out.println(u.nome); // não aparece no formato
			 System.out.println(u);
		 }
// outra forma de interagir:
		 System.out.println(lista.get(3).nome); // acessar pelo indice
	
// formas de remover
		 lista.remove(1); // aparece o que removeu
		 lista.remove(new Usuario("Bia")); // retorna true
		
// contém
		System.out.println("Tem? " +lista.contains(new Usuario("Lia"))); 
		System.out.println("Tem? " + lista.contains(u1)); // sem o equals de usuario este é unica forma que consegue filtrar
// da pra acessar lista pelo id	
	
	
	}
} 
