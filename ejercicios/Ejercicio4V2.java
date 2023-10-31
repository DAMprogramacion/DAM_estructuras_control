/*
 * Ejercicio4.java
 * Refactorización
 */
import java.util.Scanner;

public class Ejercicio4V2  {
	
	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//LEEMOS DOS Nº ENTEROS:
		System.out.println("Introduce dos valores enteros comprendidos entre 1 y 10");
		int numero1 = sc.nextInt();
		int numero2 = sc.nextInt();
		System.out.printf("Introducido los valores %d y %d%n", numero1, numero2);
		
		
		//SI ALGÚN VALOR NO ESTÁ COMPRENDIDO ENTRE 1 Y 10, EL PROGRAMA ACABA
		if (numero1 < 1 || numero1 > 10 || numero2 < 1 || numero2 > 10) { //casos NO válido 
			System.out.printf("Los valores %d y %d no pueden ser procesados.%n", 
								numero1, numero2);
			System.exit(1); //TERMINACIÓN DEL PROGRAMA CON CÓDIGO 1
		} 
		
		System.out.printf(" Procesando los valores %d y %d%n", 
							numero1, numero2);
		System.out.println("=============================\n");
		//MOSTRAR EL MENÚ Y ASIGNAR A UNA VARIABLE int opcion
		int opcion = 0;
		//StringBlocks
		String menu = """  
				1) Sumar los dos valores
				2) Restar los dos valores
				3) Multiplicar los dos valores
				4) Didivir los dos valores
				5) Salir
				Elige opción [1-5]""";
		do {
			System.out.println(menu);
			opcion = sc.nextInt();
			switch(opcion) {
				case 1 -> System.out.printf("%d + %d = %d%n%n",
							numero1, numero2, numero1 + numero2);
				case 2 -> System.out.printf("%d - %d = %d%n%n",
							numero1, numero2, numero1 - numero2);	
				case 3 -> System.out.printf("%d x %d = %d%n%n",
							numero1, numero2, numero1 * numero2);
				case 4 -> System.out.printf("%d / %d = %d%n%n",
							numero1, numero2, numero1 / numero2);
				case 5 -> System.out.println("Fin de programa");			
				default-> System.out.println("Operación no válida");											
			}					
		 } while (opcion != 5);
		 sc.close();
	}
}
