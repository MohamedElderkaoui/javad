/**
 * 
 */

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer02 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int cont =0;
		for (int i = 100; i >0; i-=1) {
			System.out.printf(" |%03d", i);
			cont++;
			if (cont%15==0) {
				System.out.println();
			}
		}
	}

}
