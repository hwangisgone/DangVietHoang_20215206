package aims;
import java.util.ArrayList;
import java.util.List;

public class Cart {
	public static final int MAX_NUMBERS_ORDERED = 20;
	private List<DigitalVideoDisc> itemsOrdered = new ArrayList<DigitalVideoDisc>();
	private int totalQtyOrdered = 0;
	
	//private int qtyOrdered = 0;
	
	public String addDigitalVideoDisc (DigitalVideoDisc disc) {
		String warning = "";
		if (itemsOrdered.size() < MAX_NUMBERS_ORDERED) {
			itemsOrdered.add(disc);
			System.out.printf("Disc added to cart. (%d)\n", itemsOrdered.size());
		} else {
			warning = "The cart is full. Cannot add.";
			System.out.println(warning);
		}
		return warning;
	}
	
	public String removeDigitalVideoDisc (DigitalVideoDisc disc) {
		String warning = "";
		if (itemsOrdered.remove(disc)) {
			System.out.println("Disc removed.");
		} else {
			warning = "Disc doesn't exist.";
			System.out.println(warning);
		}
		return warning;

	}
	
	public String getContentAllDVD() {
		String buffer = "";
        for (int i = 0; i < itemsOrdered.size(); i++) {
            buffer += itemsOrdered.get(i).getTitle() + "\n";
        }
        
        return buffer;
	}
	
	public float totalCost() {
		float total = 0;
		for (int i = 0; i < itemsOrdered.size(); i++) 
		{
			total = total + itemsOrdered.get(i).getCost();
		}
		
		return total;
	}
	
	public void print() {
		System.out.println("***********************CART***********************");
		System.out.println("Ordered Items:");
		
		DigitalVideoDisc dvd;
        for (int i = 0; i < this.itemsOrdered.size(); i++) {
        	dvd = this.itemsOrdered.get(i);
        	System.out.printf("%d. %s\n", i+1, dvd.toString());
        }

		System.out.println("Total cost: " + this.totalCost() + "$");
		System.out.println("***************************************************");
	}
	
	public void searchByID(int id) {
		System.out.println("Search for: " + id);
		
		DigitalVideoDisc dvd;
        for (int i = 0; i < this.itemsOrdered.size(); i++) {
        	dvd = this.itemsOrdered.get(i);
        	if (dvd.getId() == id) {
        		System.out.println("Found: " + dvd.toString());
        		return;
        	}
        }
        System.out.println("Disc not found.");
	}
	
	public void searchByTitle(String keywords) {
		System.out.println("- Search for: \"" + keywords + "\"");
		
		int found = 0;
		DigitalVideoDisc dvd;
        for (int i = 0; i < this.itemsOrdered.size(); i++) {
        	dvd = this.itemsOrdered.get(i);
        	if (dvd.isMatch(keywords)) {
        		System.out.println("Found: " + dvd.toString());
        		// No return because there maybe many found
        		found += 1;
        	}
        }
        if (found == 0) {
        	System.out.println("Disc not found.");    	
        }
	}
}
