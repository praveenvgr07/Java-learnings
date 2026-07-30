
public class Overloading_example
{
    public static int add(int a , int b){
        return a + b;
    }
    public static int add(int a , int b, int c){
        return a + b + c;
    }
    
    public static void main(String[] args) {

        System.out.println("The sum of two value is : " + add(90,70));
        System.out.println("The sum of Three value is : " + add(10,30,50));
    }
}
