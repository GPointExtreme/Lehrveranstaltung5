
public class Statistik {
	
	 private int wert;

	 private int anzahlDesVorkommens;

	 public Statistik(int wert, int anzahlDesVorkommens) {

	 this.wert = wert;

	 this.anzahlDesVorkommens = anzahlDesVorkommens;

	 }

	 public int getWert() {

	 return wert;

	 }

	 public void setWert(int wert) {

	 this.wert = wert;

	 }

	 public int getAnzahlDesVorkommens() {

	 return anzahlDesVorkommens;

	 }

	 public void setAnzahlDesVorkommens(int anzahlDesVorkommens) {

	 this.anzahlDesVorkommens = anzahlDesVorkommens;

	 }

	 @Override

	 public String toString() {

	 return "Statistik [wert=" + wert + ", anzahlDesVorkommens="

	 + anzahlDesVorkommens + "]";

	 } 
}
