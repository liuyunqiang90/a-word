package algorithm.sort;

/**
 * 每次在未排序的数组中拿一个，往排好的数组中插入，选择排序是每次拿最小的
 */
public class InsertionSort {

    public static int[] sort(int[] args){

        for (int i = 1; i < args.length; i++) {//外层就是拿元素

            int target = args[i];
            int j = i-1;
            for (; j >=0 ; j--) {
                if(args[j] > target){
                   args[j+1] = args[j];
                }else {
                    break;
                }
                args[j] = target;
            }
        }

        return args;
    }
}
