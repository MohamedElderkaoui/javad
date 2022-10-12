/**
 * 
 */
package Class_arrays;

import java.util.Arrays;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer02 /**
					 * Leer del teclado dos vectores de dimensión 10 y construir un tercer vector
					 * cuyos componentes sean la suma de los dos anteriores. Luego se imprime el
					 * tercer vector. A continuación se ordena y se vuelve a imprimir.
					 */
{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dimesiones = 10;
		int[] vectores_numeros_1 = new int[dimesiones];
		int[] vectores_numeros_2 = new int[dimesiones];
		int[] vectores_suma_numeros = new int[dimesiones];
		for (int i = 0; i < vectores_suma_numeros.length; i++) {
			vectores_numeros_1[i]=Utilidad.leer().leerEntero("");
			vectores_numeros_2[i]=Utilidad.leer().leerEntero("");
			vectores_suma_numeros[i]=vectores_numeros_1[i]+vectores_numeros_2[i];
		}String format="";
		for (int i = 0; i < vectores_suma_numeros.length; i++) {
			 format = format+String.format("%2d+%2d=%2d\n"
			 		+ "---", vectores_numeros_1[i],vectores_numeros_2[i],vectores_suma_numeros[i]);
			System.out.printf(format);
		}
		String[] split = format.split("---");
		System.out.println(Arrays.toString(split));
		Arrays.sort(split);
		System.out.println(Arrays.toString(split));
		Arrays.sort(vectores_suma_numeros);
	}
	/** 
	 * FIN 
	 */
}
