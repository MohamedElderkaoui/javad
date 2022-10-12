/**
 * 
 */
package coche;

/**
 * @author Mohamed el Derkaoui Merzouk Bendoukha 1iN_DAWD
 *
 */
public class Principal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Coche c1 =new Coche();
		c1.setMatricula("1234abc".toUpperCase());
		c1.setMarcas("Renaut");
		c1.setModelos("Mega");
		c1.setTipo(false);
		c1.setDisposito(55);
		Coche c2 =new Coche("2345fgj".toUpperCase(), "Nisea", "qasaq", 60, true);
		Coche c3 =new Coche("1234abc".toUpperCase(), "Nisea", "c3", 60, true);
	/*	cabe();
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println(c3.toString());*/
		cabe2();
		System.out.println(c1.toString2());
		System.out.println(c2.toString2());
		System.out.println(c3.toString2());

	}
	/**
	 * @param args
	 */
	public static void  cabe(){
		System.out.println(String.format("%10s | %10s | %10s | %10s ", "matricula", "modelos",
				"marcas", "disposito"));
		System.out.println(String.format("%10s-+-%10s-+-%10s-+-%10sL", "---------",  "---------",
				 "----------",  "---------"));
	}
	/**
	 * @param args
	 */
	public static void  cabe2(){
		System.out.println(String.format("%10s | %10s | %10s | %11sL | %10s ", "matricula", "modelos",
				"marcas", "disposito", "tipo"));
		System.out.println(String.format("%10s-+-%10s-+-%10s-+-%12s-+-%10s", "---------",  "---------",
				 "----------",  "------------",  "----------"));
	}
}
