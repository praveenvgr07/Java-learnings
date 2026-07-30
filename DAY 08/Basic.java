import java.util.Scanner;
public class Basic {
    public static void main(String[] args) {
        try {
           /* int a = 9 , b = 0;
            int c = a/b; //it will show the Arithmetic error.

            int[] d = {1,2,3,4,5};
            System.out.println(d[10]);// it will show the Array Index Out Of Bounds.

            String name = null;
            System.out.println(name.length()); //it will show the NullPointerException.

            String name1 = "ABC";
            System.out.println(Integer.parseInt(name1)); //it will show the NumberFormatException.

*/
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            System.out.println(a);
            sc.close();
        } catch (Exception e) {
            
            System.out.println(e);

        }
        finally{
        System.out.println("Program is sucessfully finished...❤️");
    }
  
}
}
