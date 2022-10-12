/**
 * 
 */
package calculador;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Persona {
 private String nombre;
 private int edad;
/**
 * 
 */
public Persona() {
//	super();
}
/**
 * @param nombre
 * @param edad
 */
public Persona(String nombre, int edad) {
//	super();
	this.nombre = nombre;
	this.edad = edad;
}
/**
 * @return the nombre
 */
public String getNombre() {
	return nombre;
}
/**
 * @param nombre the nombre to set
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}
/**
 * @return the edad
 */
public int getEdad() {
	return edad;
}
/**
 * @param edad the edad to set
 */
public void setEdad(int edad) {
	this.edad = edad;
}
/**
 * @return String.format("Persona [nombre=%s, edad=%s]", nombre, edad);
 */
@Override
public String toString() {
	return String.format("soy %"
			+ (int)(10-this.nombre.length()/2)
			+ "s"
			+ "%"
			+ (int)(5-this.nombre.length()/2)
			+ "s y tengo %2d años", nombre,"", edad);
}

}
