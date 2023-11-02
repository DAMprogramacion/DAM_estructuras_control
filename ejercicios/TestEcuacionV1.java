/*
 * TestEcuacion.java
 * 
 * Clase que solicita los valores de a, b, c, d, e, f
 * Son los coeficientes de las ecuaciones
 * Usamos la clase Scanner
 * Tipos de datos: double
 * REFACTORIZACIÓN
 */
import java.util.Scanner;

public class TestEcuacionV1 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		double a = leerCoeficientes();
		double b = leerCoeficientes();
		double c = leerCoeficientes();
		double d = leerCoeficientes();
		double e = leerCoeficientes();
		double f = leerCoeficientes();
		sc.close();
		
		System.out.printf("RESOLVIENDO SISTEMAS DE ECUACIONES%n%.2f · X + %.2f · Y = %.2f%n%.2f · X + %.2f · Y = %.2f%n",
					a, b, e, c, d, f);
		if ( noEsResoluble(a, d, b, c) ) {
			//no se puede resolver 
			System.out.println("No es resoluble la ecuación");
		} else {
			//se resuelve, mostramos X e Y
			mostrarSoluciones (a, b, c, d, e, f);
		}
		
	}
	
	public static double leerCoeficientes () {
		
		System.out.println("Introduce valor coeficiente");
		double coeficiente = sc.nextDouble();
		
		return coeficiente;
	}	
	
	public static boolean noEsResoluble (double a, double d, double b, double c) {
		boolean resoluble = a * d - b * c  == 0;
		return resoluble;
	}	
		
	public static void mostrarSoluciones (double a, double b, double c, double d,
					double e, double f) {
		
			System.out.println("Ecuación resoluble, soluciones:");
			double x = (e * d - b * f) / (a * d -b * c); 
			double y = (a * f - e * c) / (a * d -b * c);
			System.out.printf("X = %.2f%nY = %.2f%n", x, y);
	}	
		
		
		
		
		
}

