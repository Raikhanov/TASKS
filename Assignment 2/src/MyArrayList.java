import java.util.Arrays;

public class MyArrayList implements MyList {

    private static final int DEFAULT_CAPACITY = 10; // Default initial capacity
    private Object[] elements; // Array to hold elements of the list
    private int size; // Number of elements in the list

    // Constructor
    public MyArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY]; // Initialize with default capacity
        this.size = 0; // Initially no elements in the list
    }

    // Private method to ensure capacity of the internal array
    private void ensureCapacity(int minCapacity) {
        int currentCapacity = elements.length;
        if (minCapacity > currentCapacity) {
            int newCapacity = currentCapacity * 2; // Double the current capacity
            if (newCapacity < minCapacity)
                newCapacity = minCapacity;
            elements = Arrays.copyOf(elements, newCapacity);
        }
    }

    @Override
    public void add(Object element) {
        ensureCapacity(size + 1); // Ensure capacity for new element
        elements[size] = element; // Add element at the end of the list
        size++; // Increase size counter
    }

    @Override
    public void remove(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);

        // Shift elements to the left to remove the element at the specified index
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[size - 1] = null; // Set the last element to null
        size--; // Decrease size counter
    }

    @Override
    public Object get(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + size);

        return elements[index]; // Return the element at the specified index
    }

    @Override
    public int size() {
        return size; // Return the current size of the list
    }

    @Override
    public boolean isEmpty() {
        return size == 0; // Check if the list is empty
    }

    @Override
    public boolean contains(Object element) {
        for (int i = 0; i < size; i++) {
            if (elements[i].equals(element))
                return true;
        }
        return false; // Element not found
    }
}
