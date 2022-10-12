package Ej03;

import HojaEstáticosEjerciciosTema4ClasesObjeto.Utilidad;

/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class TragaBolas {
	private String color;
	private Integer bolasComidas;
	private Integer bolasMax;

	/**
	 * @param color
	 * @param bolasMax
	 * @param bolasComidas a0
	 */
	public TragaBolas(String color, Integer bolasMax) {
		super();
		this.color = color;
		this.bolasMax = bolasMax;
		this.bolasComidas = 0;
	}

	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}

	/**
	 * @return the bolasComidas
	 */
	public Integer getBolasComidas() {
		return bolasComidas;
	}

	/**
	 * @param color the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}

	/**
	 * @param bolasComidas the bolasComidas to set
	 */
	public void setBolasComidas(Integer bolasComidas) {
		this.bolasComidas = bolasComidas;
	}

	@Override
	public String toString() {
		return String.format("%s|%s|%s\n", Utilidad.c(10, this.color),
				Utilidad.c(4, this.bolasComidas), Utilidad.c(4, this.bolasMax));
	}
	/**
	 * 
	 * @return
	 */
	public String visualizar() {
		return String.format("%s|%s\\%s|\n", Utilidad.c(20, this.color),
				Utilidad.c(20, this.bolasComidas), Utilidad.c(20, this.bolasMax));
	}
	public String comer(){
		if ((getBolasComidas()+1)<this.bolasMax) {
			setBolasComidas(getBolasComidas()+1);
			System.out.println("He comido una bola");
			return "He comido una bola";
		}return "";
	}public String trotar(){
		if ((getBolasComidas()-1)>=1) {
			setBolasComidas(getBolasComidas()-1);
			System.out.println("He comido una bola");
			return "He comido una bola";
		}return "";
	}
	public String dormir(){
		boolean b = (getBolasComidas())==this.bolasMax;
		if (b) {
			setBolasComidas(getBolasComidas()/2);
			System.out.println("triba llena,zzzzzz");
		}else if (!b) {
			System.out.println("no quero dormir ");
		}
		return "";
	}
	
}
