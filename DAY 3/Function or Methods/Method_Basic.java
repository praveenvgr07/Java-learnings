
public class Method_Basic {
    /*
    Why we use the static?
             Here we didnt use any object so we use the static 
             without static it through the connect between static and non ststic error.
     */
    static void washing_cloths(){
        System.out.println("Your cloths are washed . Have  a good day ,Welcome you back.");
    }
    static void washing_cloths(String s){
        System.out.println("Please collect your "+ s +". welcome you back.");
    }
    public static void main(String[] args) {
        washing_cloths(); // call the Method
        washing_cloths("Shirt");
    }
}
