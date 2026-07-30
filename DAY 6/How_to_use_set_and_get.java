
class Bank{
    private int balance;
    public void setbalance(int balance){
        this.balance = balance;
    }
    public int getbalance(){
        return balance;
    }

}
public class How_to_use_set_and_get {
    public static void main(String[] args) {
        
        Bank b = new Bank();
        b.setbalance(1000);
        System.out.println("The bank balance is :" + b.getbalance());

    }
}
