package coche;

public class Coche {
	private String matricula;
	private String modelos;
	private String marcas;
	private int disposito;
	private boolean tipo;
	/**
	 * 
	 */
	public Coche() {
		super();
	}
	/**
	 * @param matricula
	 * @param modelos
	 * @param marcas
	 * @param disposito
	 * @param tipo
	 */
	public Coche(String matricula, String modelos, String marcas, int disposito, boolean tipo) {
		super();
		this.matricula = matricula;
		this.modelos = modelos;
		this.marcas = marcas;
		this.disposito = disposito;
		this.tipo = tipo;
	}
	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}
	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	/**
	 * @return the modelos
	 */
	public String getModelos() {
		return modelos;
	}
	/**
	 * @param modelos the modelos to set
	 */
	public void setModelos(String modelos) {
		this.modelos = modelos;
	}
	/**
	 * @return the marcas
	 */
	public String getMarcas() {
		return marcas;
	}
	/**
	 * @param marcas the marcas to set
	 */
	public void setMarcas(String marcas) {
		this.marcas = marcas;
	}
	/**
	 * @return the disposito
	 */
	public int getDisposito() {
		return disposito;
	}
	/**
	 * @param disposito the disposito to set
	 */
	public void setDisposito(int disposito) {
		this.disposito = disposito;
	}
	/**
	 * @return the tipo
	 */
	public boolean isTipo() {
		return tipo;
	}
	/**
	 * @param tipo the tipo to set
	 */
	public void setTipo(boolean tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return String.format("%-10s | %-10s | %-10s | %10dL", this.matricula, this.modelos,
				this.marcas, this.disposito);
	}
	public String toString2() {
		return String.format("%-10s | %-10s | %-10s | %10dL  | %-10s ", this.matricula, this.modelos,
				this.marcas, this.disposito,this.tipo?"gasolina":"gasol");
	}
	
	
}
