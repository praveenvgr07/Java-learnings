import java.util.Scanner;
public class Reverse_a_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your String name :");
        String str = sc.next();
        for(int i = str.length() - 1; i >= 0 ; i--){
            System.out.print(str.charAt(i));
        }
        sc.close();
    }
}
