package org.example;
import java.io.File;
import java.io.IOException;

public class CreateFile {
    public static void main(String[] args) {
        File obj = new File("C:\\File_Handling\\NewFile.txt");
        try{
            if(obj.createNewFile())
            {
                System.out.println("File Created Successfully");
            }
            else
            {
                System.out.println("File already exists");
            }
        }
        catch (IOException e)
        {
            System.out.println("An error occured!");
            e.printStackTrace();
        }
    }
}