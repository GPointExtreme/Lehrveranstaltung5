public class ArrayTools {

	public static int[] intersectCount(int[] data1, int[] data2) {
		int counter = 0;
		for (int i = 0; i < data1.length; i++) {
			for (int j = 0; j < data2.length; j++) {
				if(data1[i] == data2[j]) {
					counter++;
				}
			}	
		}
		int array[] = new int[counter];
		int n = 0;
		for (int i = 0; i < data1.length; i++) {
			for (int j = 0; j < data2.length; j++) {
				if(data1[i] == data2[j]) {
					array[n] = data1[i];
					n++;
				}
			}	
		}
	return array;
	}

	public static int[] distinct(int[] data) {

	// Hier sollte Ihr Code stehen

	return null; // <-- Vergessen Sie nicht, Ihr Ergebnis zu retournieren
	}

	public static boolean isSorted(int[] data) {

	// Hier sollte Ihr Code stehen

	return false; // <-- Vergessen Sie nicht, Ihr Ergebnis zu retournieren
	}

	public static Statistik[] createStatistic(int[] data) {

	// Hier sollte Ihr Code stehen

	return null; // <-- Vergessen Sie nicht, Ihr Ergebnis zu retournieren
	}

}
