import java.util.Scanner;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer08 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner teclados = new Scanner(System.in);
		/*
		 * 8) Una tienda ofrece un descuento del 15% sobre el total de la compra durante
		 * el mes de octubre. Dado un mes y un importe, calcular cuál es la cantidad que
		 * se debe cobrar al cliente.
		 */
		System.out.print("el 15% sobre que el total de la compra ");
		/**
		 * pedi mes y importe
		 */
		int nextInt = teclados.nextInt();
		int total_compra_durante = nextInt;
		int mes = 0;
		mes = nextInt;
		boolean b = mes == 10;
		double potentaje = b ? // si el mes is octubre.
				(1-0.15) //
				: // o sino
				1;
		double cantidad_final = 0;
		while (!Utilidad.y(0 > mes, mes < 13)) {
			if (b) {
				cantidad_final = total_compra_durante * potentaje;
				System.out.printf(" la cantidad que  se debe cobrar al cliente es %5.2f euro" , cantidad_final);
				break;
			} else if (mes != 10) {
				cantidad_final = total_compra_durante * potentaje;
				System.out.printf(" la cantidad que  se debe cobrar al cliente es %5.2f euro" , cantidad_final);
				break;
			}
			mes =  teclados.nextInt();
		}teclados.close();

	}
}
