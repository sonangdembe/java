package fileHandling;

import java.io.FileWriter;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class ExpenseTracker {
    public static void main(String[] args){
        File f = new File("Diary.txt");
        Scanner sc = new Scanner(System.in);

        try(FileWriter fw = new FileWriter(f,true)){
            System.out.println("Enter the expenses of food");
            int food = sc.nextInt();
            System.out.println("Enter the expenses of Travel");
            int travel = sc.nextInt();

            int total = food + travel;
            fw.write('\n' + "total expense: " + total + '\n');

        }catch (IOException e){
            System.out.println("error");
        }
    }
}
