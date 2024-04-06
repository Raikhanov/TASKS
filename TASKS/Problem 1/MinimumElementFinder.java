import java.util.Scanner;

public class MinimumElementFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

        System.out.println("Minimum element: " + findMinimum(n, arr));

    }
    public static int findMinimum(int n, int[] arr) {
        if (n == 0) {
            return Integer.MIN_VALUE; // Handle empty array case
        }
        int minElement = arr[0]; // Assume the first element is the minimum
        for (int i = 1; i < n; i++) { // Iterate through the array starting from the second element
            if (arr[i] < minElement) {
                minElement = arr[i]; // Update the minimum if a smaller element is found
            }
        }
        return minElement;
    }


}