import java.util.Scanner;

public class PrimeChecker {

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false; // 1 and numbers less than or equal to 1 are not prime
        }

        if (n == 2) {
            return true; // 2 is the only even prime number
        }

        if (n % 2 == 0) {
            return false; // Other even numbers greater than 2 are not prime
        }

        // Check divisibility from 3 up to the square root of n
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) {
                return false; // n is divisible by i, hence not prime
            }
        }

        return true; // n is prime if it's not divisible by any number up to its square root
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number to check for primality
        System.out.print("Enter a number to check if it's prime/composite: ");
        int n = scanner.nextInt();

        // Check if n is prime
        if (isPrime(n)) {
            System.out.println(n + " Prime");
        } else {
            System.out.println(n + " Composite");


        // Close the scanner
        scanner.close();
    }
}
