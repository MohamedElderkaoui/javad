import java.util.Scanner;

/**
 * 
 */

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer19conMetodo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 19) Leer tres números que compongan una fecha (día, mes, año). Comprobar que
		 * es una fecha válida. Si no es válida escribir un mensaje de error. Si es
		 * válida escribir la fecha cambiando el número del mes por su nombre. Ej. Si se
		 * introduce 1 2 2006, se deberá imprimir “1 de febrero de 2006”. El año debe
		 * ser mayor que 0. (Usa la estructura caso de o según).
		 */
		int anyo;
		Scanner teclados = new Scanner(System.in);
		String x = "números enteros";

		x = "números enteros";
		System.out.println(x);
		anyo = teclados.nextInt();
		boolean correcto = true;
		correcto = verifica(anyo);
		if (correcto) {

		} else if (!correcto) {

		}
	}

//
	/**
	 * if (anyo % 4 == 0) { 
	 * 			System.out.printf("%-4d es un año biseto m", anyo);
	 *			 return correcto = true;
	 *  }else { 
	 *  		System.out.printf("%-4d es un año biseto m",anyo); 
	 *  		return correcto = false; 
	 *  }
	 */
	/**
	 * 
	 * @param anyo
	 */
	public static boolean verifica(int anyo) {
		boolean correcto = false;
		if ((anyo % 4 == 0)&&((anyo % 100 == 0)||(anyo % 400 == 0)) ){
			System.out.printf("%-4d es un año biseto m", anyo);
			return correcto = true;
		} else {
			System.out.printf("%-4d es un año biseto m", anyo);
			return correcto = false;
		}
	}
}
