/*
 * Ejercicio4.java
 * Ejemplo de uso de Scanner
 */
import java.util.Scanner;

public class Ejercicio4  {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce un nº");
		int i = sc.nextInt();
		System.out.printf("El nº introducido es: %d%n", i);
		
		sc.close();
		
	}
}

