import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer07 {

	/**
	 * 7.-Introducir tantas frases de texto como queramos y contarlas. (cada frase
	 * termina al pulsar intro y el algoritmo finaliza cuando pulsamos intro sin
	 * haber introducido texto)
	 * 
	 * @param args
	 */	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclados = new Scanner(System.in);
		int itelactor = 0;
		String frase = "";
		boolean b = frase.compareTo("") == 0;
		do {
			itelactor += 1;
			System.out.print(itelactor+".-");
			frase = teclados.nextLine();
			System.out.println(frase);
		} while (no(b));
	}

	/**
	 * @param b
	 * @return
	 */
	public static boolean no(boolean b) {
		return !b;
	}

}
