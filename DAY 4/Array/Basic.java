import java.util.*;
public class Basic {
    public static void main(String[] args) {
   
       int n = 5;
       int[] arr = new int[n];
       Scanner sc = new Scanner(System.in);
       for(int i = 0; i < n;i++){
          arr[i] = sc.nextInt();
       }
       int left = 0;
       int r = (arr.length)-1 ;
       int right = r;
       while(arr[left] < arr[right]){
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;

            left++;
            right--;
       }
        for(int i = 0; i < n;i++){` ``  `
          System.out.print(arr[i] + " ");
       }
    }
}
