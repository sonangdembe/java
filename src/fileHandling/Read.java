package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Read {
    public static void main(String[] args){
        int count = 0;
        File myObj = new File("Hello.txt");
        try(Scanner myReader = new Scanner(myObj)){
         while(myReader.hasNextLine()){
            count++;
            System.out.println(myReader.nextLine());
         }
            System.out.println(count);
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
