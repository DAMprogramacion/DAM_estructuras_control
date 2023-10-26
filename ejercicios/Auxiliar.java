public class Auxiliar {
	
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
			
			//Cambiar  sumaPares += condicion ? cierto : falso
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
}
