package Livraria;

public class RegistroDeVendas {
	
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Mauricio Aniche");
		
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Test-Driven Development");
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-Driven Development");
		//ebook.getWaterMark();
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		
		
		
	}

}
