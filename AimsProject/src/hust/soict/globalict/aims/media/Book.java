package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public void addAuthor(String authorName) {
		if (this.authors.contains(authorName)) {
			System.out.println("Author already added.");
		} else {
			this.authors.add(authorName);
			System.out.println("Added " + authorName);
		}
	}
	
	public void removeAuthor(String authorName) {
		if (this.authors.remove(authorName)) {
			System.out.println("Author does not exist.");
		} else {
			System.out.println("Removed " + authorName);
		}	
	}
	
	

}
