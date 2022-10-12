/**
 *hi1 
 */

package Ej01;

import java.util.Arrays;
import java.util.Comparator;

import HojaEstáticosEjerciciosTema4ClasesObjeto.Utilidad;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Princinpal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Alumno[] lista_Alumnos = new Alumno[1];
		String[] menu = { "salir", " crear alumnos", " imprimir el nombre", " imprimir la edad ",
				" incrementar la  edad.  " };

		int opcion = -1;// Utilidad.leer().leer_opcion_menu("eliger", menu);
		do {
			// opcion = Utilidad.leer().leer_opcion_menu("eliger", menu);
			if (opcion == 1) {
				lista_Alumnos = crear_Alumnos(lista_Alumnos, menu);
			} else if (opcion == 2) {
//				Comparator<Alumno> c1 = (n1, n2) -> n1.getNombre().compareTo(n2.getNombre());
//				Arrays.sort(lista_Alumnos, c1);
				System.out.println(String.format("|%s|", c(20, "nombre")));
				System.out.println(String.format("+%s+", c(20, "")).replace(" ", "-"));
				for (int i = 0; i < lista_Alumnos.length-1; i++) {
					System.out.println(String.format("|%s|", c(20, lista_Alumnos[i].getNombre())));
					System.out.println(String.format("+%s+", c(20, "")).replace(" ", "-"));
				}
			} else if (opcion == 3) {
//				Comparator<Alumno> C2 = (n1, n2) -> n1.getEdad()-n2.getEdad();
//				Arrays.sort(lista_Alumnos, C2);
				System.out.println(String.format("|%s|", c(20, "nombre")));
				System.out.println(String.format("+%s+", c(20, "")).replace(" ", "-"));
				for (int i = 0; i < lista_Alumnos.length; i++) {
					try {
						System.out.println(String.format("|%s|", Utilidad.c(20, lista_Alumnos[i].getEdad())));
						System.out.println(String.format("+%s+", c(20, "")).replace(" ", "-"));
					} catch (NullPointerException e) {
						// TODO Auto-generated catch block
						
					}
				}
			} else if (opcion == 4) {
				
					lista(lista_Alumnos);
					int nuevo_edad=Utilidad.leer().leerEntero("nue");
					umenta_Edad(lista_Alumnos, nuevo_edad);
					lista(lista_Alumnos);
			} else if (opcion == 0) {
				break;
			}
			opcion = Utilidad.leer().leer_opcion_menu("eliger", menu);
		} while (!Utilidad.intervalo(opcion, 0, menu.length));
	}

	/**
	 * @param lista_Alumnos
	 * @param menu
	 * @return
	 */
	public static Alumno[] crear_Alumnos(Alumno[] lista_Alumnos, String[] menu) {
		lista(lista_Alumnos);
		String nombre_de_nue_alum = Utilidad.leer().leerCadena("nombre:");
		Integer edad = Utilidad.leer().leerEntero("++++++++++++++++++\n\nedad de" + nombre_de_nue_alum + ":");
		
		lista_Alumnos = Arrays.copyOf(lista_Alumnos, lista_Alumnos.length + 1);
		for (int i = 0; i < menu.length; i++) {
			Alumno alumno = new Alumno(nombre_de_nue_alum, edad);
			if (lista_Alumnos[i] == null) {
				lista_Alumnos[i] = alumno;
				break;
			}
		}
		lista(lista_Alumnos);
		return lista_Alumnos;
	}

	/**
	 * @param lista_Alumnos
	 * @param nuevo_edad
	 */
	public static void umenta_Edad(Alumno[] lista_Alumnos, int nuevo_edad) {
		lista_Alumnos[nuevo_edad].setEdad(lista_Alumnos[nuevo_edad].getEdad()+1);
	}

	/**
	 * @param lista_Alumnos
	 */
	public static void lista(Alumno[] lista_Alumnos) {
		String s = "edad";
		System.out.println(String.format("|%s|%s|", c(20, "nombre"), c(20, s)));
		System.out.println(String.format("+%s+%s+", c(20, ""), c(20, "")).replace(" ", "-"));
//		Comparator<Alumno> c1 = (n1, n2) -> n1.getNombre().compareTo(n2.getNombre());
//		Arrays.sort(lista_Alumnos,c1);
		
		System.out.println(Arrays.toString(lista_Alumnos).replace(",", "\n").replace("[", "")//
				.replace("]", "").replace("null", ""));
	}

	public static String c(int width, String s) {
		return String.format("%-" + width + "s", String.format("%" + (s.length() + (width - s.length()) / 2) + "s", s));
	}

	/**
	 * @param nombre_de_nue_alum
	 * @return
	 */
	public static int edad(String nombre_de_nue_alum) {
		int edad = Utilidad.leer().leerEntero("edad de" + nombre_de_nue_alum + ":");
		return edad >= 0 ? edad : edad(nombre_de_nue_alum);
	}

}
