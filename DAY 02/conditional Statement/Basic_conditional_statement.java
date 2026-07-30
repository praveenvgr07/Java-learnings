import java.util.Scanner;
public class Basic_conditional_statement {
    public static void main(String[] args){
        // create the object
        Scanner sc = new Scanner(System.in);
        // declare the variables
        System.out.println("Enter your name:" );
        String name = sc.nextLine();

        System.out.println("Enter your age :" );
        int age = sc.nextInt();

        System.out.println("Enter your department :" );
        String dpt = sc.nextLine();

        System.out.println("Enter your phone number :" );
        long phone = sc.nextLong();

        System.out.println("Enter your boolean number :" );
        boolean a = sc.nextBoolean();

        // System.out.println("Enter your character :" );
        // char c = sc.next(); IT IS not possible to use 


        System.out.println("Enter your mark in float:" );
        float mark = sc.nextFloat();

        System.out.println("Enter your mark 1 in double :" );
        double mark1 = sc.nextDouble();
         
        // print those things.

        System.out.println("Name :" +name);
        System.out.println("Age :" +age);
        System.out.println("Department :" +dpt);
        System.out.println("Phone no : " +phone);
        System.out.println("Print the boolean type :" + a);
        // System.out.println( "Print the character :" +c);
        System.out.println("Print the float value :" + mark);
        System.out.println("Print the double value :" + mark1);
       // System.out.println(String a = "hello"); it will show thw error. We cant declare the data type inside the print function 
        
       sc.close(); 
        
    }
    
}
