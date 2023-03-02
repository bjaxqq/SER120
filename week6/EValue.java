import java.util.Scanner;

public class EValue {
    public static long factorial(int num) {
        long fact = 1;

        for(int count = 1; count <= num; count++) {
            fact = fact * count;
        }

        return fact;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a value for x: ");
        int x = input.nextInt();
        System.out.flush();
        System.out.print("Please enter a value for n: ");
        int n = input.nextInt();

        double currentTerm = 1.0;
        double result = 1.0;

        for(int count = 1; count < n; count++) {
            currentTerm = Math.pow(x, count)/EValue.factorial(count);
            result = result + currentTerm;
        }

        System.out.println("Result is:" + result);
    }
}