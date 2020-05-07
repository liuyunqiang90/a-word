package algorithm.queue;

public class ArrayQueue<E> {

    private Object[] baseArray;
    private int size;
    private int base_length = 4;
    private int tail = 0;
    private int head = 0;

    public ArrayQueue() {
        this.baseArray = new Object[base_length];
    }

    public void enqueue(E e){
        if(size > baseArray.length)
            capacityExpansion();
        baseArray[size++] = e;
    }
    public void enqueue1(E e){
        if(tail == base_length && head == 0)
            throw new IndexOutOfBoundsException("队列已满");
        if(tail == base_length && head != 0){
            System.arraycopy(baseArray,head,baseArray,0,tail-head);//这样的搬移会导致原数组的最后一个元素一直都在
            tail = tail-head;//搬移完之后，将tail指针更新
        }
        baseArray[tail++] = e;
        size++;
    }

    /**
     * 队列不整自动扩展，如果整了，那队列只有在申请内存失败的时候才会满
     */
    private void capacityExpansion() {
        Object[] newArray = new Object[(size-1)*2];
        System.arraycopy(baseArray,0,newArray,0,size-1);
        baseArray = newArray;

    }

    public Object dequeue(){
        if(size < 1){
            throw new IndexOutOfBoundsException("队列内没有元素");
        }
        Object e = baseArray[0];//出队，每次出第一个元素,，这种方式每次都需要做数组搬迁
        System.arraycopy(baseArray,1,baseArray,0,baseArray.length-1);
        size--;
        return e;
    }

    public Object dequeue1(){
        if(head == tail){
            return null;
        }
        Object e = baseArray[head];//出队，如何确定第一个元素？定义个指向头部的指针
        baseArray[head] = null;
        head++;
//        System.arraycopy(baseArray,1,baseArray,0,baseArray.length-1);
        size--;
        return e;
    }
}
