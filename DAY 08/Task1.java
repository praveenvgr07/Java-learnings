import java.util.Scanner;
public class Task1 {
     public static void  checkstring(String name)throws Exception{
        if(name.equals("null")){
            System.out.println("String is null");
        }
        else{
            System.out.println("Length = "+name.length());
        }
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        try{
            checkstring(name);
        }
        catch(Exception e){
            System.out.println(e);
        }
        sc.close();
    }
}
