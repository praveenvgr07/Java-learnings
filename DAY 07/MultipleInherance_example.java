interface Father{
    void daddy();
}
interface Mother{
    void mummy();
}
class Child implements Father,Mother{
        public void daddy(){
            System.out.println("Daddy's Home.");
        }
        public void mummy(){
            System.out.println("Mommy is Cooking.");
        }
}
public class MultipleInherance_example {
    public static void main(String[] args) {
        Child c = new Child();
        c.daddy();
        c.mummy();
    }
}
