/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer25BIS {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String romanos = "";
		int numero = -1,  miles, centenas, decenas, unidades, n2;
		//Leer el número
		while (numero > 3999 || numero < 0) {
			numero = Utilidad.leer().leerEntero
					("Introduce el número a convertir a romano");
		}
		//Descomponemos el número
		miles = numero / 1000;
		n2 = numero - miles *1000;
		centenas = n2/100;
		n2 = n2 - centenas *100;
		decenas = n2/10;
		unidades = n2 - decenas*10;
		//Convertimos miles
		romanos = convierte(romanos, "M", "", "", miles);
		//Convertir centenas
		romanos = convierte(romanos, "C", "D", "M", centenas);
		//Convertir decenas
		romanos = convierte(romanos, "X", "L", "C", decenas);
		//Convertir Unidades
		romanos = convierte(romanos, "I", "V", "X", unidades);
		System.out.println("El número "+numero +" en romanos es "+ romanos);
	}

	//Método extraído del patrón de conversión de cada cifra(miles, centenas, decenas, unidades)
	//al método extraído a partir de la refactorización le añado los parámetros de los símbolos que 
	//representan el 1 el 5 y el 10 para cada cifra(miles, centenas, decenas, unidades) 
	private static String convierte(String romanos, String uno, String cinco, String diez, int numero) {
		
		switch (numero) {
		case 1: {
			romanos = romanos + uno;
			break;
		}
		case 2: {
			romanos = romanos + uno + uno;
			break;
		}
		case 3: {
			romanos = romanos + uno + uno + uno;
			break;
		}
		case 4: {
			romanos = romanos + uno + cinco;
			break;
		}
		case 5: {
			romanos = romanos + cinco;
			break;
		}
		case 6: {
			romanos = romanos + cinco + uno;
			break;
		}
		case 7: {
			romanos = romanos + cinco + uno + uno;
			break;
		}
		case 8: {
			romanos = romanos + cinco + uno + uno + uno;
			break;
		}
		case 9: {
			romanos = romanos + uno + diez;
			break;
		}
		}
		return romanos;
	}
}
