package hust.soict.globalict.test.cart;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.DigitalVideoDisc;

public class CartTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cart cart = new Cart();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",	"Animation",		"Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",		"Science Fiction",	"George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",			"Animation", 		18.99f);
		
		cart.addDigitalVideoDisc(dvd1);
		cart.addDigitalVideoDisc(dvd2);
		cart.addDigitalVideoDisc(dvd3);
		
		cart.print();
		
		System.out.println("\nTEST SEARCH:\n");
		cart.searchByID(1);
		cart.searchByID(15);
		
		System.out.println();
		cart.searchByTitle("liOn");
		cart.searchByTitle("star lion");
		cart.searchByTitle("why");
		cart.searchByTitle("JoJo's Bizarre Adventure: Stardust Crusaders");
	}

}
