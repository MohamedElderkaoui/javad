
public class Ejer18 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String texto = Leer.leerCadena("Introduce el texto de referencia");
		System.out.println(texto);
		int posicion = 0, cuenta = 0;
		String letra = //Leer.leerCadena("Dame la letra a buscar")
			Leer.leerCadena("Dame la letra a buscar")
				;
		while (texto.toLowerCase().indexOf(letra.toLowerCase(), posicion + 1) != -1) {
			//System.out.println(texto.toLowerCase().indexOf(letra.toLowerCase(), posicion));
			posicion = texto.toLowerCase().indexOf(letra.toLowerCase(), posicion);
			cuenta++;
		}
		System.out.printf("La letra %s aparece %d veces en"
				+ "\n"
				+ "%s",letra,cuenta, texto);
	}

}
