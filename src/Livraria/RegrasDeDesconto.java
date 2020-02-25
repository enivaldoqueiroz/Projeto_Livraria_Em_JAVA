package Livraria;

public class RegrasDeDesconto {
	
	
	public static void main(String[] args) {
		
		Livro livro = new Livro();
		livro.valor = 59.90;
		
		System.out.println("Valor atul: "+ livro.valor);
		livro.valor -= livro.valor * 0.4;
		System.out.println("Valor com desconto: " + livro.valor);
	}

}
