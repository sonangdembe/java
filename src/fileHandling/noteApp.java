package fileHandling;

import com.sun.security.jgss.GSSUtil;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class noteApp {
    public static void main(String[] args){
        try {
            Scanner sc = new Scanner(System.in);
            File notes = new File("NotesApp.txt");
           if (notes.createNewFile()) {
                System.out.println("Successfylly create" + notes.getName());
            }
           while(true) {
               System.out.println("1. Add note");
               System.out.println("2. View notes");
               System.out.println("3. exit");

               System.out.println("Please enter your choice");
               int choice = sc.nextInt();
               sc.nextLine();
               switch (choice) {
                   case 1:
                       System.out.println("Enter note ");
                       try (FileWriter myWriter = new FileWriter("NotesApp.txt", true)) {
                           String note = sc.nextLine();
                           myWriter.write(note + '\n');

                       }
                       System.out.println("Successfully wrote to");
                       break;
                   case 2:
                       Scanner myreader = new Scanner(notes);
                       while (myreader.hasNextLine()) {
                           System.out.println(myreader.nextLine());
                       }
                       break;
                   case 3:
                       System.exit(0);
                       break;
                   default:
                       System.out.println("Invalid choice");
               }
           }
        }catch(IOException e){
            System.out.println("error");
        }
    }
}
