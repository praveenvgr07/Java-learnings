import java.util.ArrayList;
import java.util.Scanner;
public class Task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();
        int n  = sc.nextInt();
        for(int i = 0; i < n; i++){
            String l = sc.next();
            list.add(l);
        }
        list.remove("Bread");
        list.add(2, "Jam");
        System.out.println( list.contains("Butter"));
        System.out.println(list);
        sc.close();
    }
}
