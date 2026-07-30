import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Basic {
    public static void main(String[] args)throws IOException{
        // create a folder name demo in a particular location.
        File f = new File("D:\\learnings\\java learning\\DAY 9\\demo");
        f.mkdir();/* 
        create a file name sample in a particular location. 
        important thing is while creating a file u want to throws the IOException.
        why we want to throw that because  if the file is already exsist we want to handle that.
        */
        File f1 = new File("D:\\learnings\\java learning\\DAY 9\\demo\\sample");
        f1.createNewFile();
        // Now we want to write in the file .
        // so that we want to create FileWriter another file path that copy the file path
        FileWriter fw = new FileWriter(f1);
        fw.write("Welcome to java Programming.");
        fw.close();
        FileReader fr = new FileReader(f1);
       /* 
        Read method only read the string as ASCII value
        it will not read a complete sentence it only read character by character.
        Process :
        first read the first character in the file.
        it only read on ASCII value formate.
        for example the character J's ASCII value is 75 
        The meaning of -1 is the file is empty .
        now 75 is not equal to -1
        so print the character in the 75 position of the ASCII values.
        then read the next character. 
        */
       // Read the file using read method.
        int n; 
        while ((n =  fr.read()) != -1) {
            char reading = (char)n;
            System.out.print(reading);
        }
        fr.close();
        // Read the file using Scanner method.
        /*
        get input from the fr and then using the "hasnext()"
        if true print the sentence 
        hasnext() is take the single word then next word.
        */

       Scanner sc = new Scanner(fr);
        while ( sc.hasNext()){
            System.out.print(sc.next());
            
        }
        sc.close();

    }
    
}
