package Livraria;

@FunctionalInterface
public interface Promocional {
	
	boolean aplicarDescontoDe(double porcentagem);
	
	default boolean aplicarDescontoDe10Porcento() {
		return aplicarDescontoDe(0.1);
	}

}
