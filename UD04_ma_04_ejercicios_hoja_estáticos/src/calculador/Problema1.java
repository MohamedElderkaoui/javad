/**
 * 
 */
package calculador;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Problema1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre[]= {"Dani"
				, "Marta"
				, "Javier"
				, "Maria"
						, "Juan"};
		Persona[] listaPersonas=  new Persona[10];
		for (int i = 0; i < listaPersonas.length; i++) {
			listaPersonas[i]=new Persona();
			listaPersonas[i].setNombre(nombre[((int)(Math.random()*nombre.length))]);
			listaPersonas[i].setEdad(20+((int)(Math.random()*20)));
		}
		for (Persona i : listaPersonas) {
			System.out.println(i.toString());
		}
	}

}
