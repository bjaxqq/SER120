import java.security.SecureRandom;
import java.util.Arrays;

public class BubbleSort {
    // create a SecureRandom object for generating random integers
    public static SecureRandom random = new SecureRandom();
    // specify the size of the array to be sorted
    public static final int ARRAY_SIZE = 10;

    // implementation of the bubble sort algorithm
    public static void bubbleSort(int[] elements) {
        // iterate over the array from the first element to the last
        for (int index1 = 0; index1 < elements.length; index1++) {
            // iterate over the unsorted part of the array from the first element to the last unsorted element
            for (int index2 = 0; index2 < elements.length - index1 - 1; index2++) {
                // if the current element is greater than the next element, swap them
                if (elements[index2] > elements[index2 + 1]) {
                    int temp = elements[index2];
                    elements[index2] = elements[index2 + 1];
                    elements[index2 + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // create a new array of integers with the specified size
        int[] elements = new int[ARRAY_SIZE];

        // fill the array with random integers
        for (int index = 0; index < elements.length; index++) {
            elements[index] = random.nextInt(2000);
        }

        // sort the array using the bubble sort algorithm
        bubbleSort(elements);

        // print the sorted array to the console
        System.out.println(Arrays.toString(elements));

        // print each element of the sorted array to the console on a new line
        for (int item: elements) {
            System.out.println(item);
        }
    }
}