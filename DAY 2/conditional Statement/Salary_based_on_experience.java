import java.util.Scanner;

public class Salary_based_on_experience {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the experience :");
        int experience = sc.nextInt();

        if(experience < 1){
            System.out.println("5% bonus");
        }
        else if(experience >=1 && experience < 3){
             System.out.println("10% bonus");
        }
        else if(experience >=3 && experience < 6){
             System.out.println("20% bonus");
        }
        else{
             System.out.println("30% bonus");
        }
        sc.close();
    }
}
