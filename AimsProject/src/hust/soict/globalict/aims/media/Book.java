package hust.soict.globalict.aims.media;

import java.util.ArrayList;
import java.util.List;

public class Book extends Media {
	private List<String> authors = new ArrayList<String>();

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
	
	public String getAuthors() {
		StringBuilder stringBuilder = new StringBuilder();
		for (int i = 0; i < authors.size(); i++) {
			stringBuilder.append(authors.get(i));
			if (i != authors.size() - 1)
				stringBuilder.append(", ");
		}
		return stringBuilder.toString();
	}
	
	public String toString() {
		return String.format("Book - %s - %s - %s: %s $", 
			this.getTitle(), 
			this.getCategory(), 
			this.getAuthors(),
			this.getCost()
		);
	}

	public Book(String title, String category, float cost) {
		super(title, category, cost);
		// TODO Auto-generated constructor stub
	}

	public Book(String title, String category) {
		super(title, category);
		// TODO Auto-generated constructor stub
	}

	public Book(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
}
