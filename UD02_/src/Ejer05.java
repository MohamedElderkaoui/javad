/**
 * 
 */

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer05 {

	/**
	 * @param args 5.-Hacer un pseudocódigo que imprima los números impares hasta el
	 *             100 y que imprima cuantos impares hay.
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mut = 0;
		for (int i = 0; i < 101; i++) {
			if (i % 2 == 0) {
				mut++;
			}
		}
		System.out.printf("mate %2d", mut);
	}

}
