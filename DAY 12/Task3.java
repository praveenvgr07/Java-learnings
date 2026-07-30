import java.util.ArrayList;

public class Task3 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Pizza");
        list.add("Burgur");
        list.add("Fries");
        list.add("Burgur");
        list.add("Pizza");
        while (list.remove("Pizza")) ;
        if(list.contains("Fries")){
            int index = list.indexOf("Fries");
            list.set(index, "Nugglets");
        }

        list.addLast("Coke");
        System.out.println(list);
    }
}
