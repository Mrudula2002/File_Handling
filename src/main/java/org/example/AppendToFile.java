package org.example;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class AppendToFile {
    public static void main(String args[])
    {
        try {
            FileWriter obj = new FileWriter("C:\\File_Handling\\NewFile.txt", true);
            PrintWriter pw = new PrintWriter(obj);
            System.out.println("Enter the data you want to append:");
            Scanner sc = new Scanner(System.in);
            String data = sc.nextLine();
            pw.println(data);
            pw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
