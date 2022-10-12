package Class_String_hoja1;
/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer01_01 {
	public static void main(String[] args) {
		/**
		 * 1. Leer una frase de máximo 80 caracteres y escribirla progresivamente es
		 * decir si la frase es: “ciervo”, el programa debe imprimir
		 * 
		 * c
		 * 
		 * ci
		 * 
		 * cie
		 * 
		 * cier
		 * 
		 * cierv
		 * 
		 * ciervo
		 */
		String frase="";
		do {
			frase=Utilidad.leer().leerCadena("escribre frase:");
		} while (frase.length()>80);
		for (int i = 0; i <= frase.length(); i++) {
			System.out.println(frase.substring(0, i));
		}
	}
}
