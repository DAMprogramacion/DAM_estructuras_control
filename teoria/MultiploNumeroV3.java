/*
 *Programa que muestra los múltiplos de un número, ejemplos:
 * NUMERO = 10 
 * Múltiplo: 1
 * Múltiplo: 2
 * Múltiplo: 5
 * Múltiplo: 10
 */


public class MultiploNumeroV3 {
	
	public static void main (String[] args) {
		
		final int NUMERO = new java.util.Random().nextInt(100_000) + 1 ;
		
		//TRANSFORMAR A DO-WHILE Y AÑADIMOS UN CONTINUE 
		/*int contador = 1;
		while (contador <= NUMERO) {
			
			if (NUMERO % contador == 0) {
				System.out.println("Múltiplo de " + NUMERO + ": " + contador);
			}
			contador++;
		}*/
		//EN CASA CONTROLAMOS QUE SOLO SEAN 10 MÚLTIPLOS LOS QUE SE MUESTREN
		int contador = 1;
		do {
			if (NUMERO % contador != 0) {
				contador++;
				continue;
			}
			System.out.println("Múltiplo de " + NUMERO + ": " + contador);
			contador++;
		} while (contador <= NUMERO);
		
		
		
		
		
	}
}
