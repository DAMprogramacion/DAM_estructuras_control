/*
 * TestEcuacion.java
 * 
 * Clase que solicita los valores de a, b, c, d, e, f
 * Son los coeficientes de las ecuaciones
 * Usamos la clase Scanner
 * Tipos de datos: double
 * REFACTORIZACIÓN, con métodos definidios en la clase Ecuación
 */

public class TestEcuacionV2 {

	
	public static void main (String[] args) {
		
		double a = Ecuacion.leerCoeficientes();
		double b = Ecuacion.leerCoeficientes();
		double c = Ecuacion.leerCoeficientes();
		double d = Ecuacion.leerCoeficientes();
		double e = Ecuacion.leerCoeficientes();
		double f = Ecuacion.leerCoeficientes();
		Ecuacion.cerrarScaner();

		System.out.printf("RESOLVIENDO SISTEMAS DE ECUACIONES%n%.2f · X + %.2f · Y = %.2f%n%.2f · X + %.2f · Y = %.2f%n",
					a, b, e, c, d, f);
		if ( Ecuacion.noEsResoluble(a, d, b, c) ) {
			//no se puede resolver 
			System.out.println("No es resoluble la ecuación");
		} else {
			//se resuelve, mostramos X e Y
			Ecuacion.mostrarSoluciones (a, b, c, d, e, f);
		}
		
	}
	
	
		
		
		
		
		
}

