package Livraria;

public class Autor {
	
	String nome;
	String email;
	String cpf;
	
	void motrarDetalhes() {
		System.out.println(">>Mostrando detalhes do autor ");
		System.out.println("Nome: " + nome);
		System.out.println("Email: " + email);
		System.out.println("CPF: " + cpf);
	}

}
