package Livraria;

public class CadrastroDeLivros {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		autor.setEmail("rodrigo.turini@caelum.com.br");
		autor.setCpf("123.456.789-10");
		
		Livro livro = new Livro();
		livro.setNome("Java 8 Prático");
		livro.setDescricao("Novos recursos da Liguagem");
		livro.setValor(59.90);
		livro.setIsbn("978-85-66250-46-6");
		//livro.setDataDeLancamento = "20/02/2020";
		
				
		livro.setAutor(autor);
		
		livro.motrarDetalhes();
		
		livro.aplicarDescontoDe(0.3);
				
		Livro outroLivro = new Livro();
		outroLivro.setNome("Lógica de Programaçãp");
		outroLivro.setDescricao("Crie seus primeiros programas");
		outroLivro.setValor(59.90);
		outroLivro.setIsbn("978-85-66250-22-0");
		//outroLivro.dataDeLancamento = "20/02/2020";
		
		outroLivro.setAutor(autor);
		
		outroLivro.motrarDetalhes();
		
		
	}

}
