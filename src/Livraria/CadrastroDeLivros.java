package Livraria;

public class CadrastroDeLivros {

	public static void main(String[] args) {
		
		Livro livro = new Livro();
		livro.nome = "Java 8 Prático";
		livro.descricao = "Novos recursos da Liguagem";
		livro.valor = 59.90;
		livro.isbn = "978-85-66250-46-6";
		livro.dataDeLancamento = "20/02/2020";
		
		livro.motrarDetalhes();
		
		Livro outroLivro = new Livro();
		outroLivro.nome = "Lógica de Programaçãp";
		outroLivro.descricao = "Crie seus primeiros programas";
		outroLivro.valor = 59.90;
		outroLivro.isbn = "978-85-66250-22-0";
		outroLivro.dataDeLancamento = "20/02/2020";
		
		outroLivro.motrarDetalhes();
		
	}

}
