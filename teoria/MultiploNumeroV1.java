/*
 *Programa que muestra los múltiplos de un número, ejemplos:
 * NUMERO = 10 
 * Múltiplo: 1
 * Múltiplo: 2
 * Múltiplo: 5
 * Múltiplo: 10
 */


public class MultiploNumeroV1 {
	
	public static void main (String[] args) {
		
		final int NUMERO = new java.util.Random().nextInt(100_000) + 1 ;
		int contador = 1;
		
		while (contador <= NUMERO) {
			
			if (NUMERO % contador == 0) {
				System.out.println("Múltiplo de " + NUMERO + ": " + contador);
			}
			contador++;
		}
		
	}
}

