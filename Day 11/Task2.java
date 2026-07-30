public class Task2 {
    public static void main(String[] args) {
        int k = 3;
        int[] arr = {2,1,5,1,3,2};
        int max = 0;
        for(int i = 0; i <k; i++){
            max += arr[i];
        } 
        
        // int sum = max;
        int l = 0;
        int r = k -1;
        int count = 1;
        while(r < arr.length-10){
            if(max<=8){
                count++;
            }
            max -= arr[l];
            l++;
            r++;
            max += arr[r];
            // sum = Math.max(sum,max);
        }
      
        System.out.println(count);
    }
   
}
