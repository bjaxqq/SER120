package week12.Assignment3.Q4DoubleArray;

public class ArrayInitializer {
    public static void main(String[] args) {
        final int N = 10;
        double[] arr = new double[N];

        try {
            for (int index = 0; index < N; index++) {
                arr[index] = Math.sqrt(index);
            }
        } catch (Exception e) {
            System.err.println("An error has occured: " + e.getMessage());
        }

        for(int index = 0; index < N; index++) {
            System.out.println("arr[" + index + "] = " + arr[index]);
        }
    }
}