import java.security.SecureRandom;
import java.util.Arrays;

public class SortingPractice {
    public static SecureRandom random = new SecureRandom();
    public static final int ARRAY_SIZE = 10;

    // Pass by value vs. Pass by reference

    // if code is 0, means ascending, otherwise descending
    public static void sort(int[] elements, int code) {
        // iterate through all elements in the array
        for (int index1 = 0; index1 < elements.length - 1; index1++) {
            // iterate through remaining elements in the array
            for (int index2 = index1 + 1; index2 < elements.length; index2++) {
                // sort the elements in ascending order
                if (code == 0) {
                    if (elements[index1] > elements[index2]) {
                        int temp = elements[index1];
                        elements[index1] = elements[index2];
                        elements[index2] = temp;
                    }
                // sort the elements in descending order
                } else {
                    if (elements[index1] < elements[index2]) {
                        int temp = elements[index1];
                        elements[index1] = elements[index2];
                        elements[index2] = temp;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        // create an array with random integers
        int[] elements = new int[ARRAY_SIZE];

        for (int index = 0; index < elements.length; index++) {
            elements[index] = random.nextInt(2000);
        }

        // code variable to determine ascending or descending order
        int code = 0;

        // sort the elements in the array
        SortingPractice.sort(elements, code);

        // print the sorted array
        System.out.println(Arrays.toString(elements));

        // print each element in the array
        for (int item : elements) {
            System.out.println(item);
        }
    }
}