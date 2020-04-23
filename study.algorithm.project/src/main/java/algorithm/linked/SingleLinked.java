package algorithm.linked;

/**
 * 1、维护个结点Node；
 * 2、问题，如何将第二个元素与第一个元素链接起来？
 * 定义个变量来存储当前变量，用当前变量得next指针指向下一个结点
 * @param <E>
 */
public class SingleLinked<E> {


    private Node head;//第一个元素
    private int size;
    public void add(E e){

        if(head == null){
            head = new Node<E>();
            head.data = e;
            size = 1;
        }else {
            Node temp = head.next;
            Node current = head;
            while(temp != null){
                current = temp;
                temp = temp.next;
            }
            current.next = new Node<E>();
            current.next.data = e;
            size++;
        }

    }

    class Node<E>{
        Node next;
        E data;
    }
}
