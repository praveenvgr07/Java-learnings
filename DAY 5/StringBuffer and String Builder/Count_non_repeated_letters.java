import java.util.Scanner;
public class Count_non_repeated_letters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your string :");
        String str = sc.next();
        int max = 0;

        for(int i = 0; i < str.length(); i++){
            String sub = "";
            for(int j = i; j < str.length(); j++){
                char ch = str.charAt(j);
                if(sub.indexOf(ch)!= -1){
                    break;
                }
                sub += ch;
                if(sub.length() > max){
                    max = sub.length();
                }


            }
        }
        System.out.println(max);
        sc.close();
    }
}
