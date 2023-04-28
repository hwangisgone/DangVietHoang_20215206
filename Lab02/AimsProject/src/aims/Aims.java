package aims;

public class Aims {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart anOrder = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",	"Animation",		"Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",		"Science Fiction",	"George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",			"Animation", 		18.99f);
		
		anOrder.addDigitalVideoDisc(dvd1);
		anOrder.addDigitalVideoDisc(dvd2);
		anOrder.addDigitalVideoDisc(dvd3);

		System.out.println("Total Cost: " + anOrder.totalCost());
		
		anOrder.removeDigitalVideoDisc(dvd2);
		System.out.println("Total Cost after removing Star Wars 24.95: " + anOrder.totalCost());
		
		
		DigitalVideoDisc dvd4 = new DigitalVideoDisc("Avatar", "Science Fiction", "James Cameron", 192, 12.44f);
		DigitalVideoDisc dvd5 = new DigitalVideoDisc("Avatar: Way of the Water", "Science Fiction", "James Cameron", 27.98f);
		DigitalVideoDisc dvd6 = new DigitalVideoDisc("Top Gun: Maverick", "Action", 22.25f);
		DigitalVideoDisc dvd7 = new DigitalVideoDisc("Everything Everywhere All at Once ", "Comedy", "Daniel Kwan", 139, 46.23f);
		DigitalVideoDisc dvd8 = new DigitalVideoDisc("Uncharted", "Adventure", 25.85f);
		DigitalVideoDisc dvd9 = new DigitalVideoDisc("Jurassic World: Dominion", "Action", 147, 36.77f);
		DigitalVideoDisc dvd10 = new DigitalVideoDisc("The Father", "Drama", 97, 25.9f);
		DigitalVideoDisc dvd11 = new DigitalVideoDisc("Judas and the Black Messiah", "Crime", 45.98f);
		DigitalVideoDisc dvd12 = new DigitalVideoDisc("CODA", "Comedy", 38.25f);
		DigitalVideoDisc dvd13 = new DigitalVideoDisc("Cruella", "Crime", "Craig Gillespie", 134, 35.55f);
		DigitalVideoDisc dvd14 = new DigitalVideoDisc("Black Panther", "Action", 47.6f);
		DigitalVideoDisc dvd15 = new DigitalVideoDisc("Parasite", "Thriller", "Bong Joon-ho", 132, 19.42f);
		DigitalVideoDisc dvd16 = new DigitalVideoDisc("Promising Young Woman");
		DigitalVideoDisc dvd17 = new DigitalVideoDisc("La La Land ", "Romance, Musical", 19.66f);
		DigitalVideoDisc dvd18 = new DigitalVideoDisc("Soul", "Animation", 101, 46.96f);
		DigitalVideoDisc dvd19 = new DigitalVideoDisc("Joker", "Thriller", 122, 30f);
		DigitalVideoDisc dvd20 = new DigitalVideoDisc("Toy Story 4", "Animation", 100, 17.01f);

		anOrder.addDigitalVideoDisc(dvd3);
		anOrder.addDigitalVideoDisc(dvd4);
		anOrder.addDigitalVideoDisc(dvd5);
		anOrder.addDigitalVideoDisc(dvd6);
		anOrder.addDigitalVideoDisc(dvd7);
		anOrder.addDigitalVideoDisc(dvd8);
		anOrder.addDigitalVideoDisc(dvd9);
		anOrder.addDigitalVideoDisc(dvd10);
		anOrder.addDigitalVideoDisc(dvd11);
		anOrder.addDigitalVideoDisc(dvd12);
		anOrder.addDigitalVideoDisc(dvd13);
		anOrder.addDigitalVideoDisc(dvd14);
		anOrder.addDigitalVideoDisc(dvd15);
		anOrder.addDigitalVideoDisc(dvd16);
		anOrder.addDigitalVideoDisc(dvd17);
		anOrder.addDigitalVideoDisc(dvd18);
		anOrder.addDigitalVideoDisc(dvd19);
		anOrder.addDigitalVideoDisc(dvd20);

		DigitalVideoDisc dvd21 = new DigitalVideoDisc("Colette", "Animation", 45.03f);	
		anOrder.addDigitalVideoDisc(dvd21);
		System.out.println("Total Cost: " + anOrder.totalCost());
	}

}
