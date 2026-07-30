import java.util.Scanner;

public class Student_grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark :");
        int mark = sc.nextInt();
        if(mark > 100 || mark < 0){
            System.out.println("Invalid input");
        }
        else{
        if(mark >= 90 && mark <= 100){
             System.out.println("Grade A");

        }
        else if(mark >=75 && mark < 90){
            System.out.println("Grade B");
        }
        else if(mark >= 60 && mark < 75){
            System.out.println("Grade C");
        }
        else if(mark >= 45 && mark < 60){
            System.out.println("Grade D");
        }
        else if(mark >= 30 && mark < 45){
            System.out.println("Grade E");
        }
   
        else{
            System.out.println("Grade F");
        }
    }
        sc.close();
    }
}
