package Class_String_hoja1;

/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer01_11/**
						 * 11. Hacer un programa para que pida una palabra de no más de 20 caracteres y
						 * efectúe todas las rotaciones posibles de dicha palabra de forma que el último
						 * carácter pase al primero y los demás corran un espacio, es decir si la
						 * palabra fuera “HOLA” el resultado debe ser :
						 * 
						 * HOLA
						 * 
						 * AHOL
						 * 
						 * LAHO
						 * 
						 * OLAH
						 * 
						 * Observar que una palabra de n caracteres tiene n rotaciones.
						 */
{
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		String frase = "";
		do {
			do {
				frase = Utilidad.leer().leerCadena("escribre frase:").toUpperCase();
			} while (!frase.equals(frase.toUpperCase()));
		} while (frase.length() > 60);
		for (int i = 0; i < frase.length(); i++) {
			System.out.println(frase);
			frase = frase.charAt(frase.length() - 1) + frase.substring(0, frase.length() - 1);
		}
	}
}
