import java.util.Scanner;
class Notification{
    public void display(){

    }
}
class Email extends Notification{
   public void display(){
        System.out.println("Email Notification sent.");
    }
}
class Sms extends Notification{
   public void display(){
        System.out.println("Sms Notification sent.");
    }
}
public class Task5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Email Or Sms : ");
        
        String message_type = sc.next();
        if(message_type.equals("Email")){
            Email m = new Email();
            m.display();
        }
        else if(message_type.equals("Sms")){
            Sms d = new Sms();
            d.display();
        }
        else{
            System.out.println("Invalid Message Type.");
        }
        sc.close();
    }
}
