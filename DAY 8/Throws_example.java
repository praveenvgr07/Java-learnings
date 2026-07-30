import java.util.Scanner;
public class Throws_example {
        public static void checkage(int age)throws ArithmeticException {
        if(age < 18){
            throw new ArithmeticException(age +"You are not Eligible .");
        }
        else{
            System.out.println(age +"You are Eligible");
        }
    }
    // public static void divide(int a , int b) throws ArithmeticException{
    //     System.out.println(a / b);
    // }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age : ");
        int age = sc.nextInt();
       sc.close();
        try{
        checkage(age);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        // System.out.println("Enter the first number :");
        // int a = sc.nextInt();

        // System.out.println("Enter the second number :");
        // int b = sc.nextInt();

        // divide(a,b);
       
    }
}
