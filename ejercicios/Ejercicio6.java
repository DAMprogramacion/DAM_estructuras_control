/*
 * Ejercicio6.java
 * 
 */
import java.util.Scanner;

public class Ejercicio6 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce nº de columnas");
		int columnas = sc.nextInt();
		System.out.println("Introduce número");
		int numero = sc.nextInt();
		System.out.println();
		sc.close();
		
		for (int i = 1; i <= numero; i++) {
			System.out.printf("%5d",i);
			if (i % columnas == 0) {
				System.out.println();
			}
		}
		System.out.println();
	
		
	}
}

