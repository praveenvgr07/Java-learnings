import java.util.Scanner;

class Square{
    int n;
    int area;
    
    Square(int n){
        this.n = n;
    }
    
    int display(){
        area = n * n;
        return area;
    }

}
public class Area_of_the_sqare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your value to find the area :");
        int n = sc.nextInt();
        Square a1 = new Square(n);
        System.out.println("The area of the square is :"+a1.display());
        sc.close();
    }  
}
