# Blackjack

![alt text](https://images.ctfassets.net/93v9a59si7ol/2aHiswcjTt7sXcWtJ7JzAZ/c8759819f9bc7aabac9c6b86bc95ce66/top-view-of-blackjack-table.png?w=1160&h=640&fit=thumb)

Welcome to the casino! This is a simple implementation of the classic and immensly popular card game Blackjack, coded using Java. The user will go up against a computer dealer, trying to get a hand value as close to 21 as possible without going bust.

### Rules
- The game is played with a standard deck of 52 playing cards.
- Those cards have certain values:
    - Number cards (2-10): face value
    - Face cards (J, Q, K): 10
    - Ace (A): 1
- The game starts with the player and the dealer each dealt two cards.
- While the player's cards are dealt facing up, only one of the dealer's cards is visible to the table.
- The player has either the option to "hit" (get dealt another card) or "stay" (keep their current hand).
- You can continue to hit until either both the player and the dealer stay or the hand value exceeds 21, losing the game.
- Once the first turn is completed, the dealer must reveal their second card.
- While the dealer has 16 or less, they must hit, but once they reach 17 they are forced to stay.
- If the dealer busts, the player automatically wins. If this does not occur, the player and dealer compare their hands and whichever one is closest to 21 without going over is the winner.
- After each round, the player may decide to stay at the table and keep playing or quit.

### Scope of Implementation
- This is a text-based implementation of Blackjack played in the console.
- The game uses a standard deck of 52 playing card which simulate getting shuffled through and dealt.
- Based on user input, the player can choose to hit or stay
- The game keeps track of the player's hand value, dealer's hand value, and whether or not either one has busted.
- The game determines the winner based on hand values and gives the result.
- The game allows for playing again or quitting after a round is complete.