public class Arithmatic_functions_using_Method {
    /*
    It is used on the void return type 
    static void addition(int a , int b){
        int sum = a + b;
        System.out.println("The sum of "+a +" and "+ b +" is "+ sum);
    }
     */
    // now using int return type method.
    static int addition(int a,int b){
        return a + b;
    }
    static int sub(int a, int b){
        return a - b;
    }
      static int mul(int a, int b){
        return a * b;
    }
      static int div(int a, int b){
        return a / b;
    }
    public static void main(String[] args) {
       int result = addition(5,6);

       System.out.println("The sum of two number is "+ result);
       System.out.println("The subract of two number is "+ sub(12,7));
       System.out.println("The Multiple of two number is "+ mul(8,9));
       System.out.println("The Division of two number is "+ div(19,3));
    }
}
