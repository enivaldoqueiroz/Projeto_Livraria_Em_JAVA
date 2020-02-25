package Livraria;

public class Livro {
 
	String nome;
	String descricao;
	double valor;
	String isbn;
	String dataDeLancamento;
	
	void motrarDetalhes() {
		String mensagem = "Mostrando detalhes do livro ";
		System.out.println(mensagem);
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);
		System.out.println("Data de Lançamento: " + dataDeLancamento);
		System.out.println("--");
	}
}
