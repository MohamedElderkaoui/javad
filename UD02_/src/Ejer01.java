
/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer01 {

	/**
	 * @param args 5.-Hacer un pseudoc�digo que imprima los n�meros impares hasta el
	 *             100 y que imprima cuantos impares hay.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i < 101; i++) {
			System.out.printf(" |%03d", i);
			if (i % 12 == 0) {
				System.out.println();
			}
		}
	}

}
