import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer09 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclados = new Scanner(System.in);
		/**
		 * 9) Realizar un algoritmo que dado un n�mero entero, visualice en pantalla si
		 * es par o impar. (la funci�n MOD o % da el resto de dividir A entre B; A MOD B
		 * � A % B)
		 */
		int num1 = teclados.nextInt();
		boolean b = num1 % 2 == 0;
		String string = num1 + " es par";
		String string2 = num1 + " no es par";
		System.out.println(/*SI*/b ?//
				      string //A ES PAR
				://SINO
					string2);
		teclados.close();

	}

}
