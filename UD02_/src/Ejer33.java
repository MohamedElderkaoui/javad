/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer33 {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =Leer.leerEntero("num:");
		System.out.println(Leer.esPrimo(num)?"es primo":"esno primo");
		if (Leer.esPrimo(num)) {
			System.out.println(Leer.esPrimo(num)?"es primo":"es primo");
			System.out.printf("%d!=%d", num,Leer.miFactorial(num));
			Leer.tablaMultiplicar(num);
		}

	}

}
