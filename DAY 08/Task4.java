import java.util.Scanner;
public class Task4 {
    public static void divide(int a , int b){
        int c = a/b;
        System.out.println("The ans for the diviion : " + c);
    }
    public static void arrayindex(int[] arr,int index){
        System.out.println("The value in that index : "+arr[index]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the two values : ");

        int a =sc.nextInt(); 
        int b = sc.nextInt();

        System.out.println("Enter the array size : ");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter the values :");

        for(int i = 0; i < n ;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Enter the array index :");
        int index = sc.nextInt();

        sc.close();

        try{
            divide(a,b);
            // System.out.println(arr[index]);
            arrayindex(arr,index);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
