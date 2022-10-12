/**
 * 
 */
package Ej02;

import HojaEstáticosEjerciciosTema4ClasesObjeto.Utilidad;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Principal {

	/**
	 * @author ACER i7 10TH
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int segundo = Utilidad.leer().leerEntero("segundo");
		;
		int minuto = Utilidad.leer().leerEntero("minuto");
		int hora2 = Utilidad.leer().leerEntero("hora");
		Hora hora = new Hora(Utilidad.o_intervalo(hora2, -1, 24) ? hora2 : 0,
				Utilidad.o_intervalo(minuto, -1, 60) ? minuto : 0, Utilidad.o_intervalo(segundo, -1, 60) ? segundo : 0);
		try {
			hora.hora();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
