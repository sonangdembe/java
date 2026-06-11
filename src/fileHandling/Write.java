package fileHandling;

import java.io.FileWriter;
import java.util.Scanner;

public class Write {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try(FileWriter myWriter  = new FileWriter("Hello.txt", true)){

            System.out.println("Enter the name of student u want to add");
            String name = sc.nextLine();

            myWriter.write(name + "\n");

            System.out.println("File written successfully");
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}
