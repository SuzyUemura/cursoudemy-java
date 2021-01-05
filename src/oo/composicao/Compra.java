package oo.composicao;

import java.util.ArrayList;

public class Compra {
	
	String cliente;
	ArrayList<Item> itens = new ArrayList<Item>();
	
// biderecional
	
	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionaritem(new Item(nome, quantidade, preco));
	}
	
	void adicionaritem (Item item) {
		itens.add(item);
		item.compra = this;
	}
	
	double total =0;
	double getCompra () {
		
		for(Item item: itens) {
			total += item.quantidade * item.quantidade; 
		}
		return total;
		
	}
}
