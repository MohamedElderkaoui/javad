/**
 * 
 */

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer08 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 8.-Hacer un pseudocódigo que solo nos permita introducir S o N.
		 */
		int i = 0;
		String y = Utilidad.leer().leerCadena("8.-Hacer un pseudocódigo que solo nos permita introducir S o N.");
		boolean b = !(y.length() != 1);
		boolean c = i <= 3;
		boolean d2 = y.compareToIgnoreCase("s") != 0;
		boolean d3 = y.compareToIgnoreCase("n") != 0;
		while (c) {
			if (b) {
				if (!(y.compareToIgnoreCase("") != 0)) {
					if (!d2) {
						System.out.println();
						System.out.print("decir que si ");
					} else {
						if (!d3) {
							System.out.println();
							System.out.print("decir que no ");

						}
					}
				}
			}
			i += 1;
		}
		if (Utilidad.y(Utilidad.y(!b, i>=3), Utilidad.o(!d2, !d3))) {
			System.out.println();
			System.err.print("no ");
		}
	}

}
