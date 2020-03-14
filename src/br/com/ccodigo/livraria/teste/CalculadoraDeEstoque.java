package br.com.ccodigo.livraria.teste;

public class CalculadoraDeEstoque {
	public static void main(String[] args) {
		
		//Variaveis
		
		double livroJava8 = 59.90;
		double livroTDD = 59.90;
		
		double soma = livroJava8 + livroTDD;
		
		System.out.println("O total em estoque é "+ soma);
		
		if (soma < 150) {
			System.out.println("Seu estoque está muito baixo!");
		}else if(soma >= 2000){
			System.out.println("Seu estoque está muito alto!");
		}else {
			System.out.println("Seu estoque está bom!");
		}
		
		/* Casting de valores
		 * 
		double livroJava8 = 59.90;
		double livroTDD = 59.90;
		
		int numeroInteliro = (int) livroJava8;
		System.out.println("Casting "+ numeroInteliro);
		
		*/
		
		
		
	}

}
