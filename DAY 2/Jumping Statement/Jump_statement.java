
public class Jump_statement {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Continue  Statement using while ");
        while(i <= 10){
            if(i == 6){
                i++; /*Here definetly we want to give the i++ because the 
                6 comes inside and then go to if loop condition true and then continue 
                so the loop is skiped .so that the 6 input come again and again .
                then it automatically act as a break statement */ 
                continue;
            }
            System.out.println(i);
            i++;
        }
        while(i <= 10){
            if(i == 6){
                break;
            }
            System.out.println(i);
            i++;
        }
        /*java has only break and continue statement */

    }
}
