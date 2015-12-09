
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
		for (int i = 0; i < zeilen.length; i++) {
			Bestellzeile zeile = zeilen[i];
			System.out.print(zeile.getMenge() + "x ");
			System.out.print("das Produkt " + zeile.getName() + " um jeweils ") ;
			System.out.println(zeile.getPreis() + "Euro");
		}
	}
	
	public double getKosten() {
		double gesamtkosten = 0;
		
		for (int i = 0; i < zeilen.length; i++) {
			Bestellzeile zeile = zeilen[i];
			gesamtkosten = gesamtkosten + zeile.getKosten();
		}
		return gesamtkosten;
	}
}
