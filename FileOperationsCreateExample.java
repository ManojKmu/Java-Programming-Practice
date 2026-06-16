package com.example.fileoperations;
//Files are present in io package
import java.io.*;
public class FileOperationsCreateExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       File file=new File("demo.txt");
       //create operation for file
       try {
    	   if(file.createNewFile())
    	   {
    		   System.out.println("File "+file.getName()+" created successfully");
    	   }  else {
    		   System.out.println("File already exists");
    	   }
       } catch(IOException e)
       {
    	   System.out.println("An error occured"+e.getMessage());
       } 
	
	}
}
