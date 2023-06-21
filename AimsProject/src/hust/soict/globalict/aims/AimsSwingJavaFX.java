package hust.soict.globalict.aims;

import hust.soict.globalict.aims.cart.Cart;
import hust.soict.globalict.aims.media.DigitalVideoDisc;
import hust.soict.globalict.aims.screen.StoreScreen;
import hust.soict.globalict.aims.store.Store;

public class AimsSwingJavaFX {

	public static void main(String[] args) {
		Store theStore = new Store();
		Cart theCart = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",	"Animation",		"Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",		"Science Fiction",	"George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",			"Animation", 		18.99f);
		
		theStore.addMedia(dvd1);
		theStore.addMedia(dvd2);
		
		new StoreScreen(theStore, theCart);
	}
}
