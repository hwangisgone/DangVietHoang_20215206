package aims;
import java.util.ArrayList;
import java.util.List;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private List<DigitalVideoDisc> itemsOrdered = new ArrayList<DigitalVideoDisc>();
	private int qtyOrdered = 0;
	
	public void addDigitalVideoDisc (DigitalVideoDisc disc) {
		if (qtyOrdered < MAX_NUMBERS_ORDERED) {
			itemsOrdered.add(disc);
			qtyOrdered += 1;
			System.out.printf("Disc added to cart. (%d)\n", qtyOrdered);
		} else {
			System.out.println("The cart is full. Cannot add.");
		}
	}
	
	public void removeDigitalVideoDisc (DigitalVideoDisc disc) {
		if (itemsOrdered.remove(disc)) {
			qtyOrdered -= 1;
			System.out.println("Disc removed.");
		} else {
			System.out.println("Disc doesn't exist.");
		}

	}
	
	public  float totalCost() {
		float total = 0;
		for (int i = 0; i < itemsOrdered.size(); i++) 
		{
			total = total + itemsOrdered.get(i).getCost();
		}
		
		return total;
	}
}
