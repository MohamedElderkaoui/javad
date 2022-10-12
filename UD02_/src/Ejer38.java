import java.util.Arrays;

/**
 * 37.-Generar una matriz de 4 filas y 5 columnas con números aleatorios entre 1
 * y 100, y hacer su matriz transpuesta.
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer38 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		double nota[] = new double[10];
		for (int i = 0; i < nota.length; i++) {
			nota[i] = Utilidad.leer().leerDouble("");

		}
		System.out.print("[");
		for (double i : nota) {
			double d = i * 1.00;
			System.out.printf("%3.2f ,", d);
		}
		String s = "]\n media" + Utilidad.leer().miMedia(nota) + "";
		System.out.print(s);

	}
}
