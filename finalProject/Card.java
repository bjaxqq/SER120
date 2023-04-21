public class Card {
	
	// Defining the private instance variables that will hold the face and suit
	private final String face;
	private final String suit;
	
	// Initializing the card's face and suit variables
	public Card(String cardFace, String cardSuit) {
		this.face = cardFace;
		this.suit = cardSuit;
	}
	
	// toString method so that the card's face and suit returns as a String
	public String toString() {
		return this.face + " of " + this.suit;
	}
	
	// Getter method to return the card's face
	public String getFace() {
		return this.face;
	}
	
	// Getter method that returns the card's suit
	public String getSuit() {
		return this.suit;
	}
}
