import java.util.HashSet;

public class Task2 {
    public static void main(String[] args) {
        HashSet<String> h = new HashSet<>();
        h.add("Rahul");
        h.add("Praveen");
        h.add("Saran");
        h.add("Rahul");
        h.add("Tholkappiyan");
        Boolean t = h.contains("Rahul");
        if(t.equals(true)){
            System.out.println("Rahul is Attended");
        }else{
            System.out.println("Rahul is Not Attended");
        }
        System.out.println(h);
        System.out.println(h.size());
        
    }
}
