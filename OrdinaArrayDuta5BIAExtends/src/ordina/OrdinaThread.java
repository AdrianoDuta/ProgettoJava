package ordina;

public class OrdinaThread extends Thread {
	
	private int[] array;
	
	
	public Ordina(int[] array) {
		this.array = array;
	}
	
	public void ordinaArray() {
		for (int i = 0; i < array.length; i++) {
			for(int j = 0; j < array.length - 1; j++) {
				if(array[j] < array[j+1]) {
				} else {
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}			
		}
	}
	
	public void run() {
		ordinaArray();
	}
}