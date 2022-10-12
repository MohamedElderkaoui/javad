
/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer24bis {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 24.-Comprobar si un número mayor que la unidad es primo
		 * 
		 */
		int num = Leer.leerEntero("");
		for (int i = 1; i < num; i++) {
			int	o = 0;
			for (int j = 1; j <=i; j++) {
				if (i%j==0) {
					o++;
				}
				
			}
			if (o==2) {
				System.out.println(i);
			}
		}
	}

}
