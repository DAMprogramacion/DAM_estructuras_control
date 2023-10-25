/*
 * Programa que nos muestra en consola si es lectivo o no un día de la semana
 * Ejemplo 0 (Domingo) 0 no es lectivo
 * Ejemplo 6 (Sábado)  6 no es lectivo
 * Ejemplo 7 (Lunes)   7 es lectivo
 * Ejemplo -1         -1 valor no válido
 */


public class Laborables {
	
	public static void main (String[] args) {
		
		int iDia = new java.util.Random().nextInt(100);
		System.out.println("Averiguando el día " + iDia);
		iDia %= 7;
		
		switch (iDia) {
			case 1, 2, 3, 4, 5 :
				System.out.println(iDia + " es lectivo");
				break;
			case 0, 6:
				System.out.println(iDia + " NO es lectivo");
				break;
			default:
				System.out.println(iDia + " no válido");
		}
		
	}
}

