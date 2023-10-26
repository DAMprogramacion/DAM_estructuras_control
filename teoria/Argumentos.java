/*
 * Argumentos.java
 * Programa que lee los argumentos que se le pasa al programa
 * En este caso se leen dos argumentos
 */


public class Argumentos {
	
	public static void main (String[] args) {
		System.out.println("Primer argumento: " + args[0]); 
		System.out.println("Segundo argumento: " + args[1]); 
		//args son cadenas NO se pueden multiplicar, tampoco funciona el casting
		//System.out.println("Multiplicación: " + (int) (args[0] * (int) args[1]));
		System.out.println("Suma: " + (args[0] + args[1])); //no se suma, se concatena

			
	}
}

