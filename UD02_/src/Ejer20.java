
/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer20 {
//Factorial de un número
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long factorial = 1, n = -1, apoyo;
//		n = Leer.entero("Dame el número para calcular su factorial");	
		do{
			n =Utilidad.leer().leerEntero("Dame el número para calcular su factorial");	
		}while (n < 0) ;
		apoyo = n;
		do{
			factorial = factorial * apoyo;
			apoyo = apoyo - 1;
		}while (apoyo > 0) ; System.out.println("El factorial de " + n + " es " + factorial);
	}

}
