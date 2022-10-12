/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer14 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) { /**
												 * 14.-Hacer un pseudocódigo que imprima el mayor y el menor de una
												 * serie de cinco números que vamos introduciendo por teclado.
												 * 
												 */
		int[] num1_5 = new int[5];
		int max = 0, min = 0;
		for (int i = 0; i < num1_5.length; i++) {
			num1_5[i] = Utilidad.leer().leerEntero("num_" + i + "");
		}
		for (int i : num1_5) {
			for (int j : num1_5) {
				if (i < j) {
					min = i;
				}
				if (i > j) {
					max = i;
				}
			}
		}
		System.out.printf("min=%6d,max=%6d", min, max);
	}
}
