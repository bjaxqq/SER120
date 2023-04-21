import java.util.Scanner;

public class PlayGame {
	public static void main(String[] args) {
		// Create a deck of cards
		DeckOfCards deck = new DeckOfCards();
		// Create scanner object
		Scanner scanner = new Scanner(System.in);
		// Create boolean object to see if player wants to play again
		boolean continueGame = true;
		
		do {
			// Simulate the game
			game(deck);
			
			//Check to see if player wants to play again
			System.out.println("\nWould you like to play again? (Y/N)");
			String playAgain = scanner.nextLine();
			
			// If player says no, quit game
			// Otherwise continue
			if(playAgain.toUpperCase().equals("N")) {
				continueGame = false;
				System.out.println("\nThanks for playing!");
			}
			
		} while(continueGame);
	}
	
	public static void game(DeckOfCards deck) {
		// Create arrays that are big enough to hold any hand in blackjack
		Card[] playerHand = new Card[11], dealerHand = new Card[11];
		// Create ints to track value of player and dealer's hand
		int playerHandVal = 0, dealerHandVal = 0;
		// Create a variable to count the indexes of player and dealer's hand
		int playerHandIndex = 0, dealerHandIndex = 0;
		// Create booleans to track is the player or dealer has gone bust
		boolean playerBust = false, dealerBust = false;
		// Create Scanner object
		Scanner scanner = new Scanner(System.in);
		
		// Shuffle the deck
		deck.shuffle();
		
		// Deal first two cards each to player and dealer
		// Increment the indexes as we're dealing
		// Since they're post-increment operators,
		// they'll only increment after the card has been dealt
		playerHand[playerHandIndex++] = deck.dealCard();
		dealerHand[dealerHandIndex++] = deck.dealCard();
		playerHand[playerHandIndex++] = deck.dealCard();
		dealerHand[dealerHandIndex++] = deck.dealCard();
		
		// Calculate and print out player's hand
		System.out.print("Your hand is: ");
		printHand(playerHand);
		playerHandVal = calculateHand(playerHand);
		System.out.println("Your hand value is " + playerHandVal + "\n");
		
		dealerHandVal = calculateHand(dealerHand);
		System.out.println("Dealer's hand value is " + dealerHandVal + "\n");
		
		// If you and/or the dealer have a value of over 21, you went bust
		// If you go bust you lose
		// If dealer goes bust you win
		// If you both go bust you tie
		if(playerHandVal > 21 && dealerHandVal > 21) {
			playerBust = true;
			dealerBust = true;
			System.out.println("You and the dealer both went bust!");
			System.out.println("You tied the game with " + playerHandVal + " points to the dealer's " + dealerHandVal + " points.");
		}
		else if(playerHandVal > 21 && dealerHandVal <= 21) {
			playerBust = true;
			System.out.println("You went bust!");
			System.out.println("You lost the game with " + playerHandVal+" points to the dealer's " + dealerHandVal + " points.");
		}
		else if(dealerHandVal>21 && playerHandVal<=21) {
			dealerBust = true;
			System.out.println("The dealer went bust!");
			System.out.println("You won the game with " + playerHandVal + " points to the dealer's " + dealerHandVal + " points.");
		}
		
		// Create variable to use for loop to see if both player and dealer stayed
		// If both the player and dealer stay, then the game is over and
		// it will be determined who won by comparing points
		boolean hit = true;
		
		while(!playerBust && !dealerBust && hit) {
			// Ask player if they would like another card
			System.out.println("Would you like another card? (Y/N)");
			String answer = scanner.nextLine();
			
			if(answer.toUpperCase().equals("Y")) {
				playerHand[playerHandIndex++] = deck.dealCard();
				System.out.print("\nYour hand is: ");
				printHand(playerHand);
				playerHandVal = calculateHand(playerHand);
				System.out.println("Your hand value is " + playerHandVal);
			}
			else {
				System.out.println("\nYou stayed.");
				// If the dealer's hand value is 17 or above, they will stay
				// If both the player and dealer stay, the game is over
				if(dealerHandVal >= 17) {
					hit = false;
				}
			}
			
			// According to most casinos, the rules set for dealers
			// are that they should always hit when the value of the
			// hand is 16 or under, and always stay when the 
			// value of the hand is 17 or above
			if(dealerHandVal <= 16) {
				System.out.println("\nThe dealer took a new card.");
				dealerHand[dealerHandIndex++] = deck.dealCard();
				dealerHandVal = calculateHand(dealerHand);
				System.out.println("Dealer's hand value is " + dealerHandVal + "\n");
			}
			else {
				System.out.println("\nThe dealer stayed.");
			}
			
			// Check if anybody went bust
			if(playerHandVal > 21 && dealerHandVal > 21) {
				playerBust = true;
				dealerBust = true;
				System.out.println("You and the dealer both went bust!");
				System.out.println("You tied the game with " + playerHandVal + " points to the dealer's " + dealerHandVal + " points.");
			}
			else if(playerHandVal > 21 && dealerHandVal <= 21) {
				playerBust = true;
				System.out.println("You went bust!");
				System.out.println("You lost the game with " + playerHandVal+" points to the dealer's " + dealerHandVal + " points.");
			}
			else if(dealerHandVal > 21 && playerHandVal <= 21) {
				dealerBust = true;
				System.out.println("The dealer went bust!");
				System.out.println("You won the game with " + playerHandVal + " points to the dealer's " + dealerHandVal + " points.");
			}
		}
		
		// If nobody went bust, then player and dealer both stayed
		// That means whoever has more points wins
		if(!dealerBust && !playerBust) {
			if(playerHandVal > dealerHandVal) {
				System.out.println("\nYou won the game with " + playerHandVal + " points to the dealer's " + dealerHandVal + " points.");
			}
			else if(dealerHandVal>playerHandVal) {
				System.out.println("\nYou lost the game with " + playerHandVal + " points to the dealer's " + dealerHandVal + " points.");
			}
			else {
				System.out.println("\nYou tied the game with " + playerHandVal + " points to the dealer's " + dealerHandVal + " points.");
			}
		}	
	}
	
	public static void printHand(Card[] hand) {
		// Create a for loop that goes through the whole hand
		for(int index = 0; index < hand.length; index++) {
			// If the card is not null, print it out
			if(hand[index] != null) {
				System.out.print(hand[index]);
				// Only print out a comma after the card name if it's not the last card in our hand. 
				// The index+1 could cause an index out of bounds exception here, but I used short circuiting with
				// the first condition to ensure that index+1 would never cause an index out of bounds exception.
				if(index != hand.length-1 && hand[index+1] != null) {
					System.out.print(", ");
				}
			}
		}
		System.out.print("\n");
	}
	
	public static int calculateHand(Card[] hand) {
		// Create a variable to track the value of the hand
		int value = 0;
		// Create a loop to go through the whole hand
		for(int index=0;index<hand.length;index++) {
			// If the card is not null, check its face 
			// and add the appropriate value to the value variable
			if(hand[index]!=null) {
				if(hand[index].getFace()=="Ace") {
					value += 1;
				}
				if(hand[index].getFace()=="Deuce") {
					value += 2;
				}
				if(hand[index].getFace()=="Three") {
					value += 3;
				}
				if(hand[index].getFace()=="Four") {
					value += 4;
				}
				if(hand[index].getFace()=="Five") {
					value += 5;
				}
				if(hand[index].getFace()=="Six") {
					value += 6;
				}
				if(hand[index].getFace()=="Seven") {
					value += 7;
				}
				if(hand[index].getFace()=="Eight") {
					value += 8;
				}
				if(hand[index].getFace()=="Nine") {
					value += 9;
				}
				if(hand[index].getFace()=="Ten") {
					value += 10;
				}
				if(hand[index].getFace()=="Jack") {
					value += 11;
				}
				if(hand[index].getFace()=="Queen") {
					value += 12;
				}
				if(hand[index].getFace()=="King") {
					value += 13;
				}
			}
		}
		// Return the value
		return value;
	}
}