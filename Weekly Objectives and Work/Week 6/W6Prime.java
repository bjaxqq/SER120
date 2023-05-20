package Weekly Objectives and Work.Week 6;

import java.util.Scanner;

public class W6Prime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        boolean prime = true;

        if (n <= 1) {
            prime = false;
        } else {
            for (int counter = 2; counter <= Math.sqrt(n); counter++) {
                if (n % counter == 0) {
                    prime = false;
                    break; // Exit the loop if a factor is found
                }
            }
        }

        if (prime) {
            System.out.println(n + " is a prime number.");
        } else {
            System.out.println(n + " is not a prime number.");
        }
    }
}
