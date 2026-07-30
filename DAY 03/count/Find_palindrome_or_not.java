import java.util.Scanner;

public class Find_palindrome_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = sc.nextInt();
        int temp = n;
        int rev =0;
        while (temp > 0) {
            int digit = temp% 10;

            rev = rev * 10 + digit;

            temp = temp / 10;  
        }
        if(rev == n){
            System.out.println("It is a palindrome");
        }
        else{
            System.out.println("Not a palindrome");
        }

        
        sc.close();
    }
}
