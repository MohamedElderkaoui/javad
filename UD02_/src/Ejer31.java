
/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer31 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 31.-Introducir dos números por teclado y mediante un menú, calcule su suma,
		 * su resta, su multiplicación o su división.
		 * 
		 */
		int[] num = new int[2];
		int opcion = Leer
				.leerEntero("numero a induccir\n" + "1-suma\n" + "2-restar\n" + "3-mutiplicacion\n" + "4-disision\n");
		do {
			num[0] = Leer.leerEntero("numero a induccir");
			num[1] = Leer.leerEntero("numero a induccir");
			switch (opcion) {
			case 1:
				System.out.printf("%d+%d=%d", num[0], num[1], num[0] + num[1]);
				break;
			case 2:
				System.out.printf("%d-%d=%d", num[0], num[1], num[0] - num[1]);
				break;
			case 3:
				System.out.printf("%d*%d=%d", num[0], num[1], num[0] * num[1]);
				break;
			case 4:
				if (num[1] != 0)
					System.out.printf("%d/%d=%d", num[0], num[1], num[0] / num[1]);

				break;

			default:
				break;
			}
			opcion = Leer.leerEntero(
					"\nnumero a induccir\n" + "1-suma\n" + "2-restar\n" + "3-mutiplicacion\n" + "4-disision\n");

		} while (opcion != -1);

	}
}
