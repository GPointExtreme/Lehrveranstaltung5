
public class RezeptDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte personenTee = 5;
		Zutat[] zutatenTee = new Zutat[3];

		Zutat zutatteeblaetter = new Zutat("Teeblaetter", 10);
		zutatenTee[0] = zutatteeblaetter;

		Zutat zutatwasser = new Zutat("Wasser", 500);
		zutatenTee[1] = zutatwasser;

		Zutat zutatzucker = new Zutat("Zucker", 100);
		zutatenTee[2] = zutatzucker;
		

		Rezept myrezept = new Rezept("Tee", personenTee, zutatenTee);
		
		myrezept.printRezept();
	}

}
