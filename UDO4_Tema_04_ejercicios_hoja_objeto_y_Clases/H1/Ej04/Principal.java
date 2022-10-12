/**
 * 
 */
package Ej04;

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
		String[] menu = { "salir", "Crear nueva cuenta ", "Ingresar en cuenta  ", "Retirar de cuenta  ",
				"Visualizar cuenta  ", "Visualiza todas las cuentas" };
		CuentaCorriente[] Lista_cuentaCorrientes = new CuentaCorriente[1];
		int opcion = -1;
		do {
			if (opcion == 1) {
				ver(Lista_cuentaCorrientes);
				String nombre = Utilidad.leer().leerCadena("nombre");
				CuentaCorriente cc = new CuentaCorriente(
						Utilidad.leer().leerDouble("".format("saldo Cliente%s", nombre)), nombre);
				Lista_cuentaCorrientes = Arrays.copyOf(Lista_cuentaCorrientes, Lista_cuentaCorrientes.length + 1);
				for (int i = 0; i < Lista_cuentaCorrientes.length; i++) {
					if (Lista_cuentaCorrientes[i] == null) {
						Lista_cuentaCorrientes[i] = cc;
						break;
					}
				}
				ver(Lista_cuentaCorrientes);
			} else if (opcion == 2) {
				ver(Lista_cuentaCorrientes);
				int eliger = -1;
				double ingres = -1;
				do {
					eliger = Utilidad.leer().leerEntero("");
				} while (-1 > eliger && eliger > Lista_cuentaCorrientes.length);
				do {
					ingres = Utilidad.leer().leerDouble("");
				} while (-1 > ingres);
				Lista_cuentaCorrientes[eliger].ingresaEfectivo(ingres);
				ver(Lista_cuentaCorrientes);
			} else if (opcion == 3) {
				ver(Lista_cuentaCorrientes);
				int eliger = -1;
				double ingres = -1;
				do {
					eliger = Utilidad.leer().leerEntero("");
				} while (-1 > eliger && eliger > Lista_cuentaCorrientes.length);
				do {
					ingres = Utilidad.leer().leerDouble("");
				} while (-1 > ingres);
				Lista_cuentaCorrientes[eliger].retiraEfectivo(ingres);
				ver(Lista_cuentaCorrientes);

			} else if (opcion == 4) {

				ver(Lista_cuentaCorrientes);
				int eliger = -1;

				do {
					eliger = Utilidad.leer().leerEntero("");
				} while (-1 > eliger && eliger > Lista_cuentaCorrientes.length);

				System.out.println(Lista_cuentaCorrientes[eliger].toString());
			} else if (opcion == 5) {
				ver(Lista_cuentaCorrientes);
			} else if (opcion == 0) {
				break;
			}
			opcion = Utilidad.leer().leer_opcion_menu2("", menu);
		} while (true);
	}

	public static void ver(CuentaCorriente[] lista_cuentaCorrientes) {
		// TODO Auto-generated method stub
		System.out.println(String.format("+%s+%s+%s+", Utilidad.c(10, ""), Utilidad.c(10, ""), Utilidad.c(20, ""))
				.replace(" ", "-"));
		System.out.println(String.format("|%s|%s|%s|", Utilidad.c(10, "cuenta"), Utilidad.c(10, "nombre"),
				Utilidad.c(20, "saldo")));
		System.out.println(String.format("+%s+%s+%s+", Utilidad.c(10, ""), Utilidad.c(10, ""), Utilidad.c(20, ""))
				.replace(" ", "-"));
		System.out.println(Arrays.toString(lista_cuentaCorrientes).replace("[", "")//
				.replace("],", "").replace("|,", "|"
						+ String.format("\n+%s+%s+%s+", Utilidad.c(10, ""), Utilidad.c(10, ""), Utilidad.c(20, "")).replace(" ", "-")
						+ "\n").replace("]", "").replace("null", "").replace("\r\n"
						+ "|\r\n"
						+ ", ", ""));
	}

}
