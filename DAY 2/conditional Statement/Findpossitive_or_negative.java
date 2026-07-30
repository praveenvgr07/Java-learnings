import java.util.Scanner;

public class Findpossitive_or_negative {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Age :");
        int age = sc.nextInt();
        System.out.println(age);

        if(age > 0){
            System.out.println("Eligible to vote");
        }
        else{
            System.out.println("Not Eligible to vote");
        }
        sc.close();
    }
    
}
