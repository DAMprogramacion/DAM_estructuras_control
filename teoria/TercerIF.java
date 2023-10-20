/*
 * GENERAMOS UN Nº ALEATORIO ENTRE 0 - 100
 * SI EL Nº ES MENOR QUE 14, NOS DIGA QUE CON ESA EDAD NO ES IMPUTALBE
 * SI EL Nº ES MAYOR O IGUAL QUE 14 Y MENOR QUE 18, QUE DIGA QUE CON ESA EDAD SE LE APLICA LA LEY DEL MENOR
 * SI ES MAYOR DE EDAD, QUE DIGA QUE PUEDE IR A LA CÁRCEL, A MENOS QUE TENGAS 80 AÑOS O MÁS
 * EJEMPLO;
 * SALE 6, "Con 6 años no eres imputable"
 * SALE 16, "Con 16 años se aplica la ley del menor"
 * SALE 26, "Con 26 años se puede terminar en la cárcel"
 * SALE 92, "Con 92 años te libras de la cárcel"
 */


public class  TercerIF {
	
	public static void main (String[] args) {
		
		int numero = new java.util.Random().nextInt(100);
		
		if (numero < 14) {
			System.out.println("Con " + numero +  " años no eres imputable");
		} else if (numero >= 14 && numero < 18) {
			System.out.println("Con " + numero +  " años se aplica la ley del menor");
		} else if (numero >= 18 && numero < 80){
			System.out.println("Con " + numero +  " años se puede terminar en la cárcel");
		} else {
			System.out.println("Con " + numero +  " años te libras de la cárcel");
		}
		
		
		
	}
}
