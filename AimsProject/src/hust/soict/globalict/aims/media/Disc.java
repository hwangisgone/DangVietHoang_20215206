package hust.soict.globalict.aims.media;

public class Disc extends Media {
	private String director;
	private int length;

	
	



	public Disc(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
	public Disc(String title, String category) {
		super(title, category);
		// TODO Auto-generated constructor stub
	}
	public Disc(String title, String category, float cost) {
		super(title, category, cost);
		// TODO Auto-generated constructor stub
	}

	
	// By title, category, director, and cost
	public Disc(String title, String category, String director, float cost) {
		super(title, category, cost);
		this.director = director;
	}

	public Disc(String title, String category, int length, float cost) {
		super(title, category, cost);
		this.length = length;
	}

	// By all
	public Disc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.director = director;
		this.length = length;
	}
	

	
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
}
