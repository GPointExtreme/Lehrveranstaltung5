
public class Bestellung {
	
	private String nummer;
	private Bestellzeile[] zeilen;
	
	public Bestellung(String nummer, Bestellzeile[] zeilen) {
		this.nummer = nummer;
		this.zeilen = zeilen;
	}

	public String getNummer() {
		return nummer;
	}

	public Bestellzeile[] getZeilen() {
		return zeilen;
	}
	
	public void printBestellung() {
		Bestellzeile[] zeilen = getZeilen();
		
		for (int i = 0; i < zeilen.length; i++) {
			Bestellzeile zeile2 = zeilen[i];
			System.out.print(zeile2.getMenge() + "x ");
			System.out.print("das Produkt " + zeile2.getName() + " um jeweils ") ;
			System.out.println(zeile2.getPreis() + "Euro");
		}
	}
	
	public double getKosten() {
		Bestellzeile[] zeilen = getZeilen();
		double gesamtkosten = 0;
		
		for (int i = 0; i < zeilen.length; i++) {
			Bestellzeile zeile2 = zeilen[i];
			gesamtkosten = gesamtkosten + zeile2.getKosten();
		}
		return gesamtkosten;
	}
}
