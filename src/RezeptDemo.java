
public class RezeptDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte personenTee = 5;
		Zutat[] zutatenTee = new Zutat[3];

		zutatenTee[0] = new Zutat("Teeblaetter", 10);
		zutatenTee[1] = new Zutat("Wasser", 500);
		zutatenTee[2] = new Zutat("Zucker", 100);
		
		Rezept myrezept = new Rezept("Tee", personenTee, zutatenTee);
		
		myrezept.printRezept();
	}

}
