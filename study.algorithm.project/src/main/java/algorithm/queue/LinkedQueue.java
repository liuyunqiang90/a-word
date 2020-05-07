package algorithm.queue;

public class LinkedQueue<E> {
    private final class Node<E>{
        Node next;
        E e;
    }
    private Node<E> head;
    private Node<E> tail;

    public void enqueue(E e){

        if(head == null){
            head = new Node<E>();
            head.e = e;
        }else {
            tail = head;
            Node<E> pre = head;
            while (tail != null){
                pre = tail;
                tail = tail.next;
            }
            tail = new Node<E>();
            tail.e = e;
            pre.next = tail;
        }
    }
    public E dequeue(){
        if(head == null){
            throw new IndexOutOfBoundsException("队列内没有元素");
        }
        E result = head.e;
        head = head.next;
        return result;

    }
}
