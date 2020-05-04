package algorithm.stack;

public class StackMain {

    public static void main(String[] args) {
        LinkedStack<String> stack = new LinkedStack();

        stack.push("111");
        stack.push("222");
        stack.push("333");
        stack.push("44");
        stack.push("55");
        System.out.println(stack);
        Object o = stack.pop();
        Object o1 = stack.pop();
        Object o2 = stack.pop();
        Object o12 = stack.pop();
        System.out.println(stack);
    }
}
