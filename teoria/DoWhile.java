/*
 *EJEMPLO SENCILLO DE DO WHILE
 * muestra los nº desde el 1 al 9
 * 
 */


public class DoWhile {
	
	public static void main (String[] args) {
		
		int contador = 1;
		
		do {
			
			System.out.println(contador);
			contador++;
			
		} while (contador < 10);
		
		System.out.println("Contador después del bucle: " + contador);
		
		
	}
}

