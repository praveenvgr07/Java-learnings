import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;

public class Task1 {
    public static void main(String[] args)throws IOException {
        File f = new File("D:\\learnings\\java learning\\DAY 9\\demo\\sample1");
        f.createNewFile(); 
        FileWriter fw = new FileWriter(f);
        fw.write("Name : Praveen Kumar.\n");
        fw.write("Age : 20 .\n");
        fw.write("Department : IT \n");
        fw.write("Roll no : 2k24it078. \n");
        fw.close();
        FileReader fr = new FileReader(f);

        int n;
        
        while((n = fr.read())!= -1){
            char read = (char)n;
            System.out.print(read);
        }
        fr.close();
    }
}
