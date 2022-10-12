/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer26 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 27.-Realizar la tabla de multiplicar de un número entre 0 y 10.
		 */int i=0;
		 do {
			i=Utilidad.leer().leerEntero("");
		} while (Utilidad.y(i>=1, i<=10));
		 for (int j = 0; j <=10; j++) {
			System.out.printf("%d*%d=%d", i,j,(i*j));
		}
	}
}
