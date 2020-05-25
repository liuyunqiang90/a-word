package algorithm.sort;

/**SelectionSort
 * 每次在未排序的数组中找到最小的，然后放在已排序数组中的最后，
 * 首次认为已排序数组中无元素
 */
public class SelectionSort {

    public static int[] sort(int[] args){
        for (int i = 0; i < args.length; i++) {
            int min = args[i];
            int loca = 0;
            boolean flag = false;
            for (int j = i+1; j < args.length; j++) {
                if(min > args[j]){
                    min = args[j];
                    loca = j;
                    flag = true;
                }
            }
            if(flag){
                int temp = args[i];
                args[i] = min;
                args[loca] = temp;
            }

        }
        return  args;
    }
}
