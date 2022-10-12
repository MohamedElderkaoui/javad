/**
 * 
 */
package LibroUnAutor;

import java.util.Arrays;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class GestLibroAutor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] menu = { "Salir.", " Crear libros.", "Crear autor.", "Modificar autor.", "Modificar libro.",
				"Listado de libros.", "Listado de autores." };
		int optcion = -1;
		Autor[] lista_Autors = new Autor[1];
		Libro[] lista_Libros = new Libro[1];
		do {
			if (optcion == 1) {

				System.out.print(Arrays.toString(lista_Libros));
				int elegir = -1;
				do {
					System.out.print(Arrays.toString(lista_Autors));
					System.out.println();
					elegir = Utilidad.leer().leerEntero("elige");
				} while (elegir > -1 && elegir < lista_Autors.length);
				double precio = Utilidad.leer().leerDouble("precio");
				Libro nuevoLibro = new Libro(Utilidad.leer().leerCadena("titulo"), lista_Autors[elegir], precio);
				lista_Libros = Arrays.copyOf(lista_Libros, lista_Libros.length + 1);
				for (int i = 0; i < lista_Libros.length; i++) {
					if (lista_Libros[i] == null) {
						lista_Libros[i] = nuevoLibro;
						break;
					}
				}
				System.out.print(Arrays.toString(lista_Libros));
			} else if (optcion == 2) {
				System.out.print(Arrays.toString(lista_Autors));
				char g = ' ';
				do {
					char charAt = Utilidad.leer().leerCadena("genero").toUpperCase().charAt(0);
					g = charAt == Character.toUpperCase('M') ? Character.toUpperCase('M')
							: charAt == Character.toUpperCase('H') ? Character.toUpperCase('M') : ' ';
				} while (Character.toUpperCase(g) == Character.toUpperCase('M')
						|| Character.toUpperCase(g) == Character.toUpperCase('F'));
				Autor A = new Autor(Utilidad.leer().leerCadena("NOMA"), Utilidad.leer().leerCadena("email"), g);
				lista_Autors = Arrays.copyOf(lista_Autors, lista_Autors.length + 1);
				for (int i = 0; i < lista_Autors.length; i++) {
					if (lista_Autors[i] == null) {
						lista_Autors[i] = A;
						break;
					}
				}
				System.out.print(Arrays.toString(lista_Autors));
			} else if (optcion == 3) {
				System.out.print(Arrays.toString(lista_Autors));
				String[] submune = { "Salir.", "modifica email" };
				int elegir2 = -1;
				do {
					int elegir = -1;
					if (elegir2 == 1) {
						do {
							System.out.print(Arrays.toString(lista_Autors));
							System.out.println();
							elegir = Utilidad.leer().leerEntero("elige");
						} while (elegir > -1 && elegir < lista_Autors.length);
						lista_Autors[elegir].setEmail(Utilidad.leer().leerCadena("email"));
					} else if (elegir2 == 0) {
						break;
					}
					elegir2 = Utilidad.leer().leer_opcion_menu("", submune);
				} while (true);
				System.out.print(Arrays.toString(lista_Autors));
			} else if (optcion == 4) {
				System.out.print(Arrays.toString(lista_Libros));
				String[] submune = { "Salir.", "modifica email" };
				int elegir2 = -1;
				do {
					int elegir = -1;
					if (elegir2 == 1) {
						do {
							System.out.print(Arrays.toString(lista_Autors));
							System.out.println();
							elegir = Utilidad.leer().leerEntero("elige");
						} while (elegir > -1 && elegir < lista_Autors.length);
						lista_Autors[elegir].setEmail(Utilidad.leer().leerCadena("email"));
					} else if (elegir2 == 0) {
						break;
					}
					elegir2 = Utilidad.leer().leer_opcion_menu("", submune);
				} while (true);
				System.out.print(Arrays.toString(lista_Libros));
			} else if (optcion == 5) {
				System.out.print(Arrays.toString(lista_Libros));
			} else if (optcion == 6) {
				System.out.print(Arrays.toString(lista_Autors));
			} else if (optcion == 0) {
				break;
			}
			optcion = Utilidad.leer().leer_opcion_menu("", menu);
		} while (true);
	}

}
