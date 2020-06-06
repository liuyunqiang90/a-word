/**
 * volatile 保证共享变量的内存可见性
 */
public class VolatileTest {

//    public static  boolean found = false;
    public static  volatile  boolean found = false;

    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                long i = 0;
                System.out.println("等笔来。。。。。。");
                while (!found){
//                    System.out.println("uuuuuuuuu");
//                    synchronized (this){
                        i++;
//                    }

                }
                System.out.println(i + "笔来了。。。。写字！！！");
            }
        },"我线程").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("笔找到了，送过去");
                found = true;
            }
        },"基友线程").start();
    }
}
