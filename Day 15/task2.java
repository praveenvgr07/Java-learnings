import java.util.Scanner;
public class task2 {
    
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
       System.out.println("Enter the number of inputs : ");
        int n = sc.nextInt();

        int[] a = new int[n];
       System.out.println("Enter the elements :");
        for(int i=0;i<n;i++){
            a[i]= sc.nextInt();
        }

       System.out.println("Enter the Target element :");
        int t = sc.nextInt();
        int left =0;
        int right = n-1;
        while(left <= right){
            int mid = (left + right)/2;
            if(a[mid] == t){
                System.out.println("Element found at index : "+mid);
                return;
            }
            else if(a[mid] < t){
                left= mid+1;
            }
            else{
                right = mid-1;
            }
         }
    
        System.out.println("Element not found");
    
    sc.close();
    }
}


