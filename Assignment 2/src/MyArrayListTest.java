import java.util.Scanner;

public class MyArrayListTest {

    public static void main(String[] args) {
        MyList myList = new MyArrayList();
        Scanner scanner = new Scanner(System.in);

        // Adding elements to the collection
        System.out.println("Enter three elements to add to the collection:");
        for (int i = 0; i < 3; i++) {
            System.out.print("Element " + (i + 1) + ": ");
            String element = scanner.nextLine();
            myList.add(element);
        }

        // Displaying the size of the collection
        System.out.println("Size of the collection: " + myList.size());

        // Displaying all elements in the collection
        System.out.println("Elements in the collection:");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println("Element at index " + i + ": " + myList.get(i));
        }

        // Removing an element from the collection
        System.out.println("Enter the index of the element to remove:");
        int index = scanner.nextInt();
        myList.remove(index);

        // Displaying the size of the collection after removal
        System.out.println("Size of the collection after removal: " + myList.size());

        // Checking the presence of a specific element in the collection
        scanner.nextLine(); // Clear the buffer after nextInt()
        System.out.println("Enter an element to check its presence in the collection:");
        String elementToCheck = scanner.nextLine();
        System.out.println("Does the collection contain '" + elementToCheck + "'? " + myList.contains(elementToCheck));

        // Closing the Scanner
        scanner.close();
    }
}
