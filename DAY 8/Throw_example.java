import java.util.Scanner;
public class Throw_example {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age : ");
        int age = sc.nextInt();
        sc.close();
        if(age < 18){
            throw new ArithmeticException("You are not Eligible .");
        }
        else{
            System.out.println("You are Eligible");
        }
      
    }
}
