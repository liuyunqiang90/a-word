package algorithm.stack;

import java.util.*;
import java.lang.Byte;

public class BracketsMatch {


    private static char left1 = '{';
    private static char left2 = '[';
    private static char left3 = '(';
    private Map<Character,Character> map;

    public BracketsMatch() {
        map = new HashMap<>();
        map.put(')','(');
        map.put('}','{');
        map.put(']','[');
    }

    public boolean matchBrackets(String s){
        byte[] bytes = s.getBytes();
        char[] chars = s.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < chars.length; i++) {
            if(left1==chars[i] || left2 == chars[i] || left3 == chars[i]) {
                stack.push(chars[i]);
            }else{
                if(stack.isEmpty() && i <= chars.length-1)
                    return  false;
                Character pop = stack.pop();
                Character character = map.get(chars[i]);
                if(character !=null && character == pop)
                    continue;
                else
                    return false;
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
//        String s = "{{(())[()]}}))}}]]";
        String s = "()(){}";
        BracketsMatch bracketsMatch = new BracketsMatch();
        boolean b = bracketsMatch.matchBrackets(s);
        System.out.println(b);
    }
}
