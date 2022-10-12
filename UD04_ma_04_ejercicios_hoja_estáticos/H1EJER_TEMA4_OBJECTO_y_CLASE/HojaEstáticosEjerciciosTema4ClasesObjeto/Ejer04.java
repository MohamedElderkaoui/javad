/**
 * 
 */
package HojaEstáticosEjerciciosTema4ClasesObjeto;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer04/**
					 * Dado un número N que se pedirá por teclado y debe ser positivo, imprimir la
					 * lista de todos los numero primos hasta dicho número incluido. Hacer este
					 * programa usando el método primo que ya tenéis construido.
					 * 
					 */
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Utilidad.leer().leerEntero("");
		j(num);
	}
	/**
	 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
	 * @param num
	 * @return
	 */
	public static void j(int num) {


//		
//		if ((num%2 !=0 && num%3 !=0 && num%5 != 0) || (num == 2 || num == 3 || num == 5) )
//			valor = true;
		int num2 = num;
		for (int i = 1; i <= num2 / 2; i++) {
			if (num % i == 0) {
				System.out.printf("%d;", i);
			}
		}
		
	}
}
