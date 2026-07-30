import java.util.Scanner;
class Employee{
    public void display(){

    }
}
class Manager extends Employee{
   public void display(){
        System.out.println("Manager manages the team.");
    }
}
class Developer extends Employee{
   public void display(){
        System.out.println("Developers writes code.");
    }
}
public class Task4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Employee Type(Manager Or Developer) : ");
        
        String Employee_type = sc.next();
        if(Employee_type.equals("Manager")){
            Manager m = new Manager();
            m.display();
        }
        else if(Employee_type.equals("Developer")){
            Developer d = new Developer();
            d.display();
        }
        else{
            System.out.println("Invalid Employee Type.");
        }
        sc.close();
    }
}
