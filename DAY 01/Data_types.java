
public class Data_types {
    public static void main(String[] args){

        // declare the variables
        String name = "Praveen Kumar";
        int age = 20; // 4 byte
        String dpt = "IT"; 
        long phone = 98765432198L; // it take the large number as int in default . so,i add that L in last.
        boolean a = true;
        char c = 'h'; // 2 byte
        float mark = 78.3f;  // 4 byte and the mark variable store as the double as default .so,we add the f in final to convert into float.
        double mark1 = 87.2; // 8 byte
         
        // print those things.

        System.out.println("Name :" +name);
        System.out.println("Age :" +age);
        System.out.println("Department :" +dpt);
        System.out.println("Phone no : " +phone);
        System.out.println("Print the boolean type :" + a);
        System.out.println( "Print the character :" +c);
        System.out.println("Print the float value :" + mark);
        System.out.println("Print the double value :" + mark1);
       // System.out.println(String a = "hello"); it will show thw error. We cant declare the data type inside the print function 
        
        
        
    }
    
}
