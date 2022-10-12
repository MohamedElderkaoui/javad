
/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer42_ {
	/**
	 * @param args
	 * @throws InterruptedException
	 */
	public static void main(String[] args) throws InterruptedException {
		double prer[][][] = new double[3][12][4];
		double prer2[][] = new double[3][12];
		int tam[][][] = new int[3][12][4];
		/**
		 * 42.-Una empresa guarda en una tabla de 3x12x4 las ventas realizadas por sus
		 * tres representantes a lo largo de doce meses de sus cuatro productos, VENTAS
		 * [representante, mes, producto]. Queremos proyectar el array tridimensional
		 * sobre uno de dos dimensiones que represente el total de ventas, TOTAL [mes,
		 * producto], para lo cual sumamos las ventas de cada producto de cada mes de
		 * todos los representantes. Imprimir ambos arrays.
		 */
		// --------------------------------------------------------
		// ------guardar los precios de mes de
		// --------------------------------------------------------
		for (int i = 0; i < prer.length; i++) {
			for (int j = 0; j < prer[i].length; j++) {
				for (int k = 0; k < prer[i][j].length; k++) {
					prer[i][j][k] = ((Math.random() * 100));
					tam[i][j][k] = (String.format("%4.2f", (prer[i][j][k])).length());
					System//
							.out//
									/**
									 * 
									 */
									.println("" + i + "," + j + "," + k + "(" + tam[i][j][k] + "):"
											+ String.format("%4.2f", (prer[i][j][k])) + "" + "");
					Thread.sleep(2000);
				}
			}
		}
		// ////////////////////////////////////////////////////////////
		// ------imprimir
		// ////////////////////////////////////////////////////////////
		for (int i = 0; i < prer.length; i++) {
			for (int j = 0; j < prer[i].length; j++) {
				for (int k = 0; k < prer[i][j].length; k++) {
					double pros = prer[i][j][k];
					System.out.printf(" %" + (10 - tam[i][j][k] / 2) + ";", (String.format("%4.2f", (prer[i][j][k]))));
					Thread.sleep(1000);
				}
				p();
			}
			System.out.println("===================================================================");
			System.out.println("===================================================================");
		}
		//////////////////////////////////////////////////////////////////////////////////////////
		//////// la suma de
		//////////////////////////////////////////////////////////////////////////////////////////
		for (int i = 0; i < prer.length; i++) {
			for (int j = 0; j < prer[i].length; j++) {

				prer2[i][j] = Leer.misuma(prer[i][j]);
				System.out.printf(" %" + (10 - (String.format("%4.2f", (prer2[i][j])).length()) / 2) + "s€;",
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
