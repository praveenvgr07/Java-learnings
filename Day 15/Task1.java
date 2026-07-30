import java.util.Scanner;
public class Task1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       // System.out.println("Enter the number of inputs : ");
        int n = sc.nextInt();

        int[] a = new int[n];
       // System.out.println("Enter the elements :");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }

       // System.out.println("Enter the Target element :");
        int t = sc.nextInt();
        int count =0;
        int v =0;
        for(int i=0;i<n;i++){
            if(a[i] == t){
                v = i;
                count++;
                
            }
         }
    if(count ==1){
        System.out.println("Element found at index : "+v);
    }else{
        System.out.println("Element not found");
    }
    sc.close();
    }
}
