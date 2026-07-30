class Car{
    String brand ;
    int price;
    String color;

    Car(String brand,int price,String color){
        this.brand = brand;
        this.color = color;
        this.price = price;                                                                                                      
    }
    void display(){
       
        System.out.println("The Brand name is "+ brand);
        System.out.println("The Price of the car is "+ price);
        System.out.println("The color of the car is "+ color);
    }
}

public class Print_car_information{
    public static void main(String[] args) {
        Car c1 = new Car("BMW",900000,"Blue");
        c1.display();
    }
    
}
