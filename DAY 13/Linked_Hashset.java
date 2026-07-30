import java.util.LinkedHashSet;

public class Linked_Hashset {
    public static void main(String[] args) {
        LinkedHashSet<String> l= new LinkedHashSet<>();
        l.add("Anu");
        l.add("Rahul");
        l.add("Divya");
        l.add("Rahul");
        l.add("Karthik");
        l.add("Rahul");
        
        l.addFirst("Priya");
        l.addLast("Vijay");
        System.out.println(l.size());
    }
}
