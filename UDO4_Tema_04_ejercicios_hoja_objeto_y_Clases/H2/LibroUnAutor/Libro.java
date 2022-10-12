/**
 * 
 */
package LibroUnAutor;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Libro {
	private String titulo;
	private Autor autor;
	private Double precio;
	private Integer cantidad=0;
	/**
	 * @param titulo
	 * @param autor
	 * @param precio
	 */
	public Libro(String titulo, Autor autor, Double precio) {
		this.cantidad +=1;
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
	}
	/**
	 * @param titulo
	 * @param autor
	 * @param precio
	 * @param cantidad
	 */
	public Libro(String titulo, Autor autor, Double precio, Integer cantidad) {
		
		this.titulo = titulo;
		this.autor = autor;
		this.precio = precio;
		this.cantidad = cantidad;
	}
	/**
	 * @return  titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @return  autor
	 */
	public Autor getAutor() {
		return autor;
	}
	/**
	 * @return  precio
	 */
	public Double getPrecio() {
		return precio;
	}
	/**
	 * @return  cantidad
	 */
	public Integer getCantidad() {
		return cantidad;
	}
	/**
	 * @param titulo 
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @param autor 
	 */
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	/**
	 * @param precio 
	 */
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	/**
	 * @param cantidad 
	 */
	public void setCantidad(Integer cantidad) {
		this.cantidad = cantidad;
	}
	@Override
	public String toString() {
		return String.format("\nLibro [titulo=%s, \nautor=%s, \nprecio=%s, \ncantidad=%s]", titulo, autor.toString(), precio, cantidad);
	}
	
	
}
