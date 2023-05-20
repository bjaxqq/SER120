import java.util.Scanner;

public class PlayGame {
	public static void main(String[] args) {
		// Create a deck of cards
		DeckOfCards deck = new DeckOfCards();
		// Create scanner object
		Scanner scan = new Scanner(System.in);
		// Create boolean object to see if player wants to play again
		boolean continueGame = true;
		
		do {
			// Simulate the game
			game(deck);
			// Check to see if player wants to play again
			System.out.println("\nWould you like to play again? (Y/N)");
			String playAgain = scan.nextLine();
			
			// If player says no, quit game
			// Otherwise continue
			if(playAgain.toUpperCase().equals("N")) {
				continueGame = false;
				System.out.println("\nThanks for playing!");
			}	
		} while(continueGame);
	}
	
	// This simulates one game of blackjack
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
		Scanner scan = new Scanner(System.in);
		
		//Shuffle the deck
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
		System.out.println("Your hand is: ");
		printCard(playerHand);
		playerHandVal = calculateHand(playerHand);
		System.out.println("Your hand value is "+playerHandVal+"\n");
		
		printCard(dealerHand);
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
			System.out.println("You lost the game with " + playerHandVal + " points to the dealer's " + dealerHandVal + " points.");
		}
		else if(dealerHandVal > 21 && playerHandVal <= 21) {
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
			String answer = scan.nextLine();
			
			if(answer.toUpperCase().equals("Y")) {
				System.out.println("\nYou took a new card.");
				playerHand[playerHandIndex++] = deck.dealCard();
				System.out.println("\nYour new hand is: ");
				printCard(playerHand);
				playerHandVal = calculateHand(playerHand);
				System.out.println("Your hand value is " + playerHandVal);
			}
			else {
				System.out.println("\nYou stayed.");
				System.out.println("\nYour hand is: ");
				printCard(playerHand);
				System.out.println("Your hand value is " + playerHandVal);
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
				System.out.println("\nThe dealer's hand is: ");
				printCard(dealerHand);
				dealerHandVal = calculateHand(dealerHand);
				System.out.println("Dealer's hand value is " + dealerHandVal + "\n");
			}
			else {
				System.out.println("\nThe dealer stayed.");
				System.out.println("\nThe dealer's hand is: ");
				printCard(dealerHand);
				System.out.println("Dealer's hand value is "+dealerHandVal + "\n");
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
				System.out.println("You lost the game with " + playerHandVal + " points to the dealer's " + dealerHandVal + " points.");
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
			else if(dealerHandVal > playerHandVal) {
				System.out.println("\nYou lost the game with " + playerHandVal + " points to the dealer's " + dealerHandVal + " points.");
			}
			else {
				System.out.println("\nYou tied the game with " + playerHandVal + " points to the dealer's " + dealerHandVal + " points.");
			}
		}
	}
	
	// This prints out the cards of a hand
	public static void printCard(Card[] hand) {
		for(int index = 0; index < hand.length; index++) {
			// If the card is not null, print it out
			if(hand[index] != null) {
				// Create a string variable to represent the face of a card
				String face = "";
				
				// Check the face of the card at index and set
				// the face variable equal to the face of the card at index
				if(hand[index].getFace() == "Ace") {
					face = "1";
				}
				else if(hand[index].getFace() == "Deuce") {
					face = "2";
				}
				else if(hand[index].getFace() == "Three") {
					face = "3";
				}
				else if(hand[index].getFace() == "Four") {
					face = "4";
				}
				else if(hand[index].getFace() == "Five") {
					face = "5";
				}
				else if(hand[index].getFace() == "Six") {
					face = "6";
				}
				else if(hand[index].getFace() == "Seven") {
					face = "7";
				}
				else if(hand[index].getFace() == "Eight") {
					face = "8";
				}
				else if(hand[index].getFace() == "Nine") {
					face = "9";
				}
				else if(hand[index].getFace() == "Ten") {
					face = "10";
				}
				else if(hand[index].getFace() == "Jack") {
					face = "J";
				}
				else if(hand[index].getFace() == "Queen") {
					face = "Q";
				}
				else if(hand[index].getFace() == "King") {
					face = "K";
				}
				
				// Card will be printed out differently if
				// face is 10 because that is the only face 
				// value with two characters instead of one
				if(face != "10") {
					// Check the suit to accurately print out 
					// the card with its correct suit
					if(hand[index].getSuit() == "Hearts") {
						System.out.println("------");
						System.out.println("|" + face + "   |");
						System.out.println("| ♥︎  |");
						System.out.println("|   " + face + "|");
						System.out.println("------");
					}
					else if(hand[index].getSuit() == "Diamonds") {
						System.out.println("------");
						System.out.println("|" + face + "   |");
						System.out.println("| ♦︎  |");
						System.out.println("|   " + face + "|");
						System.out.println("------");
					}
					else if(hand[index].getSuit() == "Clubs") {
						System.out.println("------");
						System.out.println("|" + face + "   |");
						System.out.println("| ♣︎  |");
						System.out.println("|   " + face + "|");
						System.out.println("------");
					}
					else if(hand[index].getSuit() == "Spades") {
						System.out.println("------");
						System.out.println("|" + face + "   |");
						System.out.println("| ♠︎  |");
						System.out.println("|   " + face + "|");
						System.out.println("------");
					}
				}
				else {
					// Check the suit to accurately print out 
					// the card with its correct suit
					if(hand[index].getSuit() == "Hearts") {
						System.out.println("------");
						System.out.println("|" + face + "  |");
						System.out.println("| ♥︎  |");
						System.out.println("|  " + face + "|");
						System.out.println("------");
					}
					else if(hand[index].getSuit() == "Diamonds") {
						System.out.println("------");
						System.out.println("|" + face + "  |");
						System.out.println("| ♦︎  |");
						System.out.println("|  " + face + "|");
						System.out.println("------");
					}
					else if(hand[index].getSuit() == "Clubs") {
						System.out.println("------");
						System.out.println("|" + face + "  |");
						System.out.println("| ♣︎  |");
						System.out.println("|  " + face + "|");
						System.out.println("------");
					}
					else if(hand[index].getSuit() == "Spades") {
						System.out.println("------");
						System.out.println("|" + face + "  |");
						System.out.println("| ♠︎  |");
						System.out.println("|  "+ face +"|");
						System.out.println("------");
					}
				}
			}
		}
		System.out.print("\n");
	}
	
	// This calculates the value of a hand
	public static int calculateHand(Card[] hand) {
		// Create a variable to track the value of the hand
		int value = 0;
		// Create a loop to go through the whole hand
		for(int index = 0; index < hand.length; index++) {
			// If the card is not null, check its face 
			// and add the appropriate value to the value variable
			if(hand[index]!=null) {
				if(hand[index].getFace() == "Ace") {
					value+=1;
				}
				if(hand[index].getFace() == "Deuce") {
					value+=2;
				}
				if(hand[index].getFace() == "Three") {
					value+=3;
				}
				if(hand[index].getFace() == "Four") {
					value+=4;
				}
				if(hand[index].getFace() == "Five") {
					value+=5;
				}
				if(hand[index].getFace() == "Six") {
					value+=6;
				}
				if(hand[index].getFace() == "Seven") {
					value+=7;
				}
				if(hand[index].getFace() == "Eight") {
					value+=8;
				}
				if(hand[index].getFace() == "Nine") {
					value+=9;
				}
				if(hand[index].getFace() == "Ten") {
					value+=10;
				}
				if(hand[index].getFace() == "Jack") {
					value+=11;
				}
				if(hand[index].getFace() == "Queen") {
					value+=12;
				}
				if(hand[index].getFace() == "King") {
					value+=13;
				}
			}
		}
		// Return the value
		return value;
	}
}