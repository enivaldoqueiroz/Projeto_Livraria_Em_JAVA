package Livraria;

public class CarrinhoDeCompras {
	
	private double total;
	
	public void adiciona(Livro livro) {
		System.out.println("Adicionando:" + livro);
		livro.aplicarDescontoDe(0.05);
		total += livro.getValor();
	}

	public double getTotal(){
		return this.total;
	}
}
