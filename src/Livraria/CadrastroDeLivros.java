package Livraria;

public class CadrastroDeLivros {

	public static void main(String[] args) {
		
		Autor autor = new Autor();
		autor.nome = "Rodrigo Turini";
		autor.email = "rodrigo.turini@caelum.com.br";
		autor.cpf = "123.456.789-10";
		
		Livro livro = new Livro();
		livro.nome = "Java 8 Prático";
		livro.descricao = "Novos recursos da Liguagem";
		livro.valor = 59.90;
		livro.isbn = "978-85-66250-46-6";
		livro.dataDeLancamento = "20/02/2020";
		
				
		livro.autor = autor;
		
		livro.motrarDetalhes();
		
		livro.aplicarDescontoDe(0.3);
				
		Livro outroLivro = new Livro();
		outroLivro.nome = "Lógica de Programaçãp";
		outroLivro.descricao = "Crie seus primeiros programas";
		outroLivro.valor = 59.90;
		outroLivro.isbn = "978-85-66250-22-0";
		outroLivro.dataDeLancamento = "20/02/2020";
		
		outroLivro.autor = autor;
		
		outroLivro.motrarDetalhes();
		
		
	}

}
