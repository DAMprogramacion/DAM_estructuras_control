/*
 * EcuacionSegundoGrado.java
 *  a · x² + b · x + c = 0
 *  Cuatro métodos:
 *  1) Lea los coficientes a, b, c (NO SE HACE)
 *  2) Es resoluble cuando b² - 4 · a · c sea mayor o igual que cero 
 *  3) Nos devuelva el valor de X1 -b + Math.sqrt .....
 *  4) Nos devuelva el valor de X2 -b - Math.sqrt ......
 *  
 * 
 */


public class EcuacionSegundoGrado {
	
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
