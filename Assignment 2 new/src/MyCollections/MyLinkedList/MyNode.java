package MyCollections.MyLinkedList;

public class MyNode<T> {
    private MyNode<T> next;
    private MyNode<T> prev;
    private T value;


    public MyNode(T value){
        this.value = value;
    }
    public void setNext(MyNode<T> next){
        this.next = next;
    }

    public void setPrev(MyNode<T> prev){
        this.prev = prev;
    }

    public void setValue(T value){
        this.value = value;
    }

    public MyNode<T> getNext(){
        return next;
    }
    public MyNode<T> getPrev(){
        return prev;
    }

    public T getValue(){
        return value;
    }

}
