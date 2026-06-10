package fileHandling;

import java.io.File;

public class Main {
    public static void main(String[] str) {
        try {

            File myObj = new File("Hello.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created" + myObj.getName());
            } else {
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            System.out.println("error");
        }
    }
}
