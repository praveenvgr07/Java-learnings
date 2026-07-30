public class Task1 {
    public static void main(String[] args) {
        int n = 5;
        int[] a = {10,20,30,40,50};
        int index = 2;
        int m=6;
        int[] b = new int[m];
        for(int i = m-1 ,  j = n-1;i>2 && j>=2;i--,j--){
            b[i] = a[j]; 
        }
        b[index] = 25;
        for(int i =0 ;i<index;i++){
            b[i] = a[i];
        }
        
        for(int i=0;i<m;i++){
            System.out.print(b[i]+" ");
        }
    }
}
