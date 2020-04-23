package algorithm.array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayPractice {
    public static void main(String[] args) {

        List<Map<String,String>> list = new ArrayList<>();
        Map<String,String> map = new HashMap<>();

            map.put("1","4");
            map.put("2","5");
            list.add(map);
           // map.clear();

        System.out.println(list);
    }
}
