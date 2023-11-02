/*
 * TestEcuacion.java
 * 
 * Clase que solicita los valores de a, b, c, d, e, f
 * Son los coeficientes de las ecuaciones
 * Usamos la clase Scanner
 * Tipos de datos: double
 */
import java.util.Scanner;

public class TestEcuacion {
	
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Introduce valor coeficiente a");
		double a = sc.nextDouble();
		System.out.println("Introduce valor coeficiente b" );
		double b = sc.nextDouble();
		System.out.println("Introduce valor coeficiente c");
		double c = sc.nextDouble();
		System.out.println("Introduce valor coeficiente d");
		double d = sc.nextDouble();
		System.out.println("Introduce valor coeficiente e");
		double e = sc.nextDouble();
		System.out.println("Introduce valor coeficiente f");
		double f = sc.nextDouble();
		
		System.out.printf("\nRESOLVIENDO SISTEMAS DE ECUACIONES%n%.2f · X + %.2f · Y = %.2f%n%.2f · X + %.2f · Y = %.2f%n",
					a, b, e, c, d, f);
					
		if (a * d - b * c  == 0) {
			//no se puede resolver 
			System.out.println("No es resoluble la ecuación");
		} else {
			//se resuelve, mostramos X e Y
			System.out.println("Ecuación resoluble, soluciones:");
			double x = (e * d - b * f) / (a * d -b * c); 
			double y = (a * f - e * c) / (a * d -b * c);
			System.out.printf("X = %.2f%nY = %.2f%n", x, y);
		}
		
	}
	
		
		
		
		
		
		
		
		
		
}

