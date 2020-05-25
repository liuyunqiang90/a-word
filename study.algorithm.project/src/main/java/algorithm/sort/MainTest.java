package algorithm.sort;

public class MainTest {

    public static void main(String[] args) {
        int[] i = {0,8,5,3,9,0,4,1,2};
        int[] sort = InsertionSort.sort(i);
        System.out.println(sort);
    }
}
