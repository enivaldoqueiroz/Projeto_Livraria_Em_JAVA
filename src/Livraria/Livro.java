package Livraria;

public class Livro {
 
	String nome;
	String descricao;
	double valor;
	String isbn;
	String dataDeLancamento;
	Autor autor;
	
	public Livro() {
		System.out.println("Novo livro criado");
	}
	
	
	void motrarDetalhes() {
		String mensagem = ">>Mostrando detalhes do livro ";
		System.out.println(mensagem);
		System.out.println("Nome: " + nome);
		System.out.println("Descrição: " + descricao);
		System.out.println("Valor: " + valor);
		System.out.println("ISBN: " + isbn);
		System.out.println("Data de Lançamento: " + dataDeLancamento);
		
		if (this.temAutor()) {
			autor.motrarDetalhes();
		}
			
				
		System.out.println("--");
	}
	
	boolean temAutor() {
		
		return this.autor != null;
	}

	public void aplicarDescontoDe(double porcentagem) {
		System.out.println("Valor atual: " + this.valor);
		if (porcentagem > 0.3) {
			System.out.println("Desconto não pode ser maior do que 30%");
		} else {
			this.valor -= this.valor * porcentagem;
			System.out.println("Valor com desconto: " + this.valor);
			System.out.println(" ");
		}
		
	}
	
	
}
