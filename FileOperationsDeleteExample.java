package com.example.fileoperations;
import java.io.*;
public class FileOperationsDeleteExample {
    public static void main(String[] args) {
        try {
            File file = new File("demo.txt");
            if (file.delete()) {
                System.out.println("File " + file.getName() + " deleted successfully");
            } else {
                System.out.println("Failed to delete the file");
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
