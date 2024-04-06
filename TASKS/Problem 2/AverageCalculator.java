import java.util.Scanner;

public class AverageCalculator {

    public static double calculateAverage(int n, int[] arr) {
        if (n == 0) {
            return 0.0; // Return 0 if the array is empty (to avoid division by zero)
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i]; // Accumulate the sum of all elements in the array
        }

        // Calculate the average by dividing the sum by the number of elements (n)
        double average = (double) sum / n;
        return average;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of elements
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        // Create an array to store the elements
        int[] arr = new int[n];

        // Prompt the user to enter each element of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        // Calculate the average of elements in the array
        double avg = calculateAverage(n, arr);

        // Display the average
        System.out.println("Average of elements: " + avg);

        // Close the scanner
        scanner.close();
    }
}
