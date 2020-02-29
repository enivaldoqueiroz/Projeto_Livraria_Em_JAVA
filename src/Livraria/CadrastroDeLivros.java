package Livraria;

public class CadrastroDeLivros {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.setNome("Rodrigo Turini");
		autor.setEmail("rodrigo.turini@caelum.com.br");
		autor.setCpf("123.456.789-10");
		
		Livro livro = new Livro(autor);
		livro.setNome("Java 8 Prático");
		livro.setDescricao("Novos recursos da Liguagem");
		livro.setValor(59.90);
		livro.setIsbn("978-85-66250-46-6");
		livro.setAutor(autor);
		//livro.setDataDeLancamento = "20/02/2020";
						
		//livro.setAutor(autor);
		
		livro.motrarDetalhes();
		
		livro.aplicarDescontoDe(0.3);
		
		Autor outroAutor = new Autor();
		outroAutor.setNome("Paulo Silveira");
		outroAutor.setEmail("paulo.silveira@caelum.com.br");
		outroAutor.setCpf("321.456.789-09");
				
		Livro outroLivro = new Livro(outroAutor);
		outroLivro.setNome("Lógica de Programaçãp");
		outroLivro.setDescricao("Crie seus primeiros programas");
		outroLivro.setValor(59.90);
		outroLivro.setIsbn("978-85-66250-22-0");
		//outroLivro.dataDeLancamento = "20/02/2020";
		
		//outroLivro.setAutor(autor);
		
		outroLivro.motrarDetalhes();
		
		Ebook ebook = new Ebook(autor);
		ebook.setNome("Java 8 TDD");
		
		ebook.motrarDetalhes();
		 
		
		
	}

}
