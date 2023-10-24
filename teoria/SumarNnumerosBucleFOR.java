/*
 *Programa que suma los N primeros números, ejemplo:
 * N = 3, muestra en consola 6  que es el resultado de 1 + 2 + 3 
 * N = 5, muestra en consola 15 que es el resutlado de 1 + 2 + 3 + 4 + 5
 * El mensaje a mostrar sería:
 * La suma desde 0 a 3 vale 6
 * La suma desde 0 a 5 vale 15
 */


public class SumarNnumerosBucleFOR {
	
	public static void main (String[] args) {
		//variables numero, contador, suma todas de tipo int 
		final int NUMERO = 5;
		//int contador = 0; se declara dentro del bucle for
		int suma = 0;
		
		for (int contador = 0; contador <= NUMERO; contador++ ) {
			suma += contador;
		}
		
		/*while (contador <= NUMERO) 
			suma += contador++;*/
		
		System.out.println("La suma desde 0 a " + NUMERO + " vale " + suma);
			
	}
}
