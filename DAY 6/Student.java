class Stu{
    String name;
    int roll_no;
    String Dpt;
    Stu(String name,int roll_no,String Dpt){
        this.name = name;
        this.roll_no = roll_no;
        this.Dpt = Dpt;
    }
    void display(){
        System.out.println("The name of the Student "+ name);
        System.out.println("The Roll Number is "+ roll_no);
        System.out.println("The Department is "+ Dpt);
        System.out.println();
    }
}
public class Student {
    public static void main(String[] args) {
        Stu s1 = new Stu("Praveen",78,"IT");
        Stu s2 = new Stu("Saran",35,"IT");   
        Stu s3 = new Stu("Tholkappian", 127, "IT"); 
        s1.display();
        s2.display();
        s3.display();
    }
    
}
