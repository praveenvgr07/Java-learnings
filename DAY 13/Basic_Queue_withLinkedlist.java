import java.util.LinkedList;
import java.util.Queue;

public class Basic_Queue_withLinkedlist {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        q.add(102);//-----------|
        q.offer(102);//---------|=====>for adding.
        q.remove(102);//remove.
        q.poll();
        System.out.println(q);
    }
}
