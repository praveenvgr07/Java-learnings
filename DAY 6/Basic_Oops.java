class Car {
    String brand ;
    int price;
    String color;
    void display(){
       
        System.out.println("The Brand name is"+ brand);
        System.out.println("The Price of the car is"+ price);
        System.out.println(color);
    }
}
public class Basic_Oops {
    public static void main(String[] args) {
        Car c = new Car();
        c.brand = "BMW";
        c.price = 900000;
        c.color = "Black";
        c.display();

        Car a = new Car();
        a.brand = "Aadi";
        a.price = 1000000;
        a.color = "Blue";
        a.display();

        Car b = new Car();
        b.brand = "Thor";
        b.price = 2000000;
        b.color = "Red";
        b.display();

    }
}
