package br.com.ccodigo.livraria.produtos;

import br.com.ccodigo.livraria.Autor;

public class Ebook extends Livro implements Promocional{
	
	
	private String waterMark;
	
	public Ebook(Autor autor) {
		super(autor);
	}
	
	public String getWaterMark() {
		return waterMark;
	}
	public void setWaterMark(String waterMark) {
		this.waterMark = waterMark;
	}

	
	

	@Override
	public boolean aplicarDescontoDe(double porcentagem) {
		if (porcentagem > 0.15) {
			return false;
		}
		return true;
	}
}
