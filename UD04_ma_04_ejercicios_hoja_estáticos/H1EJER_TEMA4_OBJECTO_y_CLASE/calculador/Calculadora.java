/**
 * 
 */
package calculador;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Calculadora {
/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD	
 * @param nun1
 * @param nun2
 * @return nun1 + nun2;
 */
	public static int suma(int nun1, int nun2) {
		int suma = nun1 + nun2;
		return suma;
	}
	/**
	 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD	
	 * @param nun1
	 * @param nun2
	 * @return nun1 + nun2;
	 */
	public static double  suma(double  nun1, double  nun2) {
		double  suma = nun1 + nun2;
		return suma;
	}
	/**
	 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD	
	 * @param nun1
	 * @param nun2
	 * @return nun1 -nun2;
	 */
	public static int resta(int nun1, int nun2) {
		int resta = nun1 - nun2;
		return resta;
	}
	/**
	 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD	
	 * @param nun1
	 * @param nun2
	 * @return nun1 - nun2;
	 */
	public static double  resta(double  nun1, double  nun2) {
		double  resta = nun1 - nun2;
		return resta;
	}
	/**
	 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD	
	 * @param nun1
	 * @return num1 >0
	 */
	private static boolean esPosivo(int nun1) {
		boolean esPosivo=false;
		if (nun1>0) 
			esPosivo=true;
		return esPosivo;
	}
}
