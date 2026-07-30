import java.util.Scanner;
/*
key take away if u compare to the integer can use "==" but if u used the compare the it doesnt work so,use .equals()  */
public class Verification {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Username :");
        String uname = sc.nextLine();
        System.out.println("Enter your Password :");
        String password = sc.next();

        if(uname.equals("saran") ){
            if(password.equals("99999")){
                System.out.println("your sucessfully Login 😂😂😂😂😂😂");

            }
        }
        sc.close();
    }
}
