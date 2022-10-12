
/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer24 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 24.-Comprobar si un número mayor que la unidad es primo
		 * 
		 */
		int num = Leer.leerEntero(""), o = 0;

		for (int i = 2; i <= num; i++) {
			boolean b = (num %= i) == 0;
			if (b) {
				o = 0;break;
			} else {
				o = 1;
				
			}
		}
		if (o == 1) {
			System.out.println("" + num + "  es primo ");
		} else {
			System.out.println("" + num + "  es no primo ");
		}

	}

}
