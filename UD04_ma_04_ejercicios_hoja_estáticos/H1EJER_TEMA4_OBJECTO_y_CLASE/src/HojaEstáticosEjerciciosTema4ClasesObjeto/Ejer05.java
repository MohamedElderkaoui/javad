/**
 * 
 */
package HojaEstáticosEjerciciosTema4ClasesObjeto;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer05 /*
					 * Escribir un método que con dos parámetros enteros p y q nos devuelva el m.c.d
					 * (máximo común divisor) de ambos.
					 */ {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = -1, num2 = -1;
		do {
			num1 = Utilidad.leer().leerEntero("leerEntero(1):");
		} while (!(num1 > -1));
		do {
			num2 = Utilidad.leer().leerEntero("leerEntero(1):");
		} while (!(num2 > -1));
		int a = Math.min(num1, num2);
		int b = Math.max(num1, num2);
		int resultado = mcd(a, b);
		System.out.printf("m.c.d(%d,%d)=%d", num1, num2,resultado);
	}

	private static int mcm(int num1, int num2) {
		// TODO Auto-generated method stub
		int a = Math.min(num1, num2);
		int b = Math.max(num1, num2);
		int validor= 0;
		int resultado = 1;
		int aopyo =2;
		do {
			if (aopyo%a==0) {
				if (aopyo%b==0) {
					validor=-1;	
				}
			}
			aopyo++;
		} while (validor!=-1);
		resultado=aopyo;
		return resultado;
	}

	/**
	 * @param a
	 * @param b
	 * @return
	 */
	public static int mcd(int a, int b) {
		int resultado = 0;
		do {
			resultado = b;
			b = a % b;
			a = resultado;
		} while (b!=0);
		return resultado;
	}

	/**
	 * 
	 */
	public static void extracted(int num1) {

		do {
			num1 = Utilidad.leer().leerEntero("leerEntero(1):");
		} while (!(num1 > -1));
	}

}
