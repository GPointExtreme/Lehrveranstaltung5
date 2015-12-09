
public class BestellungDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bestellzeile[] computer = new Bestellzeile[2];
	
		Bestellzeile asus = new Bestellzeile("Asus", 2, 400);
		computer[0] = asus;
		Bestellzeile dell = new Bestellzeile("Dell", 4, 500);
		computer[1] = dell;
		
		Bestellung myBestellung = new Bestellung("1", computer);
		myBestellung.printBestellung();
		System.out.println("Gesamtkosten: " + myBestellung.getKosten());
	}

}
