package Class_String_hoja1;
/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer01_04 {
	public static void main(String[] args) {
		/**
		 * Leer una cadena de hasta 80 caracteres y pasarla en función de una variable
		 * de opción a mayúsculas ó a minúsculas e imprimir la cadena resultante
		 */
		String frase = "";
		String palabra = "";
		do {
			frase =  Utilidad.leer().leerCadena("escribre frase:").toLowerCase();
		} while (frase.length() > 80);
	//System.out.println(frase);
		String mayu_minu = Utilidad.leer().leerCadena("escribre frase:");
		if (mayu_minu.compareToIgnoreCase("min")==0) {
			System.out.println(frase.toLowerCase());
		} else if (mayu_minu.compareToIgnoreCase("may")==0){
			System.out.println(frase.toUpperCase());
		}
//		System.out.println(frase.toUpperCase());
//		System.out.println(frase.toLowerCase());
	
	}
}
