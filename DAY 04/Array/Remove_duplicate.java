public class Remove_duplicate {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = {1,2,2,1,3};
        int slow = 0;
        
        for(int fast = 1;fast <= arr.length;fast++){
            if(arr[slow]!=arr[fast]){
                slow++;
                arr[slow] = arr[fast];
            }

        }


    }
}
