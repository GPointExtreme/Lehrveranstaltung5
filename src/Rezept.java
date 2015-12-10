
public class Rezept {
	
	//Warum public?
	public String name;
	public byte personen;
	public Zutat[] zutat;
	
	public Rezept(String name, byte personen, Zutat[] zutat) {
		this.name = name;
		this.personen = personen;
		this.zutat = zutat;
	}

	public String getName() {
		return name;
	}

	public byte getPersonen() {
		return personen;
	}

	public Zutat[] getZutat() {
		return zutat;
	}
	
	public void printRezept() {
		Rezept printRezept = umrechnen(getPersonen());

		System.out.println("Rezeptname= " + printRezept.getName());
		System.out.println("Personen= " + printRezept.getPersonen());
		
		Zutat[] rezeptzutaten = printRezept.getZutat();
		
		for (int i = 0; i < rezeptzutaten.length; i++) {
			Zutat zutat2 = rezeptzutaten[i];
			System.out.print("Name der Zutat= " + zutat2.getName() + ", ") ;
			System.out.println("Menge der Zutat= " + zutat2.getMenge());
		}
	}
	
	public Rezept umrechnen(byte personen) {
		byte personenTee = (byte) personen;
		Zutat[] zutaten1 = getZutat();
		Zutat[] zutatenpersonen= new Zutat[zutaten1.length];

		for (int i = 0; i < zutaten1.length; i++) {
			Zutat zutatenKlasse = zutaten1[i];

			int menge = zutatenKlasse.getMenge();
			menge = menge * personen;

			Zutat neu=new Zutat(zutatenKlasse.getName(), menge);
			zutatenpersonen[i]=neu;	
		}
		Rezept myrezept = new Rezept(getName(), personenTee, zutatenpersonen);
		return myrezept;
	}

}
