/*
 ESTRUCTURAS DE CONTROL
 */


public class CalcularAreaCirculo {
	
	public static void main (String[] args) {
		int radio = 57;
		mostrarAreaCirculo (radio);
		
		radio = 12;
		mostrarAreaCirculo(radio);
		
		radio = -12;
		mostrarAreaCirculo(radio);
	
	}

	public static void mostrarAreaCirculo (int radio) {
		if (radio > 0) {
			double area = Math.pow(radio, 2) * Math.PI;
			System.out.println("El área de un círculo de radio " + radio +
					" vale " + area + '\n');
		} else {
			System.out.println("Radio no válido: " + radio + '\n');
		}
	}
}

