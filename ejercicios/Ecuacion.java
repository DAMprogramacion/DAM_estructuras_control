/* Clase Ecuacion con tres métodos:
 * Leer los coeficientes
 * Método boolean que nos dices si se puede resolver o NO
 * Método que muestra los resultado en caso que sea resoluble
 */
 import java.util.Scanner;

 public class Ecuacion {
	 
	static Scanner sc = new Scanner(System.in);
		
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
	 
		public static void cerrarScaner() {
			sc.close();
		}
	 }
