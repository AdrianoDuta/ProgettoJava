package ordina;

public class MainClass {
	
	public static void main(String[] args) {
		
		int[] array = new int[100];
		
		Thread uno = new Thread(new OrdinaRunnable(caricaArray(array)));
		
		System.out.println("\n ARRAY NON ORDINATO : ");
		stampaArray(array);
		
		uno.start();
		
		try {
			uno.join();
		} catch(InterruptedException e) {
			System.err.println(e.toString());
			// Thread.yield();
		}
		
		System.out.println("\n\n ARRAY ORDINATO : ");
		stampaArray(array);
		
	}
	
	static int[] caricaArray(int[] array) {
		for(int i = 0; i < array.length; i++) {
			
			array[i] = (int) (Math.random() * 101);
			
		}
		return array;
	}
	
	// Stampa i valori all'interno dell'array
	static void stampaArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("\t"+array[i]);
		}
	}
}
