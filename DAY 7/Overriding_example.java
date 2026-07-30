class Animal{
    void sound(){
        System.out.println("Animals sound ");
    }
}
class Doggy extends Animal{
    @Override
    void sound(){
        System.out.println("Dog is Barking");
    }
}
public class Overriding_example {
    public static void main(String[] args) {
        Doggy d = new Doggy();
        d.sound();
    }
}
