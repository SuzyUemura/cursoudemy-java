package Sessão_05;

public class ProdutoTeste {
public static void main(String[] args) {
	

	
	Produto carrinho = new Produto ("caderno","estojo", "caneta", 25, 7.80, 2.56);
	
	Produto.DESCONTO = 0.30;
	
	double compra = carrinho.precoComDesconto();
	
	
	System.out.println(compra);
	
	
	
}
}
