package ejercicio3;

public class Ejercicio3 {
	public static void main(String[] args) {
		
		String [] nombres= {"Maria", "Juan", "Marcos", "Laura"};
		String resultado = "";
		
		for(int i = 0; i < nombres.length; i++) {
			resultado += nombres[i];
			System.out.println(resultado);
		}
		System.out.println(resultado);
	}
}
