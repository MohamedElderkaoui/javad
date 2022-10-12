package Class_String_hoja1;
/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer01_03 {
	public static void main(String[] args) {
		/**
		 * Programa que lea una frase y una palabra y que nos diga la posición de dicha
		 * palabra en la frase y si no la encuentra devuelva un cero.
		 */
		String frase = "";
		String palabra = "";
		do {
			frase = Utilidad.leer().leerCadena("escribre frase:").toLowerCase();
		} while (frase.length() > 80);
		System.out.println(frase);
		do {
			palabra = Utilidad.leer().leerCadena("escribre frase:").toLowerCase();
		} while (palabra.length()>frase.length() );
		System.out.println();
		String[] parablas = frase.split(" ");
		for (int i = 0; i < parablas.length; i++) {
			if (parablas[i].compareTo(palabra)==0) {
				System.out.printf("%2s", ""+(i+1));
			}else {
				System.out.printf("%2s", "");
			}
		}
	}
}
