/*
 * Numeros.java
 */


public class Numeros {
	
	public static void main (String[] args) {
		
		//Nº aleatorio entre 1 y 10
		int aleatorio = new java.util.Random().nextInt(10) + 1;
			
		System.out.println("Mostrar los nº del 1 al 10");
		mostrarDel1Al10();
		System.out.println("============");
		
		System.out.println("Mostrar los nº del 20 al 80 de 5 en 5");
		mostrarDel20al80De5en5();
		System.out.println("============");
		
		System.out.println("Mostrar los nº del 100 al 50 de 2 en 2");
		mostrarDel100al50De2en2();
		System.out.println("============");
		
		System.out.println("Mostrar factorial de un número");
		// Ejemplo 3: 1 * 2 * 3, ejemplo 7: 1 * 2 * 3 * 4 * 5 * 6 * 7 
		mostrarFactorialAleatorio(aleatorio);
		System.out.println("============");
		
		System.out.println("Mostrar suma de pares e impare por separado");
		// Ejemplo 7: 1 * 2 * 3 * 4 * 5 * 6 * 7
		//mostraría SUMA DE PARES   : 2 + 4 + 6     (Mostraría 12)
		//mostraría SUMA DE IMPARES : 1 + 3 + 5 + 7 (Mostraría 16)
		mostrarSumaParesEImparesDe1AN(aleatorio);
		System.out.println("============");
	
		System.out.println("Sumamos los cuadrados hasta N, ejemplo 1² + 2² + ... + N²");
		mostrarSumaCuadrados(aleatorio);

	}

	public static void mostrarDel1Al10() {
		int contador = 1;
		do {
			System.out.println(contador++);
		} while (contador <= 10);
	}
	public static void mostrarDel20al80De5en5() {
		int contador = 20;
		while (contador <= 80) {
			System.out.println(contador);
			contador += 5;
		}
	}
	public static void mostrarDel100al50De2en2() {
		for (int i = 100 ; i >= 50 ; i -=  2 ) 
			System.out.println(i);
	}
	public static void mostrarFactorialAleatorio(int aleatorio) {
		int contador = 1;
		int multiplicacion = 1;
		do {
			multiplicacion *= contador++;
			
		} while (contador <= aleatorio) ;
		System.out.printf("Factorial de %d vale %d%n", aleatorio, multiplicacion);
	}
	public static void mostrarSumaParesEImparesDe1AN(int aleatorio) {
		int sumaPares   = 0;
		int sumaImpares = 0;
		for (int i = 0; i <= aleatorio; i++) {
			
			//si i es par sumamos en sumaPares, sino en sumaImpares
			if (i % 2 == 0) {
				sumaPares += i;
			} else {
				sumaImpares += i;
			}
		}
		System.out.printf("SUMA PARES DE 1 A %d: %d%n", aleatorio, sumaPares);
		System.out.printf("SUMA IMPARES: 1 A %d: %d%n", aleatorio, sumaImpares);
	}
	public static void mostrarSumaCuadrados(int aleatorio) {
		int contador = 1;
		int suma = 0;
		while ( contador <= aleatorio) {
			suma = suma + contador * contador;
			contador++;
		}
		System.out.printf("La suma de los cuadrados hasta %d vale %d%n",
								aleatorio, suma);
	}
}

