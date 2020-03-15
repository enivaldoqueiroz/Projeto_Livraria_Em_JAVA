package br.com.ccodigo.livraria.teste;

import br.com.ccodigo.livraria.Autor;
import br.com.ccodigo.livraria.produtos.Ebook;
import br.com.ccodigo.livraria.produtos.LivroFisico;
import br.com.ccodigo.livraria.produtos.Produto;
//import br.com.ccodigo.livraria.produtos;

public class RegistroDeVendas {
	
	public static void main(String[] args) {
		Autor autor = new Autor();
		autor.setNome("Mauricio Aniche");
		
			
		LivroFisico fisico = new LivroFisico(autor);
		fisico.setNome("Test-Driven Development");
		fisico.setValor(59.90);
		
		if(fisico.aplicarDescontoDe10Porcento()) {
			System.out.println("Valor agora é " + fisico.getValor());
		}
				
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Test-Driven Development");
		ebook.setValor(29.90);
		
		if(fisico.aplicarDescontoDe10Porcento()) {
			System.out.println("Valor agora é " + fisico.getValor());
		}
		
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		carrinho.adiciona(fisico);
		carrinho.adiciona(ebook);
		
		System.out.println("Total " + carrinho.getTotal());
		
		Produto [] produtos = carrinho.getProdutos();
		
		for(int i = 0; i<= produtos.length; i++) {
			try {
				Produto produto = produtos[i];
				if(produto != null){
					System.out.println(produto.getValor());
				}
			} catch (Exception e) {
				System.out.println("Deu exception no indece:" + i);
			}
			
			
		}
		
		System.out.println("Foi executado!!!");
		
	}

}
