/*
 *Programa que muestra como máximo 10 múltiplos de un número, ejemplos:
 * NUMERO = 10 
 * Múltiplo: 1
 * Múltiplo: 2
 * Múltiplo: 5
 * Múltiplo: 10
 */


public class MultiploNumeroV2 {
	
	public static void main (String[] args) {
		
		final int NUMERO = new java.util.Random().nextInt(100_000) + 1 ;
		int contador = 1;
		
		//añadir código para que se cumpla
		while (contador <= NUMERO) {
			
			if (NUMERO % contador == 0) {
				System.out.println("Múltiplo de " + NUMERO + ": " + contador);
			}
			contador++;
		}
		
	}
}
