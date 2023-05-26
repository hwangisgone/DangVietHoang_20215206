package hust.soict.globalict.test.disc;

import hust.soict.globalict.aims.media.DigitalVideoDisc;

public class TestPassingParameter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		
		swap(jungleDVD, cinderellaDVD);
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
		System.out.println("cinderella dvd title: " + cinderellaDVD.getTitle());
		
		changeTitle(jungleDVD, cinderellaDVD.getTitle());
		System.out.println("jungle dvd title: " + jungleDVD.getTitle());
	}
	
	
	// OLD
//	public static void swap(Object o1, Object o2) {
//		Object tmp = o1;
//		o1 = o2;
//		o2 = tmp;
//	}


	// NEW
	public static void swap(DigitalVideoDisc dvd1, DigitalVideoDisc dvd2) {		
		String title = dvd1.getTitle();
		String category = dvd1.getCategory();
		String director = dvd1.getDirector();
		int length = dvd1.getLength();
		float cost = dvd1.getCost();
		
		dvd1 = new DigitalVideoDisc(
			dvd2.getTitle(), 
			dvd2.getCategory(), 
			dvd2.getDirector(),
			dvd2.getLength(),
			dvd2.getCost()
		);
		
		dvd2 = new DigitalVideoDisc(title, category, director, length, cost);
	}

	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
}
