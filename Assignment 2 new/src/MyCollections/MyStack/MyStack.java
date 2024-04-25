package MyCollections.MyStack;

import MyCollections.MyLinkedList.MyLinkedList;

public class MyStack<T extends Comparable<T>> {
    private MyLinkedList<T> linkedList;

    public MyStack() {
        linkedList = new MyLinkedList<>();
    }

    public void add(T item){
        linkedList.addLast(item);
    }
    public T pop(){
        T value = linkedList.getLast();
        linkedList.removeLast();
        return value;
    }
    public boolean isEmpty(){
        return linkedList.size() == 0;
    }

    public int size(){
        return linkedList.size();
    }
    public void print(){
        linkedList.print();
    }

    public void printReverse(){
        linkedList.printReverse();
    }
}
