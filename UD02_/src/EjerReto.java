
public class EjerReto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vNum[] = new int[9];
		int vNum1[] = new int[9];
		int min = 0, max = 0;
		int nmin = 0, Nmax = 0;
		for (int i = 0; i < vNum.length; i++) {
			vNum[i] = (int) (Math.ceil(Math.random() * 10));
			System.out.printf("%3d,  ", vNum[i]);
			vNum1[i]=vNum[i];
		}
		
		for (int veces = 0; veces < vNum1.length; veces++) {
			for (int i = 0; i < vNum1.length - 1; i++) {
				if (vNum1[i] > vNum1[i + 1]) {
					int apoyt = vNum1[i + 1];
					vNum1[i + 1] = vNum1[i];
					vNum1[i] = apoyt;
				}
			}
		}
		System.out.println();
		for (int i = 0; i < vNum.length; i++) {

			System.out.printf("%3d,  ", vNum1[i]);
		}
		min = vNum1[0];
		max = vNum1[vNum1.length - 1];
		
		System.out.println();
		for (int i = 0; i < vNum1.length; i++) {
			if (vNum[i] == min) {
				nmin += 1;
				System.out.print("  " + i);
			} 
			
		}System.out.printf("\n"
				+ "%d   "
				+ "menor:%d",nmin,min);
	
		System.out.println();
		for (int i = 0; i < vNum.length; i++) {
			if (vNum[i] == max) {
				Nmax += 1;
				System.out.print("  " + i);
			}
		}
		System.out.printf("\n"
				+ "%d    "
				+ "MAYO:%d",Nmax, max);
	}

}
