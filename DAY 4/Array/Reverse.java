import java.util.Scanner;

public class Reverse {
           public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int n = sc.nextInt();
        int[] array =  new int[n];
        System.out.println("Enter the valuea :");
        for(int i = 0; i < n ; i++){
            array[i] = sc.nextInt();
        }
        
        for(int i = n-1 ; i >=0; i--){
            System.out.print(array[i] + " "); 
             
     }
       
        sc.close(); 
}
}
