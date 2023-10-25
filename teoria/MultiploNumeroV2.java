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
		int contadorMultiplos = 0;
		System.out.println("MÚLTIPLOS DEL NÚMERO (max 10): " + NUMERO);
		System.out.println("------------------------------");
		
		//añadir código para que se cumpla
		for (int i = 1; i <= NUMERO; i++) {
			if (NUMERO % i == 0) {
				System.out.println("Múltiplo de " + NUMERO + ": " + i);
				contadorMultiplos++;
			}
			if (contadorMultiplos == 10) {
				break;
			}
		}
		
		if (contadorMultiplos == 2)
			System.out.println(NUMERO + " es un nº primo");
		
		
		/*while (contador <= NUMERO) {
			
			if (NUMERO % contador == 0) {
				System.out.println("Múltiplo de " + NUMERO + ": " + contador);
			}
			contador++;
		}*/
		
	}
}
