/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer11 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * .-Imprimir y contar los múltiplos de 3 desde la unidad hasta un numero que
		 * introducimos por teclado.
		 */
		int num = Utilidad.leer().leerEntero(" un numero que introducimos por teclado.");
		if (num>=1) {
			for (int i = 1; i < num; i++) {
				System.out.printf("%5d * 3= "
						+ i*3
						+ "\n", i);
			} 
		} else {
			main(args);
		}
	} }
