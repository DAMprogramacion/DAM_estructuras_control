/*
 * Programa que suma los N primeros números, ejemplo:
 * N = 3, muestra en consola 6  que es el resultado de 1 + 2 + 3 
 * N = 5, muestra en consola 15 que es el resutlado de 1 + 2 + 3 + 4 + 5
 * El mensaje a mostrar sería:
 * La suma desde 0 a 3 vale 6
 * La suma desde 0 a 5 vale 15
 * Transformar el programa usando un do-while en vez de un while
 */


public class SumarNnumerosDoWhile {
	
	public static void main (String[] args) {
		//variables numero, contador, suma todas de tipo int 
		final int NUMERO = 5;
		int contador = 0;
		int suma = 0;
		
		do {
			suma += contador;
			contador++;
			System.out.println(contador);
		} while(contador <= NUMERO);
			
		
		
		/*while (contador <= numero) {
			suma = suma + contador;
			contador++;
		}*/
		
		System.out.println("La suma desde 0 a " + NUMERO + " vale " + suma);
			
	}
}
