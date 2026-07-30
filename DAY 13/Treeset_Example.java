import java.util.TreeSet;

public class Treeset_Example {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<>();
        t.add(10);
        t.add(20);
        t.add(30);
        t.add(40);
        t.add(60);
        t.add(50);
        System.out.println(t);
        System.out.println(t.higher(50));//print next higher element
        System.out.println(t.lower(50));//print next lower element
        System.out.println(t.floor(70));//print current element or the lower element.
        System.out.println(t.pollLast());//remove the last element.

    }
}
