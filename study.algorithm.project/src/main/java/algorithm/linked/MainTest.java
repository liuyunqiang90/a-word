package algorithm.linked;

public class MainTest {

    public static void main(String[] args) {
        SingleLinked<String> s = new SingleLinked<>();

        s.add("qwe");
        s.add("111");
        s.add("22");
        s.add("333");

        System.out.println(s);
    }
}
