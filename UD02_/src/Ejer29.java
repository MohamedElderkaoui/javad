
/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer29 {
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		/**
		 * 29.-Simular cien tiradas de dos dados y contar las veces que entre los dos
		 * suman 10.
		 */
		int punto_10 = 0;
		for (int i = 1; i <= 100; i++) {
			int dado1 = (int) (Math.random() * 6 + 1);
			int dado2 = (int) (Math.random() * 6 + 1);
			int suma = dado1 + dado2;
			System.out.printf("%d+%d=%d\n", dado1, dado2, suma);
			Thread.sleep(1000);
			if (suma == 10) {
				punto_10++;
			}
		}
		System.out.printf("as %-3d que entre los dos con 10", punto_10);
	}
}
