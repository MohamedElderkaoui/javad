/**
 * 
 */
package HojaEstáticosEjerciciosTema4ClasesObjeto;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer08/**
					 * Dados m elementos de un conjunto que se desean agrupar de n en n el número
					 * combinatorio que nos define dicho numero de combinaciones posibles es
					 * m!/(n!*(m-n)!), siendo siempre m >=n (hay que filtrarlo) Escribir un método
					 * para que dados como parámetros m y n nos calcule el número de combinaciones
					 * de m sobre n. Usad el método factorial del ejercicio 3
					 * 
					 */
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -1;
		do {
			a = Utilidad.leer().leerEntero("");
		} while (a <= 0);
		int b = -1;
		do {
			b = Utilidad.leer().leerEntero("");
		} while (!(a >= b));
		int m = Math.min(a, b);
		int n = Math.min(a, b);
		int Factorial_m_ = Ejer03.miFactorial(m);
		int Factorial_n_ = Ejer03.miFactorial(n);
		int Factorial_m_menos_n_ = Ejer03.miFactorial(m - n);
		System.out.printf("comb(" + m + "," + n + ")" + "=" + Factorial_m_ + "!/(" + Factorial_n_ + "!*("
				+ Factorial_m_menos_n_ + ")!)=%d", (Factorial_m_ / (Factorial_n_ * Factorial_m_menos_n_)));
	}

}
