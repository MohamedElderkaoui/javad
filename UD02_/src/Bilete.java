
/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Bilete {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int valor = Utilidad.leer().leerEntero("valoe");
		int pago = Utilidad.leer().leerEntero("pego");
		int cant = -(valor -pago);
		int[] billete = new int[9];
		while (cant > 0) {
			while ((cant - 500) >= 0) {
				cant -= 500;
				billete[0] += 1;
			}
			while ((cant - 200) >= 0) {
				cant -= 200;
				billete[1] += 1;
			}
			while ((cant - 100) >= 0) {
				cant -= 100;
				billete[2] += 1;
			}
			while ((cant - 50) >= 0) {
				cant -= 50;
				billete[3] += 1;
			}
			while ((cant - 20) >= 0) {
				cant -= 20;
				billete[4] += 1;
			}
			while ((cant - 10) >= 0) {
				cant -= 10;
				billete[5] += 1;
			}
			while ((cant - 5) >= 0) {
				cant -= 5;
				billete[6] += 1;
			}
			while ((cant - 2) >= 0) {
				cant -= 2;
				billete[7] += 1;
			}
			while ((cant - 1) >= 0) {
				cant -= 1;
				billete[8] += 1;
			}

		}
		System.out.printf(""
				+ "500billete: %d"
				+ "\n"
				+ "200billete: %d"
				+ "\n"
				+ "100billete: %d"
				+ "\n"
				+ " 50billete: %d"
				+ "\n"
				+ " 20billete: %d"
				+ "\n"
				+ " 10billete: %d"
				+ "\n"
				+ "  5billete: %d"
				+ "\n"
				+ "  2modera:  %d"
				+ "\n"
				+ "  1modera:  %d"
				+ "\n"
				+ ""
				+ "\n",
				billete[0], billete[1], billete[2], billete[3], billete[4], billete[5], billete[6],
				billete[7], billete[8]);
	}
}
