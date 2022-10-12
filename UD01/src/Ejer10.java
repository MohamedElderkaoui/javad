import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer10 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclados = new Scanner(System.in);
		/**
		 * 10) Modificar el algoritmo anterior, de forma que si se teclea un cero, se
		 * vuelva a pedir el número por teclado (así hasta que se teclee un número mayor
		 * que cero) (recuerda la estructura mientras).
		 */
		System.out.println("introduce num1");
		int num1 = teclados.nextInt();
//		System.out.println("introduce num2");
		int num2 =2;
//		while ((num1<=0)) {
//			System.err.println(" num1 debe ser mayor que 0");
//			System.out.println("introduce num1");
//			num1 = teclados.nextInt();
//		}
		do {
			
			System.out.println("introduce num1");
			num1 = teclados.nextInt();
			if ((num1 <= 0)) {
				System.err.println(" num1 debe ser mayor que 0");
			}
		} while ((num1<=0));
		boolean b = num1 % num2 == 0;
		String string = num1 + " es diviser de"+num2;
		String string2 = num1 + " no es diviser de"+num2;
		System.out.println(/* SI */b ? //
				string // A ES PAR
				: // SINO
				string2);
		teclados.close();

	}

}
