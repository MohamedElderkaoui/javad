/**
 * 
 */
package LibroUnAutor;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Autor {
	private String nombre;
	private String email;
	private Character genero;

	/**
	 * @param nombre
	 * @param email
	 * @param gener
	 */
	public Autor(String nombre, String email, Character gener) {
		super();
		if (Character.toUpperCase(gener) == Character.toUpperCase('M')
				|| Character.toUpperCase(gener) == Character.toUpperCase('F')) {
			this.nombre = nombre;
			this.email = email;
			this.genero = gener;
		}
	}

	/**
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @return email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @return genero
	 */
	public Character getGenero() {
		return genero;
	}

	/**
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @param email
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/**
	 * @param gener
	 */
	public void setGenero(Character gener) {
		if (Character.toUpperCase(gener) == Character.toUpperCase('M')
				|| Character.toUpperCase(gener) == Character.toUpperCase('F')) {
			this.genero = gener;
		}
	}

	@Override
	public String toString() {
		return String.format("\nAutor [nombre=%s, email=%s, genero=%s]", nombre, email, ""+genero);
	}
	

}
