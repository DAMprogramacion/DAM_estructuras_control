/*
 * TestEcuacionSegundoGrado.java
 * usando métodos estáticos
 * MUESTRA CONSOLA
 *  No tiene soluciones reales 
 *  Tiene soluciones reales:
 *      X1 = ....
 *      X2 = .... 
 */
import java.util.Scanner;

public class TestEcuacionSegundoGradoV1 {
	
	public static void main (String[] args) {
		//hay que llamar a los métodos que están definidos en EcuacionSegundoGrado.java
		//LEER LOS COEFICIENTES a, b, c, usamos un Scanner
		Scanner sc = new Scanner(System.in);
		System.out.println("Introduce el valor del coeficiente a");
		double a = sc.nextDouble();
		System.out.println("Introduce el valor del coeficiente b");
		double b = sc.nextDouble();
		System.out.println("Introduce el valor del coeficiente c");
		double c = sc.nextDouble();
		sc.close();
		
		//VERIFICAR QUE ES RESOLUBLE   b² - 4 · a · c >= 0
		if (esResoluble(a, b, c)) {
			System.out.println("No tiene soluciones reales");
		} else {
			System.out.println("Tiene soluciones reales");
			double x1 = calcularX1(a, b, c); 
			double x2 = calcularX2(a, b, c); 
			System.out.printf("X1 = %.3f%n", x1);
			System.out.printf("X2 = %.3f%n", x2);
		}
	}

	public static double calcularX2(double a, double b, double c) {
		double x2 = -b - Math.sqrt(b * b - 4 * a * c) / ( 2 * a);
		return x2;
	//	System.out.println(x2); sentencia inalcanzable
	}
	public static double calcularX1(double a, double b, double c) {
		//double x2 = -b + Math.sqrt(b * b - 4 * a * c) / ( 2 * a);
		return -b + Math.sqrt(b * b - 4 * a * c) / ( 2 * a);
	}
	public static boolean esResoluble(double a, double b, double c) {
		return b * b - 4 * a * c < 0;
	}
}







