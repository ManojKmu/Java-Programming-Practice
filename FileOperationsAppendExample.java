package com.example.fileoperations;
import java.io.*;
public class FileOperationsAppendExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     		try {
	     File file=new File("demo.txt");
	     FileWriter writer=new FileWriter(file,true);
	     writer.write("This line will be appended to the file\n");
	     writer.close();
	     System.out.println("Data appended successfully");
	} catch(IOException e)
	{
		System.out.println("Issue while appending file"+e);
	}
	}

}
