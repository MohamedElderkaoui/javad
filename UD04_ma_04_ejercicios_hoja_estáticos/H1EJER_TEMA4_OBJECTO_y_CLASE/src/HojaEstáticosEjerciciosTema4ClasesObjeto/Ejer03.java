/**
 * 
 */
package HojaEstáticosEjerciciosTema4ClasesObjeto;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer03/**
					 * Se define el factorial de un número N como N*(N-1)*(N-2)*.......*3*2*1 .
					 * Hacer un programa que lea un número N filtrando a que sea mayor que cero y
					 * calcule su factorial. La función a construir aquí se llamara factorial. El
					 * método main solo debe leer un valor y devolver su factorial (versión
					 * iterativa).
					 */
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num =Utilidad.leer().leerEntero("");
		int fac_num =miFactorial(num);
		System.out.printf("%d!=%d", num,fac_num);
	}
	/**
	 * 
	 * @param num
	 * @return valor
	 */
	public static int miFactorial(int num) {
		int valor = 0;

		if (num > 0) {
			valor = 1;
			for (int i = 1; i <= num; i++)
				valor = valor * i;
		}else {
			valor = 1;
		}

		return valor;
	}
}
