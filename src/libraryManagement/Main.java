package libraryManagement;

import java.util.ArrayList;
import java.util.Scanner;


class ManagementSystem{
    ArrayList<String> list = new ArrayList<String>();

    ManagementSystem(){
        list.add("Java");
        list.add("Python");
        list.add("C++");
    }
    void addBook(String bookName){
        list.add(bookName);
        System.out.println("Book added successfully!" + list);
    }
    void removeBook(String bookName){
        for(int i = 0; i< list.size(); i++){
            if(list.get(i).equalsIgnoreCase(bookName)){
                list.remove(i);
                System.out.println("Book removed successfully!" + list);
                return;
            }else {
                System.out.println("Book not found!" + list);
            }
        }
    }
    void searchBook(String bookName){
        for(int i = 0; i< list.size(); i++){
            for(String book : list){
                if(book.equalsIgnoreCase(bookName)){
                    System.out.println("Book found successfully!" + book);
                }else{
                    System.out.println("Book not found!" + book);
                }
            }
        }
    }
    void displayBook(){
        for(int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }
    }
}
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ManagementSystem ms = new ManagementSystem();


while(true){
    System.out.println("Enter 1. to add book");
    System.out.println("Enter 2. to remove book");
    System.out.println("Enter 3. to search book");
    System.out.println("Enter 4. to display");
    System.out.println("Enter 5. to exit");

    System.out.println("Enter your choice");
    int choice = sc.nextInt();
    sc.nextLine();
        switch(choice){
            case 1:
                System.out.println("Enter Book Name:");
                String book = sc.nextLine();
                ms.addBook(book);
                break;
            case 2:
                System.out.println("Enter the book you want to remove");
                String bookRemove = sc.nextLine();
                ms.removeBook(bookRemove);
                break;
            case 3:
                System.out.println("Enter the book name you want to search");
                String bookSearch = sc.nextLine();
                ms.searchBook(bookSearch);
                break;
            case 4:
                System.out.println("Displaying all book");
                ms.displayBook();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Invalid choice");

        }

    }
    }
}
