
package Class_arrays;

import java.util.Arrays;

/**
 * @author Dani Val 
 *
 */
public class Ejer08_dani/**
					 * Tenemos 10 asignaturas y 10 alumnos numerados del 1 al 10 tanto las
					 * asignaturas como los alumnos. Introducimos las 10 notas de los 10 alumnos
					 * (generación aleatoria de 1 a 10) y pidiendo por teclado bien número de
					 * asignatura ó bien número de alumno, calcular media del alumno tecleado ó
					 * media de la asignatura tecleada.
					 */
{
	public static void main(String[] args) {
		
		int opt = menu(); 
		
		if(opt <=2 && opt >0) {
			
			double tabla[][] = new double[10][10];
			
			generaTabla(tabla,1,10);
			
			
			
					
			while(opt > 0) {
				
				if(opt <=3 && opt >0) {
					
					if(opt==1) {//media del alumno
						verTabla(tabla);
					}
					
					if(opt==2) {//media del alumno
						System.out.println("\nHas introducido la opción media de alumno");
					}
					
					if(opt==3) {//media de la asignatura
						System.out.println("\nHas introducido la opción media de asignatura");
					}
				} else {
					//no ha introducid bien el dato
					System.err.println("\nIntroduce una opción válida.");
				}
				
				
				System.out.println("\n\n");
				opt=menu();
			}
		}
		
		System.out.println("\n\n\n\n\n\n\n\n\n\n    FIN");
		
	}
	
	
	private static void verTabla(double[][] tabla) {
		
		//Cabecera
		System.out.printf("\n");
		System.out.printf("     |");
		for (int j = 0; j < tabla[0].length; j++) {
			System.out.printf(" %03d |",(j+1));
		}
		System.out.printf("\n");
		//Guion cabecera
		System.out.printf("+----+");
		for (int j = 0; j < tabla[0].length; j++) {
			System.out.printf("-----+",(j+1));
		}
		System.out.printf("\n");
		
		//contenido
		for (int i = 0; i < tabla.length; i++) {
			System.out.printf("| %2d |",(i+1));
			for (int j = 0; j < tabla[i].length; j++) {
				System.out.printf(" %3.1f |",tabla[i][j]);
			}
			System.out.printf(" \n");
		}
		
	}


	public static int menu() {
		
		int opcion = -1;
		
		System.out.println("\n   MENU");
		System.out.println("==========================");
		System.out.printf("   %2d - %-20s\n",1,"Ver tabla");
		System.out.printf("   %2d - %-20s\n",2,"Media alumno");
		System.out.printf("   %2d - %-20s\n",3,"Media asignatura");
		System.out.printf("\n   %2d - %-15s\n",0,"Salir");
		
		opcion = Leer.leerEntero("\nIntroduce una opcion: ");
		
		
		return opcion;
	}
	
	public static void generaTabla(double m[][],int min, int max) {
		
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m[i].length; j++) {
				m[i][j]= (Math.random()*(max-min)+min);
			}
		}
		
	}

}
