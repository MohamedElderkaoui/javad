/**
 * 
 */
package Ej03;

import java.util.Arrays;

import HojaEstáticosEjerciciosTema4ClasesObjeto.Utilidad;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] menu = { "salir", "Crear tragaBolas.  ", "Darle de comer.  ", "Hacerle trotar.  ", "Hacerle dormir.  ",
				"Ver estado.  " };
		String[] color = { " azul", "amarillo", "rojo", "verde" };

		TragaBolas[] lista_tragaBolas = new TragaBolas[1];
		int opcion = -1;
		do {
			if (opcion == 1) {
				lista(lista_tragaBolas);
				TragaBolas tBolas = new TragaBolas(color[Utilidad.leer().leer_opcion_menu2("eliger", color)],
						Utilidad.leer().leerEntero(""));
				lista_tragaBolas = Arrays.copyOf(lista_tragaBolas, lista_tragaBolas.length + 1);
				for (int i = 0; i < lista_tragaBolas.length; i++) {
					if (lista_tragaBolas[i] == null) {
						lista_tragaBolas[i] = tBolas;
					}
				}
				lista(lista_tragaBolas);
			}

			else if (opcion == 2) {
				lista(lista_tragaBolas);
				int eligi = -1;
				do {
					eligi = Utilidad.leer().leerEntero(lista2(lista_tragaBolas));
					lista_tragaBolas[eligi].comer();
				} while (Utilidad.no_o_intervalo(eligi, 0, lista_tragaBolas.length));
				lista(lista_tragaBolas);

			} else if (opcion == 3) {
				lista(lista_tragaBolas);
				int eligi = -1;
				do {
					eligi = Utilidad.leer().leerEntero("");
					lista_tragaBolas[eligi].trotar();
				} while (Utilidad.no_o_intervalo(eligi, 0, lista_tragaBolas.length));
				lista(lista_tragaBolas);

			} else if (opcion == 4) {
				lista(lista_tragaBolas);
				int eligi = -1;
				do {
					eligi = Utilidad.leer().leerEntero("");
					lista_tragaBolas[eligi].dormir();
				} while (Utilidad.no_o_intervalo(eligi, 0, lista_tragaBolas.length));
				lista(lista_tragaBolas);
			} else if (opcion == 5) {
				lista(lista_tragaBolas);
				
			} else if (opcion == 0) {
				break;
			}
			opcion = Utilidad.leer().leer_opcion_menu("eliger", menu);

		} while (true);
	}

	public static void lista(TragaBolas[] lista_tragaBolas) {
		// TODO Auto-generated method stub
		String s = "edad";
		String format = String.format("%s|%s|%s|", c(20, "color"), c(20, "bolasComidas"), c(20, "bolasMax"));
		System.out.println(format);
		String replace = String.format("%s+%s+%s+", c(20, ""), c(20, ""), c(20, "")).replace(" ", "-");
		System.out.println(replace);
		String replace2 = Arrays.toString(lista_tragaBolas).replace(",", "\n").replace("[", "")//
				.replace("]", "").replace("null", "");
		System.out.println(replace2);
	}
	public static String lista2(TragaBolas[] lista_tragaBolas) {
		// TODO Auto-generated method stub
		String s = "edad";
		String format = String.format("%s|%s|%s|", c(20, "color"), c(20, "bolasComidas"), c(20, "bolasMax"));
			String replace = String.format("%s+%s+%s+", c(20, ""), c(20, ""), c(20, "")).replace(" ", "-");
		String replace2 = Arrays.toString(lista_tragaBolas).replace(",", "\n").replace("[", "")//
				.replace("]", "").replace("null", "");
		return String.format("%s\n%s\n%s\n%s\n", format,replace,replace2);
	}

	public static String c(int width, String s) {
		return String.format("%-" + width + "s", String.format("%" + (s.length() + (width - s.length()) / 2) + "s", s));
	}

}
