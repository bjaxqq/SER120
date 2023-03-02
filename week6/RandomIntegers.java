import java.security.SecureRandom; // program uses class SecureRandom

public class RandomIntegers {
    public static void main(String[] args) {
        // randomNumbers object will produce secure random numbers
        SecureRandom randomNumber = new SecureRandom();

        int outcome = 1 + randomNumber.nextInt(6); // gives a random number between 0 and 6, +1 normalizes it
        // System.out.println(outcome);

        int frequency1 = 0, frequency2 = 0, frequency3 = 0, frequency4 = 0, frequency5 = 0, frequency6 = 0;

        for(int count = 0; count < 20000000; count++) {
            outcome = 1 + randomNumber.nextInt(6);

            switch(outcome) {
                case 1:
                    frequency1++;
                    break;
                case 2:
                    frequency2++;
                    break;
                case 3:
                    frequency3++;
                    break;
                case 4:
                    frequency4++;
                    break;
                case 5:
                    frequency5++;
                    break;
                case 6:
                    frequency6++;
                    break;
            }
        }
        System.out.println("1 came " + (frequency1/20000000.0)*100 + "% times.");
        System.out.println("2 came " + (frequency2/20000000.0)*100 + "% times.");
        System.out.println("3 came " + (frequency3/20000000.0)*100 + "% times.");
        System.out.println("4 came " + (frequency4/20000000.0)*100 + "% times.");
        System.out.println("5 came " + (frequency5/20000000.0)*100 + "% times.");
        System.out.println("6 came " + (frequency6/20000000.0)*100 + "% times.");
    }
}