package algorithm.practice;
import com.sun.org.apache.bcel.internal.generic.ARETURN;
import java.util.ArrayList;
import java.util.List;
/**
 * 一个数组中的元素， 如果其前面的部分等于后面的部分， 那么这个点的位序就是平衡点。
 * 比如列表numbers = [1, 3, 5, 7, 8, 25, 4, 20]，25前面的元素总和为24, 25后面的元素总和也是24.那么25就是这个列表的平衡点。
 * 要求编写程序，寻找并返回任意一个列表的所有平衡点。
 * 思路：先将平衡点定义出来
 */
public class BalancePoint {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9 ,8, 25, 4, 9 ,20};
        List<Integer> point = getPoint(numbers);
        System.out.println(point);
        int[][] a = {{1,2,34,5,6},{5,6,7},{8,6,7,9}};
    }
    private static  List<Integer> getPoint(int[] arr){
        List<Integer> resultList = new ArrayList<>();
        int result1 = 0;
        for (int i = 0; i < arr.length-2; i++) {
            int balancePoint = arr[i+1];//平衡点
            int value = arr[i];
            result1 += value;
            int result = 0;
            for (int j = i+2; j < arr.length; j++) {
                int value2 = arr[j];
                result += value2;
                if(result1 < result)
                    break;
                if(result1 == result)
                    resultList.add(balancePoint);
            }
        }
        return resultList;
    }
}
