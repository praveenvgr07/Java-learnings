public class Task2 {
    public static void main(String[] args) {
        int[] a = new int[5];
        a[0]=10;
        a[1]=20;
        a[2]=30;
        a[3]=40;
        a[4]=50;

        int n=5;
        int pos = 2;
        for(int i=n-1;i>=pos;i--){
            a[i-1] = a[i]; 
        }
        n--;
        for(int i =0;i<n-1;i++){
            System.out.print(a[i]+" ");
        }
    }
}
