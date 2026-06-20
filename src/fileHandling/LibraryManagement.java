package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class LibraryManagement {
   public static void main(String[] args){
       try{
       File fcreate = new File("Books.txt");
       if(fcreate.createNewFile()){
           System.out.println("File created " + fcreate.getName());
       }else{
           System.out.println("File already exists");
       }}catch(IOException e){
           System.out.println(e);
       }

       try(FileWriter fw = new FileWriter("Books.txt", true)) {
           Scanner sc = new Scanner(System.in);


           ArrayList bookList = new ArrayList<>();
           bookList.add("book 1");
           bookList.add("java");

           while (true) {
               System.out.println("enter 1 to add book");
               System.out.println("enter 2 to view book");
               System.out.println("enter 3 to delete book");
               System.out.println("enter 4 to delete book");
               System.out.println("\n");
               System.out.println("enter your choice");
               int choice = sc.nextInt();
               sc.nextLine();
               switch (choice) {
                   case 1:
                       System.out.println("Enter the book you want to add :");
                       String name = sc.nextLine();
                       System.out.println(name);
                       bookList.add(name);
                       fw.write(name + '\n');
                       fw.flush();
                       System.out.println(bookList);
break;
                   case 2:
                       System.out.println("enter the book you want to view :");
                       String view = sc.nextLine();
                       if(bookList.contains(view)){
                           System.out.println("book found");
                       }else{
                           System.out.println("book not found");
                       }
                       break;
                   case 3:
                       System.out.println("enter the book you ant to search :");
                       String search = sc.nextLine();
                       if(bookList.contains(search)){
                           System.out.println("book found " + search);
                       }
                       else{
                           System.out.println("book not found");
                       }
                       break;
                   case 4:
                       System.out.println("Enter the book you want to delete :");
                       String delete = sc.nextLine();
                       if(bookList.contains(delete)){
                           bookList.remove(delete);
                           System.out.println(bookList);
                       }
                       else{
                           System.out.println("book not found");
                       }
                       break;
                   default:
                       System.out.println("Invalid choice");

               }
           }


           }catch(IOException e){
               System.out.println("Error");
           }

   }
}
