/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer17 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 17.-Imprimir, contar y sumar los múltiplos de 2 que hay entre una serie de
		 * números, tal que el segundo sea mayor o igual que el primero.
		 */
		int i = Utilidad.leer().leerEntero("");
		int i_par = 0;
		int[] num = new int[i];
		for (int j : num) {
			j = Utilidad.leer().leerEntero("");
			if (j%2==0) {
				i_par += j;
			}System.out.printf(", %4d", j);
		}System.out.printf("\n  sumar los múltiplos de 2 que %d ", i_par);

System.out.printf("\n  sumar los múltiplos de 2 que %d ", i_par);
	}

}
