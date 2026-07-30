import java.util.Scanner;
/*
concept :
   1) find the largest number.
   2) again find the largest but with one condition
   The condition is the  Second largest number is less then largest number.
*/
public class Second_largest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size :");
        int n = sc.nextInt();
        int[] array =  new int[n];
        System.out.println("Enter the valuea :");
        for(int i = 0; i < n ; i++){
            array[i] = sc.nextInt();
        }
        
        int largest_number = array[0];

        for(int i = 1 ; i < n; i++){
            
                if(largest_number < array[i]){
                    largest_number = array[i];
                

            }
            
        }
        int Second_largest_number = array[0];

        for(int i = 1 ; i < n; i++){
            
                if(Second_largest_number < array[i] &&  array[i] < largest_number){
                Second_largest_number = array[i];
                
            }
            
        }
        
        System.out.println("The Second Largest nunber is :" + Second_largest_number);
        sc.close();
    
}
}
