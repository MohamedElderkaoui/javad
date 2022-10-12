/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer25 {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * 25.-Introducir un número menor de 4000 y pasarlo a numero roman
		 */
		int num = Utilidad.leer().leerEntero("");
		String romaString = "";
		int mil = num / 1000;
		int i = mil * 1000;
		num = num - i;
		int cien = num / 100;
		int t = cien * 100;
		num = num - t;
		int diez = num / 10;
		int unidad = num - (num * 10);
		switch (mil) {
		case 1:
			romaString = romaString + "M";
			break;
		case 2:
			romaString = romaString + "MM";
			break;
		case 3:
			romaString = romaString + "MMN";
			break;
		case 4:
			romaString = romaString + "MMM";
			break;

		default:
			break;
		}
		switch (cien) {
		case 1:
			romaString = romaString + "C";
			break;
		case 2:
			romaString = romaString + "CC";
			break;
		case 3:
			romaString = romaString + "CCC";
			break;
		case 4:
			romaString = romaString + "CD";
			break;
		case 5:
			romaString = romaString + "D";
			break;
		case 6:
			romaString = romaString + "DC";
			break;
		case 7:
			romaString = romaString + "DCC";
			break;
		case 8:
			romaString = romaString + "DCCC";
			break;
		case 9:
			romaString = romaString + "CM";
			break;

		default:
			break;
		}
		switch (diez) {
		case 1:
			romaString = romaString + "X";
			break;
		case 2:
			romaString = romaString + "XX";
			break;
		case 3:
			romaString = romaString + "XXX";
			break;
		case 4:
			romaString = romaString + "XL";
			break;
		case 5:
			romaString = romaString + "L";
			break;
		case 6:
			romaString = romaString + "LX";
			break;
		case 7:
			romaString = romaString + "LXX";
			break;
		case 8:
			romaString = romaString + "LXXX";
			break;
		case 9:
			romaString = romaString + "XC";
			break;

		default:
			break;
		}
		switch (diez) {
		case 1:
			romaString = romaString + "X";
			break;
		case 2:
			romaString = romaString + "XX";
			break;
		case 3:
			romaString = romaString + "XXX";
			break;
		case 4:
			romaString = romaString + "XL";
			break;
		case 5:
			romaString = romaString + "L";
			break;
		case 6:
			romaString = romaString + "LX";
			break;
		case 7:
			romaString = romaString + "LXX";
			break;
		case 8:
			romaString = romaString + "LXXX";
			break;
		case 9:
			romaString = romaString + "XC";
			break;
			
		default:
			break;
		}
		switch (unidad) {
		case 1:
			romaString = romaString + "I";
			break;
		case 2:
			romaString = romaString + "II";
			break;
		case 3:
			romaString = romaString + "III";
			break;
		case 4:
			romaString = romaString + "IV";
			break;
		case 5:
			romaString = romaString + "V";
			break;
		case 6:
			romaString = romaString + "VI";
			break;
		case 7:
			romaString = romaString + "VII";
			break;
		case 8:
			romaString = romaString + "VIII";
			break;
		case 9:
			romaString = romaString + "IV";
			break;
			
		default:
			break;
		}
		System.out.println(romaString);
	}

}
