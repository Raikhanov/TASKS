package MyCollections.MyQueue;

import MyCollections.MyLinkedList.MyLinkedList;

public class MyQueue<T extends Comparable<T>>{
    public MyLinkedList<T> linkedList;

    public MyQueue(){
        linkedList = new MyLinkedList<>();
    }

    public void add(T item){
        linkedList.addLast(item);
    }

    public void addLeft(T item){
        linkedList.addFirst(item);
    }

    public T popLeft(){
        T value = linkedList.getFirst();
        linkedList.removeFirst();
        return value;
    }

    public T pop(){
        T value = linkedList.getLast();
        linkedList.removeLast();
        return value;
    }

    public int size(){
        return linkedList.size();
    }

    public boolean isEmpty(){
        return linkedList.size() == 0;
    }

    public void print(){
        linkedList.print();
    }

    public void printReverse(){
        linkedList.printReverse();
    }


}
