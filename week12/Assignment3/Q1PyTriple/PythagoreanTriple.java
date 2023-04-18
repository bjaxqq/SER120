package week12.Assignment3.Q1PyTriple;

public class PythagoreanTriple {
    public static void main(String[] args) {
        // Print header for Pythagorean Triples Table
        System.out.println("Pythagorean Triples Table:");
        // Print column headings
        System.out.println("Side1\tSide2\tHypotenuse");
        // Print separator line
        System.out.println("--------------------------");

        // Loop through all possible side lengths (1-500) for s1
        for (int s1 = 1; s1 <= 500; s1++) {
            // Loop through all possible side lengths (s1-500) for s2
            for (int s2 = s1; s2 <= 500; s2++) {
                // Loop through all possible side lengths (s2-500) for h
                for (int h = s2; h <= 500; h++) {
                    // Print if (s1, s2, h) is a Pythagorean triple
                    if (isTriple(s1, s2, h)) {
                        System.out.println(s1 + "\t" + s2 + "\t" + h);
                    }
                }
            }
        }
    }

    // Check if (s1, s2, h) is a Pythagorean triple
    public static boolean isTriple(int s1, int s2, int h) {
        return (s1 * s1 + s2 * s2 == h * h);
    }
}