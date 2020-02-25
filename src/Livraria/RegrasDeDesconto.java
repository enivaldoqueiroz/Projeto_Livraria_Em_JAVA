package Livraria;

public class RegrasDeDesconto {
	
	
	public static void main(String[] args) {
		
		Livro livro = new Livro();
		livro.setValor(59.90);
		
		System.out.println("Valor atual: "+ livro.getValor());
		livro.setValor(livro.getValor()-(livro.getValor() * 0.1));
		System.out.println("Valor com desconto: " + livro.getValor());
	}

}
