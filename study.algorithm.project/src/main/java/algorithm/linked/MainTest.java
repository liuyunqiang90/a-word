package algorithm.linked;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainTest {

    public static void main(String[] args) {
        SingleLinked<String> s = new SingleLinked<>();

        s.add("111");
        s.add("222");
        s.add("333");
        s.add("444");
        s.reversal();
//        s.set("4444",3);
//        s.delete(1);
//        List<String> list = new LinkedList<>();
//        List<String> list1 = new ArrayList<>();
//        System.out.println(s);
        System.out.println(s.get(4));
    }
}
