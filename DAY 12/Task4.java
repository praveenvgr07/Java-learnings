import java.util.LinkedList;

public class Task4 {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("Song A");
        list.add("Song B");
        list.add("Song C");
        list.add("Song D");
        list.add("Song E");

        int n =list.size();
        
        list.addFirst(list.get(n-1));
        int l = list.indexOf("Song C");
        list.set(l, "Song X");
        list.removeLast();
        System.out.println(list);

    }
}
