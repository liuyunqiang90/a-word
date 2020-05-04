package algorithm.stack;

public class LinkedStack<E> {
    class Node<E>{
        Node<E> next;
        E value;
    }

    private int size;
    private Node<E> first;
    public void push(E e) {
        if (first == null) {
            first = new Node<E>();
            first.value = e;
        } else {
            Node<E> current = first;
            Node<E> pre = first;
            while (current != null) {
                pre = current;
                current = current.next;
            }
            current = new Node<>();
            current.value = e;
            pre.next = current;
        }

        size++;
    }

    public  E pop(){
        if(size < 1){
            throw new IndexOutOfBoundsException("栈内没有元素");
        }
        Node<E> pre = first;
        Node<E> curr = first;
        while (curr.next != null){
            pre = curr;
            curr = curr.next;
        }
        pre.next = null;
        size--;
        return curr.value;
    }

    public int size(){
        return this.size;
    }
}
