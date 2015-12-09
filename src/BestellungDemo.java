
public class BestellungDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bestellzeile[] computer = new Bestellzeile[2];
	
		computer[0] = new Bestellzeile("Asus", 2, 400);
		computer[1] = new Bestellzeile("Dell", 4, 500);
		
		Bestellung myBestellung = new Bestellung("1", computer);
		myBestellung.printBestellung();
		System.out.println("Gesamtkosten: " + myBestellung.getKosten());
	}

}
