/**
 * 
 */
package HojaEstáticosEjerciciosTema4ClasesObjeto;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer09/**
					 * Escribir un programa que llame a un método con los coeficientes de una
					 * ecuación de segundo grado a, b, c y devuelva sus raíces en el caso de ser
					 * reales. Nota : las raíces de una ecuación son:
					 *//**
						 * 
						 * R1=(-b+raíz(b2-4*a_c))/(2*a) R2=(-b-raíz(b2-4*a_c))/(2*a)
						 */
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = -1;
		do {
			a = Utilidad.leer().leerEntero("numero:");
		} while (a <= 0);
		int b = -1;
		do {
			b = Utilidad.leer().leerEntero("numero:");
		} while (b != 0);
		int c = -1;
		do {
			c = Utilidad.leer().leerEntero("numero:");
		} while (c != 0);
		double res[] = Ecuacioon_de_resulcioon_de_ecg2oG(a, b, c);
		System.out.printf("%dx^2+%dx+%d=0", a, b, c);
		System.out.printf("->(-%d+raíz(%d^2-4*%d*%d))/(2*%d)=%f", b, b, a, c, a, res[1]);
		System.out.println();
		System.out.printf("%dx^2+%dx+%d=0", a, b, c);
		System.out.printf("->(-%d-raíz(%d^2-4*%d*%d))/(2*%d)=%f", b, b, a, c, a, res[0]);

	}

	/**
	 * @param a
	 * @param b
	 * @param c
	 */
	public static double[] Ecuacioon_de_resulcioon_de_ecg2oG(int a, int b, int c) {
		int b2 = b * b;
		int ac4 = 4 * (a * c);
		int b2_4ac = b2 - ac4;
		double raiz$b2_4ac$ = raiz(b2_4ac);
		double _b_raiz$b2_4ac$ = -b - raiz$b2_4ac$;
		double _b_$_raiz$b2_4ac$$ = -b + raiz$b2_4ac$;
		double $_b_raiz$b2_4ac$$PR2a2a = _b_raiz$b2_4ac$ / (2 * a);
		double _b_$_raiz$b2_4ac$$PR2a = _b_$_raiz$b2_4ac$$ / (2 * a);
		double res[] = { $_b_raiz$b2_4ac$$PR2a2a, _b_$_raiz$b2_4ac$$PR2a };
		return res;
	}

	/**
	 * @param b2_4ac
	 * @return
	 */
	public static double raiz(int b2_4ac) {
		return Math.sqrt(b2_4ac);
	}

}
