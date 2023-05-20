package Weekly Objectives and Work.Week 5;

import java.util.Scanner;

public class W5EValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of x: ");
        double x = scanner.nextDouble();

        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        double result = calculateExponential(x, n);

        System.out.println("The value of e^" + x + " with " + n + " terms is: " + result);
    }

    private static double calculateExponential(double x, int n) {
        double result = 1.0;
        double factorial = 1.0;
        double power = 1.0;

        for (int counter = 1; counter <= n; counter++) {
            factorial *= counter;
            power *= x;
            result += power / factorial;
        }

        return result;
    }
}
