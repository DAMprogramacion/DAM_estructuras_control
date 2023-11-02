/*
 * Ejercicio6.java
 * Controlamos el nº columnas, debe estar comprendido
 * entre y 22, de esa forma no se juntas los números
 * Controlamos el nº, debe ser positivo y menor que 10_000
 * El programa se debe ejecutar, debe mostrar números
 */
import java.util.Scanner;

public class Ejercicio6V1 {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int columnas =  0;
		do { //SE ESTÁ REPITIENDO SI Nº COLUMNAS NO ESTÁ COMPRENDIDA ENTRE 1 Y 22
			System.out.println("Introduce nº de columnas");
			columnas = sc.nextInt();
		} while(columnas < 1 || columnas > 22);
		
		int numero = 0;
		do {
			System.out.println("Introduce número");
			numero = sc.nextInt();
		} while (numero < 1 || numero >= 10_000);
		
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

