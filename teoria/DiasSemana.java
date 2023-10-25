/*
 * DiasSemana.java
 * Programa que dado un día en entero, no dice que día de la semana es, Domingo es 0
 * Ejemplos:
 * Para 1 nos diría: "El día 1 es Lunes"
 * Para 9 nos diría: "El día 9 es Marte"
 * Para 7 nos diría: "El día 7 es Domingo"
 * Para otro valor, ejemplo 0 o nº negativo nos diría "Dato nos válido"
 */


public class DiasSemana {
	
	public static void main (String[] args) {
		
		int iDia = new java.util.Random().nextInt(100);
		System.out.println("Averiguando el día " + iDia);
		iDia %= 7;
		String sDia = "";
		
		switch (iDia) {
			
			case 0 :
				sDia = "Domingo";
				break;			
			case 1 :
				sDia = "Lunes";
				break;
			case 2 :
				sDia = "Martes";
				break;
			case 3 :
				sDia = "Miércoles";
				break;
			case 4 :
				sDia = "Jueves";
				break;
			case 5 :
				sDia = "Viernes";
				break;
			case 6 :
				sDia = "Sábado";
				break;			
			default:
				sDia = "ningún valor";
		}
		System.out.println("Corresponde a " + sDia);
		
	}
}

