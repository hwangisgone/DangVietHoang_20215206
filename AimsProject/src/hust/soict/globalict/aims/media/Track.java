package hust.soict.globalict.aims.media;

import hust.soict.globalict.aims.exception.PlayerException;

public class Track implements Playable {
	private String title;
	private int length;

	@Override
	public boolean equals(Object obj) {
		if (obj == this) {
			return true;
		}
		if (!(obj instanceof Track)) {
			return false;
		}
		return ((Track)obj).getTitle() == this.getTitle() && 
				((Track)obj).getLength() == this.getLength();
	}
		
	public void play() throws PlayerException {
		if (this.getLength() > 0) {
			System.out.println("Playing Track: " + this.getTitle());
			System.out.println("Track length: " + this.getLength());
		} else {
			throw new PlayerException("ERROR: Track " + this.getTitle() + " length is non-positive");
		}
	}
	
	public String getTitle() {
		return title;
	}
	public int getLength() {
		return length;
	}
	
	public Track(String title, int length) {
		super();
		this.title = title;
		this.length = length;
	}
}
