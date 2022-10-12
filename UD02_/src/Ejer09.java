/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer09 {
	/**
	 * @param args
	 */
	public static void main(String[] args) { 
		/**
		 * 9.-Introducir un numero por teclado. Que nos diga si es positivo o negativo. 
		 */
		int num= Integer.parseInt(Utilidad.leer().leerCadena("Introducir un numero"));
		while (num!=0) {
			if (num>0) {
				System.out.printf("%3d  positivo",num);
				System.out.println();
			}
			if (num<0) {
				System.out.printf("%-3d  negativo",num);
				System.out.println();
			}
		}
		
				
	}
}
