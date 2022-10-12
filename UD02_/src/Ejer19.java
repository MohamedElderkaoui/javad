
public class Ejer19 {

	public static void main(String[] args) throws InterruptedException  {
		// TODO Auto-generated method stub
		int hora, minuto, segundo;
		hora = Leer.leerEntero("Introduce la hora");
		minuto = Leer.leerEntero("Introduce los minutos");
		segundo = Leer.leerEntero("Introuce los segundos");
		hora(hora, minuto, segundo);
	}

	/**
	 * @param hora
	 * @param minuto
	 * @param segundo
	 * @throws InterruptedException
	 */
	public static void hora(int hora, int minuto, int segundo) throws InterruptedException {
		if (hora < 0 || hora > 23) {
			hora = 0;
		}
		if(minuto<0 || minuto > 59) {
			minuto =0;
		}	
		if (segundo < 0 || segundo > 59) {
			segundo = 0;
		}
		while(true) {
			System.out.printf("Hora : %02d:%02d:%02d\n",hora,minuto,segundo);
			segundo++;
			if(segundo == 60) {
				segundo = 0;
				minuto++;
			}
			if(minuto == 60) {
				minuto = 0;
				hora++;
			}
			if(hora == 24) {
				hora = 0;
			}
			Thread.sleep(1000);
		}
	}

}
