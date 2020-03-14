package Livraria;

public class CarrinhoDeCompras {
	
	private double total;
	
	public void adiciona(Livro livro) {
		System.out.println("Adicionando:" + livro);
		livro.aplicarDescontoDe(0.05);
		this.total += livro.getValor();
	}

	public double getTotal(){
		return this.total;
	}
	
	public void adiciona(Produto produto) {
		System.out.println("Adiiona: " + produto);
		this.total += produto.getValor();
	}
}
