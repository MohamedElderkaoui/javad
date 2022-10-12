import java.util.Arrays;

/**
 * 39.-Ordenar una matriz de M filas y N columnas por la primera columna
 * utilizando el método de la burbuja.
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer39 {
	/**
	 * metodo main
	 * @param args
	 */
	public static void main(String[] args) {
		int M=Utilidad.leer().leerEntero("");
		int vector[] = new int[M];
		for (int i = 0; i < vector.length; i++) {
			vector[i]=Utilidad.leer().leerEntero("");
		}
		ordernador(vector);
	}

	/**
	 * function ordernador
	 * 
	 * @param vector
	 */
	public static void ordernador(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("%-4d"
				, vector[i]);
		}
		ordernadore(vector);
		System.out.println();
		for (int i = 0; i < vector.length; i++) {
			System.out.printf("%-4d,"
					, vector[i]);
		}
	}

	/**
	 * @param vector
	 */
	public static void ordernadore(int[] vector) {
		for (int i = 0; i < vector.length; i++) {
			for (int j = 0; j < (vector.length-1); j++) {
				int apoyo;
				if (vector[j]>vector[j+1]) {
					apoyo=vector[j];
					vector[j]=vector[j+1];
					vector[j+1]=apoyo;
				}
			}
		}
	}
}
