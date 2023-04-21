// Fig. 6.8: Craps.java
// Craps class simulates the dice game craps
import java.security.SecureRandom;

// Defining the Craps class
public class Craps {
    // Object that generates random numbers for dice
    private static final SecureRandom randomNumbers = new SecureRandom();

    // Defining the possible statuses for the game using enum
    private enum Status {CONTINUE, WON, LOST};

    // Defining values rolled with dice
    private static final int SNAKE_EYES = 2;
    private static final int TREY = 3;
    private static final int SEVEN = 7;
    private static final int YO_LEVEN = 11;
    private static final int BOX_CARS = 12;

    // Main function
    public static void main(String[] args) {
        // Arrays that count number of losses and losses for every possible roll number
        int[] winCount = new int[11];
        int[] lossCount = new int[11];

        // Initializing tracker variables for rolls, wins, losses
        int totalRolls = 0;
        int totalWins = 0;
        int totalLosses = 0;

        // Rolls the dice 1000000 times
        for (int counter = 0; counter < 1000000; counter++) {
            
            // Point if no win or loss on first roll
            int myPoint = 0;
            // Can contain CONTINUE, WON, or LOST
            Status gameStatus;
            // Rolls dice
            int sumOfDice = rollDice();
            
            // Determines game status based on dice
            switch (sumOfDice) {
                case SEVEN:
                case YO_LEVEN:
                    gameStatus = Status.WON;
                    break;
                case SNAKE_EYES:
                case TREY:
                case BOX_CARS:
                    gameStatus = Status.LOST;
                    break;
                default:
                    gameStatus = Status.CONTINUE;
                    myPoint = sumOfDice;
                    break;
            }

            // Rolling dice again if necessary for outcome
            int rollNum = 1;

            while (gameStatus == Status.CONTINUE) {
                sumOfDice = rollDice();
                rollNum++;

                if (sumOfDice == myPoint) {
                    gameStatus = Status.WON;
                }
                else {
                    if (sumOfDice == SEVEN) {
                        gameStatus = Status.LOST;
                    }
                }
            }

            // Ubdating win/loss count arrays and total wins/losses/rolls
            if (gameStatus == Status.WON) {
                if (rollNum <= 10) {
                    winCount[rollNum - 1]++;
                }
                else {
                    winCount[10]++;
                }
                totalWins++;
            }
            else {
                if (rollNum <= 10) {
                    lossCount[rollNum - 1]++;
                }
                else {
                    lossCount[10]++;
                }
                totalLosses++;
            }

            totalRolls += rollNum;
        }

        // Displaying the results
        System.out.printf("Games won on first roll: %d(%.2f%%)%n", winCount[0], (winCount[0] * 100.0 / totalRolls));
        System.out.printf("Games won on second roll: %d(%.2f%%)%n", winCount[1], (winCount[1] * 100.0 / totalRolls));
        System.out.printf("Games won on third roll: %d(%.2f%%)%n", winCount[2], (winCount[2] * 100.0 / totalRolls));
        System.out.printf("Games won on fourth roll: %d(%.2f%%)%n", winCount[3], (winCount[3] * 100.0 / totalRolls));
        System.out.printf("Games won on fifth roll: %d(%.2f%%)%n", winCount[4], (winCount[4] * 100.0 / totalRolls));
        System.out.printf("Games won on sixth roll: %d(%.2f%%)%n", winCount[5], (winCount[5] * 100.0 / totalRolls));
        System.out.printf("Games won on seventh roll: %d(%.2f%%)%n", winCount[6], (winCount[6] * 100.0 / totalRolls));
        System.out.printf("Games won on eighth roll: %d(%.2f%%)%n", winCount[7], (winCount[7] * 100.0 / totalRolls));
        System.out.printf("Games won on ninth roll: %d(%.2f%%)%n", winCount[8], (winCount[8] * 100.0 / totalRolls));
        System.out.printf("Games won on tenth roll: %d(%.2f%%)%n", winCount[9], (winCount[9] * 100.0 / totalRolls));
        System.out.printf("Games won after the tenth roll: %d(%.2f%%)%n", winCount[10], (winCount[10] * 100.0 / totalRolls));
        System.out.println();
        System.out.printf("Games lost on first roll: %d(%.2f%%)%n", lossCount[0], (lossCount[0] * 100.0 / totalRolls));
        System.out.printf("Games lost on second roll: %d(%.2f%%)%n", lossCount[1], (lossCount[1] * 100.0 / totalRolls));
        System.out.printf("Games lost on third roll: %d(%.2f%%)%n", lossCount[2], (lossCount[2] * 100.0 / totalRolls));
        System.out.printf("Games lost on fourth roll: %d(%.2f%%)%n", lossCount[3], (lossCount[3] * 100.0 / totalRolls));
        System.out.printf("Games lost on fifth roll: %d(%.2f%%)%n", lossCount[4], (lossCount[4] * 100.0 / totalRolls));
        System.out.printf("Games lost on sixth roll: %d(%.2f%%)%n", lossCount[5], (lossCount[5] * 100.0 / totalRolls));
        System.out.printf("Games lost on seventh roll: %d(%.2f%%)%n", lossCount[6], (lossCount[6] * 100.0 / totalRolls));
        System.out.printf("Games lost on eighth roll: %d(%.2f%%)%n", lossCount[7], (lossCount[7] * 100.0 / totalRolls));
        System.out.printf("Games lost on ninth roll: %d(%.2f%%)%n", lossCount[8], (lossCount[8] * 100.0 / totalRolls));
        System.out.printf("Games lost on tenth roll: %d(%.2f%%)%n", lossCount[9], (lossCount[9] * 100.0 / totalRolls));
        System.out.printf("Games lost after the tenth roll: %d(%.2f%%)%n", lossCount[10], (lossCount[10] * 100.0 / totalRolls));

        int averageLength = totalRolls / (totalWins + totalLosses);   
        System.out.println();
        System.out.println("The average length of a game of craps is " + averageLength + " rolls.");
    }

    public static int rollDice() {
      // pick random die values
      int die1 = 1 + randomNumbers.nextInt(6); // first die roll
      int die2 = 1 + randomNumbers.nextInt(6); // second die roll

      int sum = die1 + die2; // sum of die values

      return sum;
    }
}

/*
a/b. The program stores the number of wins and losses the same, using arrays and depending on the array item.

c. The chances of winning are 244/495, or about 49.3%.

d. The average length of a game of craps can be calculated by: averageLength = totalRolls / (totalWins + totalLosses)

e. No, since each roll is its own event with the same probability of winning or losing.
*/