/*
 * Ejercicio2V1.java
 * Programa que lee dos argumentos, nombre y apellidos
 * y muestra por consola la siguiente salida:
 * "Hola nombre apellidos", ejemplo "Hola Juan García"
 * las comillas incluidas en el mensaje
 * Refactorizamos y aseguramos el anterior
 * 
 */


public class Ejercicio2V1 {
	
	public static void main (String[] args) {
		
		if (args.length >= 2) { //necesitamos MÍNIMO 2 argumentos		
			System.out.printf("\"Hola %s %s\"%n", args[0], args[1]);
			//System.out.println('"' + "Hola " + args[0] + ' ' + args[1] + '"');
		} else {
			System.out.println("Faltan argumentos");
		}
	}
}

