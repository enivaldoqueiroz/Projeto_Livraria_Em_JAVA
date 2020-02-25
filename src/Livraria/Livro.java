package Livraria;

public class Livro {
 
	private String nome;
	private String descricao;
	private double valor;
	private String isbn; 
	private String dataDeLancamento;
	private Autor autor;
	
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
	
	
	public double getValor() {
		return valor;
	}
	
	public void setValor(double valor) {
		this.valor = valor;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	 
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
		
	}
	
	public String getIsbn() {
		return isbn;
	}
	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}
	
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
}