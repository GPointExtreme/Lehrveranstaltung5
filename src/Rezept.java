
public class Rezept {
	
	private String name;
	private byte personen;
	private String[] zutaten;
	private int[]menge;
	
	public Rezept(String name, byte personen, String[] zutaten) {
		this.name = name;
		this.personen = personen;
		this.zutaten = zutaten;
	}

	public String getName() {
		return name;
	}

	public byte getPersonen() {
		return personen;
	}

	public String[] getZutaten() {
		return zutaten;
	}
	
	public void printRezept() {
		System.out.println("Rezeptname: " + getName());
		System.out.println("Rezeptname: " + getName());
	}

}
