package aims;

import java.util.ArrayList;
import java.util.List;

public class Store {
	private List<DigitalVideoDisc> itemsInStore = new ArrayList<DigitalVideoDisc>();
	
	public void addDVD(DigitalVideoDisc dvd) {
		this.itemsInStore.add(dvd);
		System.out.println("Disc added.");
	}
	
	public String removeDVD(DigitalVideoDisc dvd) {
		String warning = "";
		if (this.itemsInStore.remove(dvd)) {
			System.out.println("Disc removed.");
		} else {
			warning = "Disc doesn't exist.";
			System.out.println(warning);
		}
		return warning;
	}
	
	public void print() {
		System.out.print("[");
		int lastindex = this.itemsInStore.size() - 1;
        for (int i = 0; i <= lastindex; i++) {
            System.out.print(this.itemsInStore.get(i).getTitle() + (i == lastindex ? "" : ", "));
        }
        System.out.println("]");
	}
}
