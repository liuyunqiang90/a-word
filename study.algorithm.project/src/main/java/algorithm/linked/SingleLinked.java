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

    /**
     * 往链表里添加元素
     * @param e
     */
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

    /**
     * 给指定的链表位置增加元素
     * @param e
     * @param index
     */
    public void set(E e,int index){
        if(index < 0 || index >= size())
            throw new IndexOutOfBoundsException("数组下标越界异常");
        Node<E> temp = head;
        if(index == 0) {
            head = new Node<E>();
            head.data = e;
            head.next = temp;
        }else{
            for (int i = 0; i < index-1; i++){
                temp = temp.next;
            }
            Node<E> target = new Node<>();
            target.data = e;
            //刚开始一直想不通，如果将新元素的下一个指向，插入位置的后一个元素，这里面只要获得目标元素，
            // 然后把他的下一个元素给临时变量就行了，链表中临时变量可以记录任何截断前和截断后的数据
            Node<E> aa =  temp.next;
            temp.next = target;
            //疑问，我并没有将元素重新付给head，head是怎么记录的呢？
            //是将head的地址复给了temp，其实他俩内存里指向的是同一区域，只不过是指针在变化
            target.next = aa;
        }
        size++;
    }

    /**
     * 其实链表获取指定下标的值，是通过遍历链表的元素确定的，最好的时间复杂度是O(1)，最坏是O(n)，所以平局复杂度是O(n)
     * @param index
     * @return
     */
    public  E get(int index){
        if(index < 0 || index >= size())
            throw new IndexOutOfBoundsException("数组下标越界异常");
        Node<E> n = head;
        for (int x = 0; x < index; x++){
            n = n.next;
        }
        return n.data;
    }

    /**
     * 删除指定位置的元素
     * @param index
     */
    public void delete(int index) {
        if(index < 0 || index >= size())
            throw new IndexOutOfBoundsException("数组下标越界异常");
        Node<E> temp = head;
        if(index == 0){
            head = head.next;
        }else{
            Node<E> pre = null;
            for(int i = 0; i< index; i++) {
                pre = temp;
                temp = temp.next;
            }
            pre.next = temp.next;
        }
        size--;
    }

    public int size() {
        return this.size;
    }

    /**
     * 单链表反转
     */
    public void reversal(){

        Node<E> p1 = head;
        Node<E> p2 = head.next;
        Node<E> temp = null;
        p1.next = null;
        while (p2.next != null){
            temp = p2.next;
            p2.next = p1;
            p1 = p2;
            p2 = temp;
        }
        p2.next = p1;
        head = p2;
    }

    class Node<E>{
        Node next;
        E data;
    }
}
