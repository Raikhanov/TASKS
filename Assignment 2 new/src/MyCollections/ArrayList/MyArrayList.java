package MyCollections.ArrayList;

import MyCollections.MyList;

import java.util.Iterator;

public class MyArrayList<T extends Comparable<T>> implements MyList<T> {
    private Object[] arr;
    private int size;
    private int capacity;
    private int defaultCapacity;


    public MyArrayList(){
        arr = new Object[5];
        defaultCapacity = 5;
        capacity = 5;
        size = 0;
    }

    public MyArrayList(int capacity){
        arr = new Object[capacity];
        defaultCapacity = capacity;
        this.capacity = capacity;
        size = 0;
    }


    @Override
    public void add(int index, T item) {
        if(size >= capacity)
            increaseBuffer();
        checkIndex(index);
        for(int i=size;i>index;i--){
            arr[i] = arr[i-1];
        }
        arr[index] = item;
        size++;
    }

    @Override
    public void addFirst(T item) {
        if(size >= capacity){
            increaseBuffer();
        }
        for(int i=1;i<size;i++){
            arr[i] = arr[i-1];
        }
        arr[0] = item;
        size++;
    }

    @Override
    public void addLast(T item) {
        if(size >= capacity){
            increaseBuffer();
        }
        arr[size++] = item;
    }

    @Override
    public T get(int index) {
        checkIndex(index);
        return (T) arr[index];
    }

    @Override
    public T getFirst() {
        checkIndex(0);
        return (T) arr[0];
    }

    @Override
    public T getLast() {
        checkIndex(size-1);
        return (T) arr[size-1];
    }

    @Override
    public void remove(int index) {
        checkIndex(index);
        if(index == size-1){
            removeLast();
        }else {
            for (int i = index + 1; i < size; i++) {
                arr[i - 1] = arr[i];
            }
            size--;
        }
    }

    @Override
    public void removeFirst() {
        remove(0);
    }

    @Override
    public void removeLast() {
        checkIndex(size-1);
        size--;
    }

    @Override
    public void sort() {
        quickSort(0, size-1);
    }

    private void quickSort(int start, int end){
        if(start >= end){
            return;
        }
        int p = partition(start, end);
        quickSort(start, p-1);
        quickSort(p+1, end);
    }

    private int partition(int start, int end){
        T pivot = get(end);
        int ptr = start-1;
        for(int i=start;i<end;i++){
            if(get(i).compareTo(pivot) < 0){
                ptr++;
                if(ptr != i){
                    T c = get(ptr);
                    arr[ptr] = arr[i];
                    arr[i] = c;
                }
            }
        }
        ptr++;
        T c = get(end);
        arr[end] = arr[ptr];
        arr[ptr] = c;
        return ptr;
    }

    @Override
    public int indexOf(Object obj) {
        for(int i=0;i<size;i++){
            if(arr[i].equals(obj))
                return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object obj) {
        for(int i=size-1;i>=0;i--){
            if(arr[i].equals(obj))
                return i;
        }
        return -1;
    }

    @Override
    public boolean exists(Object obj) {
        for(int i=0;i<size;i++){
            if(arr[i].equals(obj))
                return true;
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        T[] newArray = (T[]) new Object[defaultCapacity];
        for(int i=0;i<size;i++){
            newArray[i] = (T) arr[i];
        }
        return newArray;
    }

    @Override
    public void clear() {
        Object[] newArray = new Object[defaultCapacity];
        arr = newArray;
    }

    @Override
    public void set(int index, T item) {
        checkIndex(index);
        arr[index] = item;
    }

    @Override
    public int size() {
        return size;
    }

    private void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index out of range");
        }
    }

    private void increaseBuffer(){
        capacity = size*2;
        T[] newArray = (T[]) new Object[capacity];
        for(int i=0;i<size;i++){
            newArray[i] = (T) arr[i];
        }
        arr = newArray;
    }


    @Override
    public Iterator<T> iterator() {
        return null;
    }

}
