
public class Basic {

    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Sham");
        StringBuilder bs = sb;
        sb.append("Shammy");
        if(sb == bs){
            System.out.println("same");
        }
        else{
            System.out.println("not same");
 
        }
        
    }
}


