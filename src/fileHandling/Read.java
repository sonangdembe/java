package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Read {
    public static void main(String[] args){
        File myObj = new File("Hello.txt");
        try(Scanner myReader = new Scanner(myObj)){
         while(myReader.hasNextLine()){

             System.out.println(myReader.nextLine());
         }
        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
