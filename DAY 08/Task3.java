import java.util.Scanner;
public class Task3 {
    public static void checkinteger(String n){
        int i = Integer.parseInt(n);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string : ");
        String n = sc.next();
        sc.close();
        try{
            checkinteger(n);
        }catch(NumberFormatException e){
            System.out.println(e);

        }
    }
}
