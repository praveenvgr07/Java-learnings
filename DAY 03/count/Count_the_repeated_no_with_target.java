import java.util.Scanner;
public class Count_the_repeated_no_with_target {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number :");
         int n = sc.nextInt();
         System.out.println("Enter your target :");
         int target = sc.nextInt();
         int count = 0;;
         while (n > 0) {
            int digit = n % 10;
            if(target == digit){
                count++;
            }
            n/=10;
         }
         System.out.println("The target value "+target +" is repeated " + count +" times");
            sc.close();
         }

    
}
