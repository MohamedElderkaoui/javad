/**
 * 
 */

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer03 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 100; i >-0; i-=1) {
			if (i%2==0) {
				System.out.printf(" |%3d", i);
			}
			if (i % 10 == 1) {
				System.out.println();
			} 
		}
	}

}
