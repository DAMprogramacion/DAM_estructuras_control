/*
 * GENERAMOS UN Nº ALEATORIO ENTRE 0 - 100
 * SI EL Nº ES MÚLTIPLO DE TRES, NOS DIGA QUE ES MÚLTIPLO Y NOS MUESTRE EL VALOR
 * SI EL Nº NO ES MÚLTIPLO DE TRES, QUE DIGA QUE NO LO ES Y MUESTRE EL VALOR
 * EJEMPLO:
 * SALE 6, "El nº 6 es múltiplo de 3"
 * SALE 8, "El nº 8 no es múltiplo de 3"
 */


public class  SegundoIF {
	
	public static void main (String[] args) {
		
		int numero = new java.util.Random().nextInt(100);
		
		if (numero % 3 == 0) {
			System.out.println("El nº " + numero + " es múltiplo de 3");
		} else {
			System.out.println("El nº " + numero + " NO es múltiplo de 3");
		}
		
		
	}
}
