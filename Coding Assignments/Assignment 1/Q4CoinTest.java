package Coding Assignments.Assignment 1;

// creating CoinTest class
public class Q4CoinTest {
    // creating main function
    public static void main(String[] args) {
        Coin userCoin = new Coin();

        // Display initial side facing up
        System.out.println("The initial side facing up is " + userCoin.getSideUp());

        // Toss the coin 20 times and display results
        int numHeads = 0;
        int numTails = 0;

        for (int i = 1; i <= 20; i++) {
            userCoin.toss();
            System.out.println("Toss " + i + ": " + userCoin.getSideUp());

            if (userCoin.getSideUp().equals("heads")) {
                numHeads++;
            } 
            else {
                numTails++;
            }
        }

        // Display number of heads and tails
        System.out.println("Heads count: " + numHeads);
        System.out.println("Tails count: " + numTails);
    }
}