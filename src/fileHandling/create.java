package fileHandling;

import java.io.File;
import java.io.IOException;
import java.io.FileWriter;
public class create {
    public static void main(String[] args){
        try{
            File myfile = new File("newFile.txt");
            if(myfile.createNewFile()){
                System.out.println("File created successfully " + myfile.getName());
           }
            FileWriter myWrite = new FileWriter("newFile.txt");
            myWrite.write("hello this is for the create");
            myWrite.close();
            System.out.println("File written to " + myfile.getName());

        }catch (IOException e){
            System.out.println("File could not be created");
        }
    }
}
