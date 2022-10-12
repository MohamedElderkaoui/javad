/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Ejer25BIS2 {
	public static void main(String[] args) {
		int num =0;
		
			
				do {
					num = Utilidad.leer().leerEntero("");
					String pasar_numero_a_numerp_rumano = name(num);
					System.out.println(pasar_numero_a_numerp_rumano);
				} while (num!=0);
				
				
	}

	public static  String name(int num) {
		String name = "";
		String[] miles = { "", "M", "MM", "MMM", "MMMM", "MMMMM", "MMMMMM", "MMMMMMM", "MMMMMMMMM", "M" };
		String[] cienes = { "", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM" };
		String[] diezes = { "", "X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC" };
		String[] unidades = { "", "i", "ii", "iii", "iv", "v", "vi", "vii", "viii", "iv" };
		return miles[num/1000]+cienes[(num%1000)/100]+diezes[(num%100)/10]+unidades[num%10];
	}
}
