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
		System.out.println("MÚLTIPLOS DEL NÚMERO (max 10): " + NUMERO);
		System.out.println("------------------------------");
		
		//TRANSFORMAR A DO-WHILE Y AÑADIMOS UN CONTINUE 
		/*int contador = 1;
		while (contador <= NUMERO) {
			
			if (NUMERO % contador == 0) {
				System.out.println("Múltiplo de " + NUMERO + ": " + contador);
			}
			contador++;
		}*/
		//EN CASA CONTROLAMOS QUE SOLO SEAN 10 MÚLTIPLOS LOS QUE SE MUESTREN
		int contador = 1, contadorMultiplos = 0;
		do {
			if (NUMERO % contador != 0) { //se controlan los NO múltiplos
				contador++;
				continue;
			} //A partir de aquí aparecen los múltiplos
			System.out.println("Múltiplo de " + NUMERO + ": " + contador);
			contador++;
			contadorMultiplos++;
			if (contadorMultiplos == 10)
				break;
		} while (contador <= NUMERO);
		
		
		
		
		
	}
}
