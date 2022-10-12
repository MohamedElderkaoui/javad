/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer42 {
	/**
	 * @param args
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws InterruptedException {
		double prer[][][] = new double[3][12][4];
		double prer2[][] = new double[3][12];
		int tam[][][] = new int[3][12][4];
		for (int i = 0; i < prer.length; i++) {
			for (int j = 0; j < prer[i].length; j++) {
				for (int k = 0; k < prer[i][j].length; k++) {
					prer[i][j][k] = ((Math.random() * 100));
					tam[i][j][k] = (String.format("%4.2f", (prer[i][j][k])).length());
				}
			}
		}
		for (int i = 0; i < prer.length; i++) {
			for (int j = 0; j < prer[i].length; j++) {
				for (int k = 0; k < prer[i][j].length; k++) {
					double pros = prer[i][j][k];
					System.out.printf(" %" + (10 - tam[i][j][k] / 2) + "s€;",
							(String.format("%4.2f", (prer[i][j][k]))));
					Thread.sleep(1000);
				}
				p();
			}
			System.out.println("===================================================================");
			System.out.println("===================================================================");
		}
		for (int i = 0; i < prer.length; i++) {
			for (int j = 0; j < prer[i].length; j++) {

				prer2[i][j] = Leer.misuma(prer[i][j]);
				System.out.printf(" %" + (10 - (String.format("%4.2f", (prer2[i][j])).length()) / 2) + "s�;",
						(String.format("%04.2f", (prer2[i][j]))));
			}
			p();
		}
	}

	/**
	 * 
	 */
	public static void p() {
		System.out.println();
	}
}
