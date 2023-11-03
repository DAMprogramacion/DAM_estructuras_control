/*
 * TestEcuacionSegundoGrado.java
 * usando métodos estáticos de la clase EcuacionSegundoGrado
 * MUESTRA CONSOLA
 *  No tiene soluciones reales 
 *  Tiene soluciones reales:
 *      X1 = ....
 *      X2 = .... 
 */
import java.util.Scanner;

public class TestEcuacionSegundoGradoV2 {
	
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
		if (EcuacionSegundoGrado.esResoluble(a, b, c)) {
			System.out.println("No tiene soluciones reales");
		} else {
			System.out.println("Tiene soluciones reales");
			double x1 = EcuacionSegundoGrado.calcularX1(a, b, c); 
			double x2 = EcuacionSegundoGrado.calcularX2(a, b, c); 
			System.out.printf("X1 = %.3f%n", x1);
			System.out.printf("X2 = %.3f%n", x2);
		}
	}

	
}







