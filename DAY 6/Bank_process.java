import java.util.Scanner;
class Saran{
    private int initializeAmount;
    private int depositeAmount;
    private int withdrawAmount;
    int balance;

    public void setinitialieAmount(int initializeAmount){
        this.initializeAmount = initializeAmount;
    }
    public void setdepositeAmount(int depositeAmount){
        this.depositeAmount = depositeAmount;
    }
    public void setwithdrawAmount(int withdrawAmount){
        this.withdrawAmount = withdrawAmount;
    }
    public int getinitializeAmount(){
        return initializeAmount;
    }
    public int getdepositeAmount(){
        return depositeAmount;
    }
    public int getwithdrawAmount(){
        return withdrawAmount;
    }
    public int check_balance(){
        balance = (initializeAmount + depositeAmount) - withdrawAmount;
        return balance;

    }
    


}
public class Bank_process {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the initial amount : ");
        int initializeAmount = sc.nextInt();
        System.out.println("Enter your deposite amount : ");
        int depositeAmount = sc.nextInt();
        System.out.println("Enter your withdraw amount : ");
        int withdrawAmount = sc.nextInt();

        Saran s = new Saran();
        s.setinitialieAmount(initializeAmount);
        s.setdepositeAmount(depositeAmount);
        s.setwithdrawAmount(withdrawAmount);

        System.out.println("The balance is :" + s.check_balance());

        
        sc.close();


    }
}
