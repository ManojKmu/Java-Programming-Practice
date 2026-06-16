package com.example.fileoperations;

import java.io.*;
import java.util.Scanner;
public class FileOperationsReadExample {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        try {
            File file=new File("demo.txt");
            Scanner reader=new Scanner(file);
            while(reader.hasNextLine())
            {
                String data=reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch(FileNotFoundException e)
        {
            System.out.println("An error occured"+e.getMessage());
        }
    }
}
