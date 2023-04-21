import java.security.SecureRandom;

public class DeckOfCards {
	
	// Create a SecureRandom object for generating random numbers
	private static final SecureRandom randomNumbers = new SecureRandom();
	
	// Define the number of cards in the deck
	private static final int NUMBER_OF_CARDS = 52;
	
	// Create an array of Card objects to represent the deck
	private Card[] deck = new Card[NUMBER_OF_CARDS];
	
	// Keep track of the current card in the deck
	private int currentCard = 0;
	
	// Constructor to create a new deck of cards
	public DeckOfCards() {
		// Define arrays of strings for the card faces and suits
		String[] faces = {"Ace", "Deuce", "Three", "Four", "Five", "Six",
				"Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
		String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
		
		// Use a loop to populate the deck array with Card objects
		for(int count = 0; count < deck.length; count++) {
			deck[count] = new Card(faces[count % 13], suits[count / 13]);
		}
	}
	
	// Method to shuffle the deck
	public void shuffle() {
		// Reset the current card count to 0
		currentCard = 0;
		
		// Use a loop to swap each card in the deck with another randomly selected card
		for(int first = 0; first < deck.length; first++) {
			int second = randomNumbers.nextInt(NUMBER_OF_CARDS);
			Card temp = deck[first];
			deck[first] = deck[second];
			deck[second] = temp;
		}
	}
	
	// Method to deal a card from the deck
	public Card dealCard() {
		// If there are still cards left in the deck, return the current card and increment the current card count
		if(currentCard < deck.length) {
			return deck[currentCard++];
		}
		// If there are no cards left in the deck, return null
		else {
			return null;
		}
	}
}
