import java.util.Scanner;

/**
 * The `Fibonacci` class calculates the n-th Fibonacci number using recursion.
 */
public class Fibonacci {

    /**
     * Recursive method to find the n-th Fibonacci number.
     *
     * @param n The index of the Fibonacci number to find.
     * @return The n-th Fibonacci number.
     * @throws IllegalArgumentException If n is negative (Fibonacci sequence is defined for non-negative indices).
     */
    public static int fibonacci(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Fibonacci sequence is not defined for negative indices.");
        }
        // Base cases
        if (n == 0) {
            return 0; // F(0) = 0
        }
        if (n == 1) {
            return 1; // F(1) = 1
        }
        // Recursive case: F(n) = F(n-1) + F(n-2)
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    /**
     * Main method to demonstrate finding the n-th Fibonacci number using recursion.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the index of the Fibonacci number
        System.out.print(" Fibonacci number: ");
        int n = scanner.nextInt();

        // Calculate the nth Fibonacci number using recursion
        try {
            int result = fibonacci(n);
            System.out.println(result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        // Close the scanner
        scanner.close();
    }
}
