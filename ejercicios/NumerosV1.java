/*
 * NumerosV1.java
 * Solo va a contener el método main
 * Va a llamar a los otros métodos que van a estar en otra clase
 */


public class NumerosV1 {
	
	public static void main (String[] args) {
		//Nº aleatorio entre 1 y 10
		int aleatorio = new java.util.Random().nextInt(10) + 1;
			
		System.out.println("Mostrar los nº del 1 al 10");
		Auxiliar.mostrarDel1Al10();
		System.out.println("============");
		
		System.out.println("Mostrar los nº del 20 al 80 de 5 en 5");
		Auxiliar.mostrarDel20al80De5en5();
		System.out.println("============");
		
		System.out.println("Mostrar los nº del 100 al 50 de 2 en 2");
		Auxiliar.mostrarDel100al50De2en2();
		System.out.println("============");
		
		System.out.println("Mostrar factorial de un número");
		// Ejemplo 3: 1 * 2 * 3, ejemplo 7: 1 * 2 * 3 * 4 * 5 * 6 * 7 
		Auxiliar.mostrarFactorialAleatorio(aleatorio);
		System.out.println("============");
		
		System.out.println("Mostrar suma de pares e impare por separado");
		// Ejemplo 7: 1 * 2 * 3 * 4 * 5 * 6 * 7
		//mostraría SUMA DE PARES   : 2 + 4 + 6     (Mostraría 12)
		//mostraría SUMA DE IMPARES : 1 + 3 + 5 + 7 (Mostraría 16)
		Auxiliar.mostrarSumaParesEImparesDe1AN(aleatorio);

	}
}

