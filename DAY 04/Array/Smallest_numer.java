import java.util.Scanner;

public class Smallest_numer {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int n = sc.nextInt();
        int[] array =  new int[n];
        System.out.println("Enter the valuea :");
        for(int i = 0; i < n ; i++){
            array[i] = sc.nextInt();
        }
        
        int Smallest_numer = array[0];
        for(int i = 1 ; i < n; i++){
            
                if(Smallest_numer > array[i]){
                    Smallest_numer = array[i];
            }
     }
        System.out.println("The Smallest nunber is :" + Smallest_numer);
        sc.close(); 
}
}
