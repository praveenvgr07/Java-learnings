import java.util.Scanner;
public class Switchproblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice : ");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("Biriyani");
                break;
            
            case 2:
                System.out.println("noodules");
                break;
        
            case 3:
                System.out.println("Mandhi");
                break;
            
            case 4:
                System.out.println("kili parotta");
                break;
        
            default:
                System.out.println("Tomato rice");
                System.out.println("curd rice");
                break;
        }
        sc.close();
    }
}
