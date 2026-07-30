import java.util.HashMap;
import java.util.Map;

public class Map_example {
    public static void main(String[] args) {
        HashMap<Integer,String> m = new HashMap<>();
        m.put(1, "Saran");
        m.put(2, "tholkappiyan");
        m.put(3, "Praveen kumar");
        System.out.println(m.entrySet());
        System.out.println(m.keySet());
        int n= m.size();
        for(int i=1;i<=n;i++){
            System.out.println(i+" : "+m.get(i));
        }
        for(Map.Entry<Integer,String> e :m.entrySet()){
             System.out.println(e.getKey()+ ":" + e.getValue());
        }
        }
    }

