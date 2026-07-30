import java.util.Scanner;
abstract class Shape{
    abstract void area();
}
class Area extends Shape{
    int radius,length,width;
    
    Area(int radius) {
            this.radius = radius;
      
    }
    
    Area(int length,int width) {
        this.length = length;
        this.width = width; 
    }
    public void display_circle(){
          System.out.println("The area of the circle is :" + 3.14 * radius * radius);
       
    }
    public void display_rectangle(){
          System.out.println("The area of the rectangle is :" + length * width);
       
    }

}

public class Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter circle or rectangle");
        String Shape_name = sc.nextLine();
        if(Shape_name.equals("circle")){
            System.out.println("Enter the radius of the circle :");
            int radius = sc.nextInt();
            Area c = new Area(radius);
            c.display_circle();
        }
        else if(Shape_name.equals("rectangle")){
            System.out.println("Enter the length :");
            int length = sc.nextInt();
            System.out.println("Enter the width :");
       
            int width = sc.nextInt();
            Area d = new Area(length,width);
            d.display_rectangle();
        }
        else{
            System.out.println("Invalid Input.");
        }
        sc.close();
    }
    
}
