package fileHandling;

import java.io.FileWriter;
public class Write {
    public static void main(String[] args){
        try(FileWriter myWriter  = new FileWriter("Hello.txt", true)){
            myWriter.write("Hi how are you \nmy name is Edha how it's going");
            System.out.println("File written successfully");
        }catch(Exception e){
            System.out.println("Error");
        }
    }
}
