package Weekly Objectives and Work.Week 6;

import java.util.Random;

public class W6DiceProbability {
    public static void main(String[] args) {
        int rolls = 1000000; // Number of rolls
        int[] rollCounts = new int[6]; // Array to store the count of each roll

        Random random = new Random();

        // Roll the die and count the occurrences of each roll
        for (int counter = 0; counter < rolls; counter++) {
            int roll = random.nextInt(6) + 1; // Generate a random number from 1 to 6
            rollCounts[roll - 1]++; // Increment the count for the corresponding roll
        }

        // Calculate and display the probability distribution
        System.out.println("Roll\tCount\tProbability");
        System.out.println("---------------------------");
        for (int counter = 0; counter < 6; counter++) {
            int roll = counter + 1;
            int count = rollCounts[i];
            double probability = (double) count / rolls;
            System.out.printf("%d\t%d\t%.4f%n", roll, count, probability);
        }
    }
}
