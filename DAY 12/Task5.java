import java.util.ArrayList;

public class Task5 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(101);
        list.add(102);
        list.add(103);
        list.add(102);
        list.add(104);
        list.add(105);
        list.add(102);
        int n = list.size();
        int d = list.indexOf(102);
        System.out.println(d);
        for(int i =d+1 ;i<n;i++ ){
            if(list.get(i) == 102){
                list.remove(i);

                break;
            }
        }
        list.set(list.lastIndexOf(102),999);

        System.out.println(list);
    }
}
