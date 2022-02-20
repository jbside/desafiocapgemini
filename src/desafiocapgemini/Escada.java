package desafiocapgemini;

public class Escada {
	
	static void ImprimirEscada(int n) {
		
		char[] wImpress = new char[n];
		
		for (int i = 1; i <= n; i++) {
			wImpress[n -i] = '*'; 
			System.out.println(wImpress);
		}
		
	}

}
