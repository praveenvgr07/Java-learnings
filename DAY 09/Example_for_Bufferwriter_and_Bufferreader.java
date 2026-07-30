import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Example_for_Bufferwriter_and_Bufferreader {
    public static void main(String[] args)throws IOException {
        Scanner sc = new Scanner(System.in);

        File f = new File("D:\\learnings\\java learning\\DAY 9\\demo\\sample2");
        f.createNewFile();

        BufferedWriter bw = new BufferedWriter(new FileWriter(f));

        System.out.println("Enter your name : ");
        String name = sc.nextLine();
        bw.write("Name : "+name);
        bw.newLine();

        System.out.println("Enter your Age : ");
        String  age = sc.next();
        bw.write("Age : "+ age);
        bw.newLine();

        System.out.println("Enter your department : ");
        String dept = sc.next();
        bw.write("Department : "+dept);
        bw.newLine();

        System.out.println("Enter your Roll NO : ");
        String roll_no = sc.next();
        bw.write("Roll no : "+roll_no);
        bw.newLine();
        bw.close();

        BufferedReader br = new BufferedReader(new FileReader(f));

        String ch;

        while((ch = br.readLine()) != null){
            System.out.println(ch);
        }

        br.close();

        sc.close();
    }
}
