
/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer21 {
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * 22.-Introducir una frase por teclado. Imprimirla cinco veces en filas
		 * consecutivas, pero cada impresión ir desplazada cuatro columnas hacia la
		 * derecha.
		 * 
		 */
		String frase = Utilidad.leer().leerCadena("una frase por teclado");
		for (int i = 0; i <=4; i++) {
			System.out.println(frase);
			frase="\t"+frase;
		}
		

	}

}
