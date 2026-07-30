import java.util.HashSet;

public class Hashset_Example {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>();
        h.add(10);
        h.add(12);
        h.add(22);
        h.add(1);
        System.out.println(h);
        System.out.println(h.size());
        
    }
}
