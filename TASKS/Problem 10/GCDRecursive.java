import java.util.Scanner;

public class GCDRecursive {

    /**
     * Computes the Greatest Common Divisor (GCD) of two numbers a and b using recursion.
     *
     * @param a The first number.
     * @param b The second number.
     * @return The GCD of a and b.
     */
    public static int gcd(int a, int b) {
        // Base case: If b is 0, then GCD(a, 0) = a
        if (b == 0) {
            return a;
        }
        // Recursive case: Apply the Euclidean algorithm (GCD(a, b) = GCD(b, a % b))
        return gcd(b, a % b);
    }

    /**
     * Main method to demonstrate computing the GCD of two numbers using recursion.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter two numbers a and b
        System.out.print("Enter the first number (a): ");
        int a = scanner.nextInt();
        System.out.print("Enter the second number (b): ");
        int b = scanner.nextInt();

        // Compute the GCD of a and b using the gcd method
        int result = gcd(a, b);

        // Display the computed GCD
        System.out.println("GCD of " + a + " and " + b + " is: " + result);

        // Close the scanner
        scanner.close();
    }
}
