/*
 * Ejercicio2.java
 * Programa que lee dos argumentos, nombre y apellidos
 * y muestra por consola la siguiente salida:
 * "Hola nombre apellidos", ejemplo "Hola Juan García"
 * las comillas incluidas en el mensaje
 * 
 */


public class Ejercicio2 {
	
	public static void main (String[] args) {
		String nombre =   args[0];
		String apellido = args[1];
		
		System.out.printf("\"Hola %s %s\"%n", nombre, apellido);
	}
}

