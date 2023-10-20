/*
 *Programa que suma los N primeros números, ejemplo:
 * N = 3, muestra en consola 6  que es el resultado de 1 + 2 + 3 
 * N = 5, muestra en consola 15 que es el resutlado de 1 + 2 + 3 + 4 + 5
 * El mensaje a mostrar sería:
 * La suma desde 0 a 3 vale 6
 * La suma desde 0 a 5 vale 15
 */


public class SumarNnumeros {
	
	public static void main (String[] args) {
		//variables numero, contador, suma todas de tipo int 
		final int numero = 5;
		int contador = 0;
		int suma = 0;
		while (contador <= numero) {
			suma = suma + contador;
			contador++;
		}
		System.out.println("La suma desde 0 a " + numero + " vale " + suma);
			
	}
}

