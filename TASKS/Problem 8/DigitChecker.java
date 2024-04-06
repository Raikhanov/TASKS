import java.util.Scanner;

/**
 * The `DigitChecker` class checks whether a given string consists only of digits (numeric characters).
 */
public class DigitChecker {

    /**
     * Checks if a given string consists entirely of digits (numeric characters).
     *
     * @param s The string to be checked.
     * @return true if the string contains only digits, false otherwise.
     */
    public static boolean isAllDigits(String s) {
        // Iterate through each character of the string
        for (int i = 0; i < s.length(); i++) {
            // Check if the character is not a digit (0-9)
            if (!Character.isDigit(s.charAt(i))) {
                return false; // Found a non-digit character, return false
            }
        }
        return true; // All characters are digits
    }

    /**
     * Main method to demonstrate checking if a string consists of digits.
     * Prompts the user to enter a string and checks if it consists only of digits.
     *
     * @param args The command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter a string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Check if the input string consists only of digits
        boolean result = isAllDigits(input);

        // Display the result based on whether the string contains only digits or not
        if (result) {
            System.out.println("The string '" + input + "' consists only of digits.");
        } else {
            System.out.println("The string '" + input + "' contains non-digit characters.");
        }

        // Close the scanner
        scanner.close();
    }
}
