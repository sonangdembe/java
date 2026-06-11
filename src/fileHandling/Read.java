package fileHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class Read {
    public static void main(String[] args){

        File myObj = new File("Hello.txt");
        System.out.println("Enter the word you want to search");
        String searchWord = new Scanner(System.in).next();
         boolean found = false;

        try(Scanner myReader = new Scanner(myObj)){
         while(myReader.hasNext()) {
             String word = myReader.next();
             if (searchWord.equalsIgnoreCase(word)) {
                 found = true;
                 break;
             }
         }
          if(found){
              System.out.println("found");
          }else{
              System.out.println("not found");
          }


        }catch(FileNotFoundException e){
            System.out.println("File not found");
        }
    }
}
