import java.util.Scanner;

public class Task3 {
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
        int low = 0;
        int high = n-1;
        while(left <= right && low <=high){
            // for last occurance .
            int mid1 = (low+high)/2;
            if(a[mid1] == t){
                if(a[mid1]==t){
                    low = mid1 + 1;    
                }
                if(a[low]!=t){
                    System.out.println("Last Occurance :"+mid1);    
                }
            }
            else if(a[mid1]<t){
                low = mid1 +1;
            }
            else{
                high = mid1 -1;
            }

            // for first occurance.
            int mid = mid1;
            
            if(a[mid] == t){
                if(a[mid]==t){
                    right = mid - 1;
                }
                if(a[right]!=t){
                    System.out.println("First Occurance :"+mid);
                    }
                 }
            else if(a[mid]<t){
                left = mid +1;
            }
            else{
                right = mid -1;
            }
        }
          sc.close();
    }
}