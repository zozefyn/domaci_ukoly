public class Nasobky {
	public static void main (String [] args) {
		int pocetNaRadku = 0;
		for (int i = 0; i<= 30; i+= 3) {
			System.out.printf (" %d", i);
			pocetNaRadku++;
			if (pocetNaRadku >=4) {
				pocetNaRadku = 0;
				System.out.println ();

			}
		}
	}	
		
}