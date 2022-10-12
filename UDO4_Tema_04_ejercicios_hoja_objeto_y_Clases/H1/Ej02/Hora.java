/**
 * 
 */
package Ej02;

import HojaEstáticosEjerciciosTema4ClasesObjeto.Utilidad;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Hora {
	private Integer hora;
	private Integer minuto;
	private Integer segundo;

	/**
	 * @return la hora
	 */
	public Integer getHora() {
		return hora;
	}

	/**
	 * @return la minuto
	 */
	public Integer getMinuto() {
		return minuto;
	}

	/**
	 * @return la segundo
	 */
	public Integer getsegundo() {
		return segundo;
	}

	/**
	 * @param horala hora para establecer
	 */
	public void setHora(Integer hora) {
		this.hora = hora;
	}

	/**
	 * @param minuto la minuto para establecer
	 */
	public void setMinuto(Integer minuto) {
		this.minuto = minuto;
	}

	/**
	 * @param segundo el segundo para establecer
	 */
	public void setsegundo(Integer segudo) {
		this.segundo = segudo;
	}

	/**
	 * this.hora=0; this.minuto=0; this.segudo=0;
	 */
	public Hora() {
		this.hora = 0;
		this.minuto = 0;
		this.segundo = 0;
	}

	/**
	 * @param hora
	 * @param minuto
	 * @param segundo
	 */
	public Hora(Integer hora, Integer minuto, Integer segundo) {
		if (Utilidad.intervalo(hora, -1, 24)) {
			hora = 0;
			if (Utilidad.intervalo(minuto, -1, 60)) {
				minuto = 0;
				if (Utilidad.intervalo(segundo, -1, 60)) {
					segundo = 0;
				}
			}

		}

		this.hora = hora;
		this.minuto = minuto;
		this.segundo = segundo;
	}

	/**
	 * @param hora
	 * @param minuto
	 * @param segundo
	 * @return
	 * @throws InterruptedException
	 */
	public void hora() throws InterruptedException {
		if (hora < 0 || hora > 23) {
			hora = 0;
		}
		if (minuto < -1 || minuto > 59) {
			minuto = 0;
		}
		if (segundo < 0 || segundo > 59) {
			segundo = 0;
		}
		/**
		 * 
		 */
		setsegundo(getsegundo() - 1);
		while (true) {
			setsegundo(getsegundo() + 1);
			if (segundo == 60) {
				setsegundo(0);
				setMinuto(getMinuto() + 1);
			}
			if (minuto == 60) {
				setMinuto(0);
				setHora(getHora() + 1);
			}
			if (hora == 24) {
				setHora(getHora() + 1);
			}
			Thread.sleep(1000);
			System.out.println(toString());
		}

	}

	@Override
	public String toString() {
		return String.format("Hora : %02d:%02d:%02d\n", hora, minuto, segundo);
	}

}
