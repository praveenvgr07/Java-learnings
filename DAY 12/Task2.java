import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        // list.add("Rahul");
        // list.add("Priya");
        // list.add("Arun");
        // list.add("Meena");
        // list.addFirst("Kavin");
        // //list.add(0, "Kavin");
        // list.remove("Arun");
        // System.out.println(list.size());
        // System.out.println(list);
        list.add("Anu");
        list.add("Rahul");
        list.add("Divya");
        list.add("Rahul");
        list.add("Karthik");
        list.add("Rahul");
        list.removeLastOccurrence("Rahul");
        list.addFirst("Priya");
        list.addLast("Vijay");
        System.out.println(list.size());
    }
}
