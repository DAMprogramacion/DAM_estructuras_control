/*
 * Ejercicio4.java
 */
import java.util.Scanner;

public class Ejercicio4V1  {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//LEEMOS DOS Nº ENTEROS:
		System.out.println("Introduce dos valores enteros comprendidos entre 1 y 10");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		System.out.printf("Introducido los valores %d y %d%n", numero1, numero2);
		
		
		//SI ALGÚN VALOR NO ESTÁ COMPRENDIDO ENTRE 1 Y 10, EL PROGRAMA ACABA
		if (numero1 < 1 || numero1 > 10 || numero2 < 1 || numero2 > 10) { //caso NO válido 
			System.out.printf("Los valores %d y %d no pueden ser procesados.%n", 
								numero1, numero2);
		} else {
			System.out.printf(" Procesando los valores %d y %d%n", 
								numero1, numero2);
			System.out.println("=============================\n");
			//MOSTRAR EL MENÚ Y ASIGNAR A UNA VARIABLE int opcion
			System.out.println("1) Sumar los dos valores");
			System.out.println("2) Restar los dos valores");
			System.out.println("3) Multiplicar los dos valores");
			System.out.println("4) Didivir los dos valores");
			System.out.println("5) Salir");
			System.out.println("Elige opción [1-5]");
			int opcion = sc.nextInt();					
		}
		sc.close();
	}
}

