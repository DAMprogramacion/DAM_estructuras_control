/*
 * EJEMPLOS DE WHILE
 */
public class While1 {
	
	public static void main (String[] args) {
		
		/*while (true) {
			System.out.println(new java.util.Random().nextInt(10));
		}*/  //bucle infinito
		
		int numero = 0;
		while (numero < 10) {
			System.out.println("Numero en el bucle: " + numero);
			numero++;
		}
		System.out.println("Numero después del bucle: " + numero);
		
	}
}

