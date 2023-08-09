package org.example;
import java.io.FileWriter ;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile {
    public static void main(String args[]) throws IOException {
        FileWriter obj = new FileWriter("C:\\File_Handling\\NewFile.txt");
        try{
           // obj.write("Welcome to file Handling in java!");
            //obj.close();

            System.out.println("Enter the data into a file:");
            Scanner sc = new Scanner(System.in);
            String data = sc.nextLine();
            obj.write(data);
            obj.close();
            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error Occured");
            e.printStackTrace();
        }
    }

}
