
/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer23 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 23.-Hacer un pseudocódigo que imprima los números del 0 al 100, controlando
		 * las filas y las columnas. (p. ej. 10 número por fila y que queden alineados)
		 */
		int num = 1, numf = 100;

		for (int i = num; i <=	 numf; i++) {
			System.out.printf(", %3d", i);
			if((i%10)==0)
				System.out.println();
		}
	}

}
