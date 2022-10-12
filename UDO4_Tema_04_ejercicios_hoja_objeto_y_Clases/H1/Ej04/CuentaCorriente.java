/**
 * 
 */
package Ej04;

import HojaEstáticosEjerciciosTema4ClasesObjeto.Utilidad;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class CuentaCorriente {
	private String numCuenta;
	private double Salario;
	private String Nombre;
	private static Integer numSiguiente = 1;

	/**
	 * @param salario
	 * @param nombre
	 */
	public CuentaCorriente(Double salario, String nombre) {
		super();
		if (salario > 0) {
			if (nombre != null) {
				if (nombre.length() != 0) {
					this.numCuenta = String.format("CC%04d", this.numSiguiente);
					this.numSiguiente++;
					this.Salario = salario;
					this.Nombre = nombre;
				}
			}
		}
	}

	/**
	 * @return salario
	 */
	public Double getSalario() {
		return Salario;
	}

	/**
	 * @return nombre
	 */
	public String getNombre() {
		return Nombre;
	}

	/**
	 * @param salario
	 */
	public void setSalario(Double salario) {
		if (salario >= 0.0) {
			this.Salario = salario;
		}
	}

	/**
	 * @param salario
	 */
	public void ingresaEfectivo(Double salario) {
		if ((getSalario() + salario) >= 0.0) {
			setSalario(getSalario() + salario);
		}
	}

	/**
	 * @param salario
	 */
	public void retiraEfectivo(Double salario) {
		if ((getSalario() - salario) >= 0.0) {
			setSalario(getSalario() - salario);
		}
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		if (nombre != null) {
			if (nombre.length() != 0) {
				this.Nombre = nombre;
			}
		}
	}

	@Override
	public String toString() {
		return String.format("|%s|%s|%s", Utilidad.c(10, this.numCuenta),Utilidad.c(10, this.Nombre),
				String.format("%20s|", String.format("%,.2f€", Salario)).replace(" ", "*"));
	}

	public String visualiza() {
		return toString()
				+ String.format("+%s+%s+%s+", Utilidad.c(10, ""), Utilidad.c(10, ""),
						String.format("%20s", String.format("%,.2f€", Salario))).replace(" ", "-");
	}

}
