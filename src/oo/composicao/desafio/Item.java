package oo.composicao.desafio;

public class Item {
	int quantidade;
	Produto produto; // referencia pode instanciar ou n�o
	Item (Produto produto, int quantidade) {
		this.produto = produto;
		this.quantidade = quantidade;
	}
	
	
	
}
