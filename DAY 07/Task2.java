abstract class Payment{
    abstract void pay();
}
class UPI extends Payment{
    void pay(){
        System.out.println("Payment Sucessfully completed.");
    }
}
class CreditCard extends Payment{
    void pay(){
        System.out.println("Payment sucessfully completed through CreditCard .");
    }
}
public class Task2 {
    public static void main(String[] args) {
        UPI u = new UPI();
        u.pay();
        CreditCard c = new CreditCard();
        c.pay();        
    }
}
