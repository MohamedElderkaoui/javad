import java.util.Scanner;

/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer20 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

//				29-9-2020
//				20) Calcular las calificaciones de un grupo de alumnos. La nota final de cada alumno se calcula según el siguiente criterio: la parte práctica vale el 10%; la parte de problemas vale el 50% y la parte teórica el 40%. El algoritmo leerá el nombre del alumno, las tres notas, escribirá el resultado y volverá a pedir los datos del siguiente alumno hasta que el nombre sea una cadena vacía. Las notas deben estar entre 0 y 10, si no lo están, no imprimirá las notas, mostrara un mensaje de error para ese alumno y volverá a pedir la información de otro alumno.
//				Entero practica, problemas , teoría
//				Real media
//				Cadena nombre
//				Practica0
//				Problemas0
//				Teoría0
//				
//				Leer nombre
//				
//				Mientras(nombre != ””)
//					Leer practica
//					Leer problemas
//					Leer teoría
//					
//				
//				
//				
//				
//				Si( practica >=0 y practica <=10 y teoría>=0 y teoría <=10 y problemas>=0 y problemas<=10)
//				media	 practica * 0.1+problemas*0.5 + teoría*0.4
//						Escribir nombre “ tiene la nota media “ media	
//					Else
//						Escribir nombre “tiene notas incorrectas”
//					Finsi
//					Leer nombre
//				Finmientras
//				 

		Scanner teclados = new Scanner(System.in);
		int practica = 0, problemas = 0, teoría = 0;
		double media = 0.0;
		String nombre = "";
		System.out.print("nombre :");
		nombre = teclados.nextLine();
		do {
			System.out.print("practica :");
			practica = teclados.nextInt();
			System.out.print("problemas :");
			problemas = teclados.nextInt();
			System.out.print("teoria :");
			teoría = teclados.nextInt();
			boolean y = Utilidad.y(practica >= 0, Utilidad.y(practica <= 10/**/
					,
					Utilidad.y(teoría >= 0, Utilidad.y(teoría <= 10, Utilidad.y(problemas >= 0, problemas <= 10)))));
			if (y) {
				media = practica * 0.1 + problemas * 0.5 + teoría * 0.4;
				System.out.printf("%s  tiene la nota media %3.2f\n", nombre, media);
				System.out.print("nombre :");
				nombre = teclados.nextLine();

			} // fin if
			else if (!y) {
				System.out.printf("%s tiene notas incorrectas\n", nombre);
				break;

			} // fin elsa if
			nombre = teclados.nextLine();
		} // fin do
		while (nombre.compareToIgnoreCase("") != 0);
	}

}
