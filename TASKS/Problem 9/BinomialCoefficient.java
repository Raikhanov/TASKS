import java.util.Scanner;

/**
 * The `BinomialCoefficient` class computes the binomial coefficient C(n, k) using recursion.
 * The binomial coefficient represents the number of ways to choose k elements from a set of n elements.
 */
public class BinomialCoefficient {

    /**
     * Computes the binomial coefficient C(n, k) using recursion.
     *
     * @param n The total number of elements.
     * @param k The number of elements to choose.
     * @return The binomial coefficient C(n, k).
     */
    public static int binomialCoefficient(int n, int k) {
        // Base cases:
        if (k == 0 || k == n) {
            return 1; // C(n, 0) = C(n, n) = 1
        } else {
            // Recursive formula: C(n, k) = C(n-1, k-1) + C(n-1, k)
            return binomialCoefficient(n - 1, k - 1) + binomialCoefficient(n - 1, k);
        }
    }

    /**
     * Main method to demonstrate computing the binomial coefficient based on user input.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the values of n and k
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        System.out.print("Enter the value of k: ");
        int k = scanner.nextInt();

        // Validate input: k should be between 0 and n (inclusive)
        if (k < 0 || k > n) {
            System.out.println("Invalid input: k must be between 0 and n.");
        } else {
            // Compute the binomial coefficient C(n, k)
            int result = binomialCoefficient(n, k);

            // Display the computed binomial coefficient
            System.out.println("Binomial coefficient C(" + n + ", " + k + ") = " + result);
        }

        // Close the scanner
        scanner.close();
    }
}
