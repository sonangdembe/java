package fileHandling;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.Scanner;


public class DiaryApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            File fcreate = new File("Diary.txt");
            if (fcreate.createNewFile()) {
                System.out.println("created successful" + fcreate.getName());
            }
            System.out.println("enter the note of today");
            String note = sc.nextLine();

            try (FileWriter fw = new FileWriter("Diary.txt", true)) {
                LocalDateTime now = LocalDateTime.now();
                fw.write( now + "\n" + note+ '\n');
                System.out.println("written successfully");
            }
        }catch (IOException e) {
                System.out.println("Error");
            }
        sc.close();
    }
}
