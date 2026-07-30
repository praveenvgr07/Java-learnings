public class Task1 {
    public static void main(String[] args) {
        int maxlength = 0;
        int[] arr ={2,5,1,10,10,6,1,2,1};
        int k = 14;
        int sum =0;
        int l=0,r;
        for(r =0; r< arr.length;r++){

            sum += arr[r];
            if(sum > k){
                sum -=arr[l];
                l++;
            }
            maxlength = Math.max(maxlength, r-l+1);
            
    }
    System.out.println(maxlength);
    }
}
