package MyCollections;

public interface MyList<T> extends Iterable<T> {
    void add(int index, T item);
    void addFirst(T item);
    void addLast(T item);
    T get(int index);
    T getFirst();
    T getLast();
    void remove(int index);
    void removeFirst();
    void removeLast();

    void sort();

    int indexOf(Object obj);
    int lastIndexOf(Object obj);
    boolean exists(Object obj);
    Object[] toArray();
    void clear();
    void set(int index, T item);
    int size();



}
