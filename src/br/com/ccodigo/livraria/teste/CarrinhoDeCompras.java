package br.com.ccodigo.livraria.teste;

import br.com.ccodigo.livraria.produtos.Livro;
import br.com.ccodigo.livraria.produtos.Produto;
import br.com.ccodigo.livraria.produtos.Promocional;

public class CarrinhoDeCompras implements Promocional{
	
	private double total;
	private Produto [] produtos = new Produto[10];
	private int contador = 0;
	
	
	/*public void adiciona(Livro livro) {
		System.out.println("Adicionando:" + livro);
		livro.aplicarDescontoDe(0.05);
		this.total += livro.getValor();
	}*/
	
	public void adiciona(Produto produto) {
		System.out.println("Adiiona: " + produto);
		this.produtos[1] = produto;
		contador ++;
		this.total += produto.getValor();
	}

	public double getTotal(){
		return this.total;
	}
	
		
	
	public Produto[] getProdutos() {
		return produtos;
	}

	@Override
	public boolean aplicarDescontoDe(double porcentagem) {
		// TODO Auto-generated method stub
		return false;
	}
}
