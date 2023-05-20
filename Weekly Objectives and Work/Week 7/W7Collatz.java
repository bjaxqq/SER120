package Weekly Objectives and Work.Week 7;

import java.util.Scanner;

public class W7Collatz {
    public static boolean isPrime(int num) {
        if (num == 1 || num == 2) {
            return true;
        }

        for (int counter = 2; counter < Math.ceil(Math.sqrt(num)); counter++) {
            if (num % counter == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number (larger than 2): ");
        int num = input.nextInt();

        int primeCount = 0;
        int steps = 0;

        while (true) {
            System.out.print(num);
            if (num % 2 == 0) {
                num /= 2; // If the number is even, divide by 2.
            } else {
                if (CollatzConjecture.isPrime(num)) {
                    primeCount++; // Adds 1 to the prime counter when the number is prime.
                }
                num = num * 3 + 1; // If the number is odd, take the number, multiply by 3, and add 1.
            }
            steps++;
            if (num == 1) {
                System.out.println("-> 1");
                break;
            }
            System.out.print(" -> ");
        }
        System.out.println("\nNumber of primes encountered: " + primeCount);
        System.out.println("Total steps taken: " + steps);
    }
}