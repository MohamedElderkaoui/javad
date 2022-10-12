package Class_String_hoja2;
/**
 * 
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class MagicNum {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String magicNum = Utilidad.leer().leerCadena("");
		int dia = 0, mes = 0, anio = 0;
		if (magicNum.length() == 10) {
			if (magicNum.indexOf("-") == 2) {
				//System.out.println(magicNum.substring(4));
				if (magicNum.substring(3).lastIndexOf("-") == 2) {
					String[] vector = magicNum.split("-");
					if (vector.length == 3) {
						if (vector[0].length() == 2) {
							if (vector[1].length() == 2) {
								if (vector[2].length() == 4) {
									System.out.println("DIA:" + vector[0]);
									System.out.println("MES:" + vector[1]);
									System.out.println("AÑO:" + vector[2]);
									dia = Integer.parseInt(vector[0]);
									mes = Integer.parseInt(vector[1]);
									anio = Integer.parseInt(vector[2]);
									int total = dia + mes + anio;
									System.out.print(magicNum + "->" + total);
									String st = "" + total;
									do {
										st = "";
										st = "" + total;
										total = 0;
										for (int i = 0; i < st.length(); i++) {
											total += Integer.parseInt("" + st.charAt(i));
										}
										System.out.print("->" + total);

									} while (st.length() != 1);
								}
							}
						}
					}
				} // magicNum.length() == 10
			}
		}
	}
}
