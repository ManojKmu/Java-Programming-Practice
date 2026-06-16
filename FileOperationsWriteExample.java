package com.example.fileoperations;
//It is used to write data into file. It is present in io package
import java.io.*;
public class FileOperationsWriteExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
     File file=new File("demo.txt");
     FileWriter writer=new FileWriter(file);
     writer.write("Hello everyone\n");
	 writer.write("Welcome to Java programming\n");
	 writer.write("File handling is important in Java\n");
	 writer.write("This is an example of writing data to a file\n");
     writer.close();
     System.out.println("Data written successfully");
	}  catch(IOException e)
	{
		System.out.println("Issue while writing file"+e);
	}

}
}
