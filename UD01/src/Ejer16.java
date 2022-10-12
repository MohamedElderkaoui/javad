import java.util.Scanner;

/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer16 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 16) Teniendo en cuenta que la clave es “eureka”, escribir un algoritmo que
		 * nos pida una clave. Solo tenemos 3 intentos para acertar, si fallamos los 3
		 * intentos nos mostrara un mensaje indicándonos que hemos agotado esos 3
		 * intentos. (Se recomienda utilizar un interruptor). Si acertamos la clave,
		 * saldremos directamente del programa.
		 * 
		 */
		Scanner teclados = new Scanner(System.in);
		String clave = "eureka";
		String clave1 = "";
		int i = 0;
		do {
			clave1="";
			System.out.print("introducion 	");
			clave1=teclados.nextLine();
			if (clave1.compareToIgnoreCase(clave)==0) {
				System.out.println("tu estas dentro");
				
				break;
			} else {
				System.err.println("clave erronia ");
				i++;
				if (i>2) {
					System.err.println("no esta dentro");
				}
			}
		} while (i<3);
		teclados.close();
	}

}
