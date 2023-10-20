/*
 * GENERAMOS UN Nº ALEATORIO ENTRE 0 - 100
 * SI EL Nº ES PAR, NOS DIGA QUE ES PAR Y NOS MUESTRE EL VALOR
 * SI EL Nº ES IMPAR NO TIENE QUE DECIR NADA
 * EJEMPLO:
 * SALE 7, "NO SE INDICA NADA"
 * SALE 8, "Nº PAR: 8"
 */


public class PrimerIF {
	
	public static void main (String[] args) {
		
		int numero = new java.util.Random().nextInt(100);

		if (numero % 2 == 0) {
			System.out.println("Nº PAR: " + numero); 
		} 
		
	}
}

