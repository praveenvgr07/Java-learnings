import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListPractice {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        //ArrayList list = new ArrayList<>(); it is used to store the all types of datatypes
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the  elements.");
        for(int i =0;i<10;i++){
            int n= sc.nextInt();
            list.add(n);
        }
        System.out.println("Size ");
        System.out.println(list.size());

        System.out.println("Element in index 0");
        System.out.println(list.get(0));

        System.out.println("Remove index 0");
        System.out.println(list.remove(0));

        System.out.println("update 0th index");
        System.out.println(list.set(0, 5));

        System.out.println("Add 6 in 3rd index");
        list.add(3, 6);

        System.out.println(list);

        System.out.println("check 5 in array");
        System.out.println(list.contains(5));

        System.out.println("check 5 in which index index");
        System.out.println(list.indexOf(5));

        System.out.println("is empty");
        System.out.println(list.isEmpty());

        System.out.println(list);
        
        System.out.println("print using Iterator");
        Iterator<Integer> l = list.iterator();
        while (l.hasNext()) {
            System.out.println(l.next());
        }
        
        sc.close();
    }
}
