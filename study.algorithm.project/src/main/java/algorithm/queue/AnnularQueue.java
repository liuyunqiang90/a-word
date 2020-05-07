package algorithm.queue;


public class AnnularQueue<E> {

    private Object[] oArray;
    private int size;
    private int head;
    private  int tail;

    public AnnularQueue(int x) {
        this.oArray = new Object[x];
        this.size = x;
    }

    public void enqueue(E e){
        if((tail+1)%size == head)
            throw new IndexOutOfBoundsException("队列已满");
        if(tail == size-1){
            oArray[tail] = e;
            tail = 0;
        }else {
            oArray[tail] = e;
            tail++;
        }
    }
    public E dequeue(){
        if(head == tail)
            return null;
        E e = (E)oArray[head];
        oArray[head] = null;
        if(head == size-1){
            head = 0;
            return e;
        }
        head++;
        return e;
    }
}
