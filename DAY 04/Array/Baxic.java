import java.util.Scanner;
public class Baxic {
    public static void main(String[] args) {
        // int [] arr = {1,2,3};
        // System.out.println(arr); // this method display the address of the arr.
        // compile time input
        int [] arr = {1,2,3,4,5};
        for(int i = 0; i < arr.length;i++){
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        // Runtime input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int n = sc.nextInt();
        int[] array =  new int[n];
        System.out.println("Enter the valuea :");
        for(int i = 0; i < n ; i++){
            array[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n; i++){
            System.out.print(array[i]+" ");
        }

        sc.close();

    }
}
