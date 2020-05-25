package algorithm.sort;

public class BubbleSort {

    public static int[] sort(int[] args){

        boolean flag = false;
        for (int j = 0; j < args.length; j++) {
            for (int i = 0; i < args.length-1; i++) {

                if(args[i] > args[i+1]){
                    flag = true;
                    int temp = 0;
                    temp = args[i];
                    args[i] = args[i+1];
                    args[i+1] = temp;
                }
            }
            if(!flag)
                break;
            flag = false;
        }

        return args;
    }
}
