package week11;

import java.io.FileNotFoundException;
import java.security.SecureRandom;
import java.util.Arrays;

public class TestLocal {
    public static void testPassByValue(int code) {
        code = 10;
    }

    public static void main(String[] args) throws FileNotFoundException {
        final int ARRAY_SIZE = 2000000;
        int arr[] = new int[ARRAY_SIZE];
        int arrCopy[] = new int[ARRAY_SIZE];

        SecureRandom random = new SecureRandom();

        for(int index = 0; index < ARRAY_SIZE; index++) {
            arr[index] = random.nextInt(42000);
        }

        System.arraycopy(arr, 0, arrCopy, 0, arr.length);

        long start = System.currentTimeMillis();
        Arrays.sort(arrCopy);
        long end = System.currentTimeMillis();
        System.out.println("Time to sort: " + (end-start) + " ms");

        System.arraycopy(arr, 0, arrCopy, 0, arr.length);
        start = System.currentTimeMillis();
        Arrays.sort(arrCopy);
        end = System.currentTimeMillis();
        System.out.println("Time to sort: " + (end-start) + " ms");
    }
}
