public class ConstantSlidingWindow {
     public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 3;
        int maxsum =0;
        for(int i =0; i<k;i++){
            maxsum += arr[i];
        }
        int left = 0;
        int right = k-1;
        
        while(right < arr.length-1){
            int sub = maxsum - arr[left];
            left++;
            right++;
            sub += arr[right];
            maxsum = Math.max(maxsum,sub);

        }
    
        System.out.println(maxsum);
     }
}
