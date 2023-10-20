/*
 * PROGRAMA QUE NOS DICE SI UN NÚMERO ES MÚLTIPLO DE 6, 2, 3 ó NINGUNO
 * EJEMPLO:
 * 6 es múltiplo de 2 y 3
 * 4 es múltiplo de 2
 * 9 es múltiplo de 3
 * 11 no es múltiplo de 2 y 3
 * 0 no es evaluable
 */


public class Multiplos2y3 {
	
	public static void main (String[] args) {
		int numero =  new java.util.Random().nextInt(100);
		//numero = 0;  para prueba
		
		if (numero == 0) {
			System.out.println(numero + " no es evaluable");
		} else if (numero % 3 == 0 && numero % 2 == 0) { //mejor (numero % 6 == 0)
			System.out.println(numero + " es múltiplo de 2 y 3");
		} else if (numero % 2 == 0) {
			System.out.println(numero + " es múltiplo de 2");
		} else if (numero % 3 == 0) {
			System.out.println(numero + " es múltiplo de 3");
		} else {
			System.out.println(numero + " NO es ni múltiplo de 2 ni de 3");
		}
	}
}

