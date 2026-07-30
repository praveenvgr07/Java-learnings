import java.util.Scanner;
public class Task5 {
    static void checkpassword(String password)throws Exception{
        if(password.length() >= 8){
                 System.out.println("Password Accepted");
        }
        else{
            System.out.println("Password is too small");
        }
       
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = sc.nextLine();
        try{
            checkpassword(password);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
