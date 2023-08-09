package org.example;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFile {
    public static void main(String args[])
    {
        File obj = new File("C:\\File_Handling\\NewFile.txt");
        try{
            Scanner sc = new Scanner(obj);
            while(sc.hasNext()){
                String data = sc.nextLine();
                System.out.println(data);
            }

        } catch (FileNotFoundException e) {
            System.out.println("An error occurred!");
            e.printStackTrace();
        }
    }
}
