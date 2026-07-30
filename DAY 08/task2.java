import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string : ");
        String s = sc.nextLine();
        if(s.equals("null")){
            s = null;
        }
        try{
            System.out.println("Length = "+ s.length());
        }catch(Exception e){
            System.out.println(e);
        }
        sc.close();
    }
    
}
