package aims;

public class StoreTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Store localDVDStore = new Store();
		
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",	"Animation",		"Roger Allers", 87, 19.95f);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",		"Science Fiction",	"George Lucas", 87, 24.95f);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",			"Animation", 		18.99f);
		
		localDVDStore.addDVD(dvd1);
		localDVDStore.addDVD(dvd2);
		localDVDStore.print();
		System.out.println();
		
		localDVDStore.removeDVD(dvd3);
		localDVDStore.removeDVD(dvd1);
		localDVDStore.print();
		System.out.println();
		
		localDVDStore.addDVD(dvd1);
		localDVDStore.addDVD(dvd1);
		localDVDStore.addDVD(dvd1);
		localDVDStore.print();
	}

}
