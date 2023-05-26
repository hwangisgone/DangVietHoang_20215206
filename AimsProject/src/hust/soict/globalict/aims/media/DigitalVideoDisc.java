package hust.soict.globalict.aims.media;

public class DigitalVideoDisc extends Media {
	private String director;
	private int length;
	
	public String getDirector() {
		return director;
	}
	public int getLength() {
		return length;
	}
	

	public String getContents() {
		String buffer = title + "<br/>" + category + "<br/>" + director + "<br/>" + length + "<br/>" + cost + "<br/>";
		return buffer;
	}
	
	public String toString() {
		return String.format("DVD - %s - %s - %s - %s: %s $", 
			this.title, 
			this.category, 
			this.director,
			this.length,
			this.cost
		);
	}
	
	public boolean isMatch(String keywords) {
		// Split the keywords into an array of individual words
		String[] words = keywords.toLowerCase().split("\\s+");
		
		// Check if any word in the array matches the DVD's title (case-insensitive)
		for (String word : words) {
			if (this.getTitle().toLowerCase().contains(word)) {
				return true;
			}
		}
		   
		// No match found
		return false;
	}
	

	
	// By title, category, director, and cost
	public DigitalVideoDisc(String title, String category, String director, float cost) {
		super(title, category, cost);
		this.director = director;
	}
	
	// By all
	public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}
	

	public DigitalVideoDisc(String title, String category, int length, float cost) {
		super(title, category, cost);
		this.length = length;
	}
}
