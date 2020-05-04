package algorithm.stack;

import java.util.Arrays;

public class ArrayStack<E extends Object> {
    private Object[] baseArray;
    private int size;
    private int count;//扩容的次数

    public ArrayStack() {
        this.baseArray = new Object[4];
    }

    public void push(E e) {
        if(size/4 > count)
            capacityExpansion();
        baseArray[size] = e;//位置放元素
        size++;//这步加1就计算出了长度
    }

    /**
     * 动态扩容
     */
    private void capacityExpansion() {
        Object[] newArray = new Object[baseArray.length *2];//申请原来2倍大小的数组
        System.arraycopy(this.baseArray,0,newArray,0,size);
        this.baseArray = newArray;
        count++;
    }

    public Object pop(){
        if(size < 1){
            throw new IndexOutOfBoundsException("栈内没有元素");
        }
        Object result = baseArray[size-1];
        //思考，如何将数组中的元素完全移除？
        baseArray[size-1] = null;
        size--;
        return result;
    }

    public int size(){
        return this.size;
    }

    public int count(){
        return this.count;
    }
}
