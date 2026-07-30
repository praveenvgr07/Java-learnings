abstract class Water_purifier{
    abstract void filter();
}
class Aqua extends Water_purifier{
    void filter(){
        System.out.println("Water is purified ...");
    }
}
public class Abstract_example {
    public static void main(String[] args) {
        Aqua a = new Aqua();
        a.filter();
        
    }
}

