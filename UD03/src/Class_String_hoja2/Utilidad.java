package Class_String_hoja2;
/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Utilidad {

	/**
	 * @param d2
	 * @param d3
	 * @return boolean d2 * boolean d3
	 */
	public static boolean y(boolean d2, boolean d3) {
		return d2 && d3;
	}

	/**
	 * @param d2
	 * @param d3
	 * @return boolean d2+boolean d3
	 */
	public static boolean o(boolean d2, boolean d3) {
		return d2 || d3;
	}

	/**
	 * 
	 * @return leer
	 */
	public static Leer leer() {
		Leer leer = new Leer();
		return leer;

	}

	/**
	 * +int[] ordernadore(int[] vector)
	 * 
	 * @param vector
	 */
	public static int[] ordernadore(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < (vector.length - 1); j++) {
				int apoyo;
				if (vector[j] > vector[j + 1]) {
					apoyo = vector[j];
					vector[j] = vector[j + 1];
					vector[j + 1] = apoyo;
				}
			}
		}
		return vector;
	}

	/**
	 * 
	 * @param numero
	 * @param i
	 * @param j
	 * @return i>numero>j
	 */
	public static boolean intervalo(int numero, int i, int j) {
		return (numero < i) || (numero > j);
	}
}
