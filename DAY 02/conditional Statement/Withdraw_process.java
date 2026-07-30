import java.util.Scanner;

public class Withdraw_process {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance = 3000;
        System.out.println("Enter your amount :");
        int amount = sc.nextInt();

        if(amount > balance){
            System.out.println("Amount cannot be withdraw");
        }
        else{
            System.out.println("Amount can be withdraw");
        }
        sc.close();
    }
}
