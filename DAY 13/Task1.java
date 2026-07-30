import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args){
          Queue<Integer> q = new LinkedList<>();
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter the number :");
          int n = sc.nextInt();
          int count = 0;
          for(int i=1;i<=n;i++){
            System.out.println("Enter the character :");
             String ch = sc.next();
             
             if(ch.equals("E")){
                System.out.println("Enter the value for E :");
                int v = sc.nextInt();
                q.offer(v);
             }else if (ch.equals("P")) {
                System.out.println(q.size());
             }
              
            }
            if(q.isEmpty()){
                System.out.println("Queue is Empty.");
            }


            //System.out.println("Output :");
            for(int i=1;i<=count;i++){
                System.out.println(q.peek());
            }
            sc.close();
    }
}
