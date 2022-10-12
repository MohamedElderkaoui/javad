/**
 * 
 */

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer_triangulo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 4;
		String cardena[] = new String[num];
		cardena[0] = "*";
		for (int i = 1; i < cardena.length; i++) {
			cardena[i] = cardena[i - 1] + " *";

		}
		for (int i = 0; i < cardena.length; i++) {

			System.out.println(cardena[i].toString());

		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		for (int i = cardena.length - 1; i > -1; i--) {

			System.out.println(cardena[i]);

		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		for (int i = 0; i < cardena.length; i++) {
			
			System.out.printf("%8s\n",cardena[i].toString());
			
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		for (int i = cardena.length - 1; i > -1; i--) {
			
			System.out.printf("%8s\n",cardena[i].toString());
			
			
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		for (int i = cardena.length - 1; i > -1; i--) {
		
			System.out.printf("%s",cardena[i].toString());System.out.print(" ");	System.out.printf("%s\n",cardena[ cardena.length-1-i]);
			
			
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();

	}

}
