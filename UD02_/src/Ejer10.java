/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer10 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 9.-Introducir un numero por teclado. Que nos diga si es positivo o negativo.
		 */
		int num = Integer.parseInt(Utilidad.leer().leerCadena("Introducir un numero"));
		while (num != 0) {
			boolean b = (num %= 2) == 0;
			if (b) {
				System.out.printf("%3d  par", num);
				System.out.println();
			} else if (!b) {
				System.out.printf("%-3d  impar", num);
				System.out.println();
			}
		}

	}
}
