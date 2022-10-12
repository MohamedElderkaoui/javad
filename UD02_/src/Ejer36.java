import java.util.Arrays;

/**
 * 34.-Hacer un programa que lea las calificaciones de un alumno en 10
 * asignaturas, las almacene en un vector y calcule e imprima su media.
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer36 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Boolean b = true;
		do {
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
		} while (b);
		

	}
}
