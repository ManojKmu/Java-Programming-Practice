package com.example.workshop;
//Interface data base for ops 
//Object is not created for interfaces
interface IDBOps{
	//Here the default methods such as public abstract
	public abstract void connect();
	void execute();
	void close();
}
//Mysql vendor(3rd party person)
class Mysql implements IDBOps
{
	public  void connect()
	{
		System.out.println("Connected to MYSQL++");
	}
	 public  void execute()
	 {
		 System.out.println("Executed Query on MYSQL++");
	 }
	 public void close()
	 {
		 System.out.println("Disconnected from MYSQL++");
	 }
}
//Mongo vendor
class Mongo implements IDBOps
{
	public  void connect()
	{
		System.out.println("Connected to Mongo**");
	}
	 public  void execute()
	 {
		 System.out.println("Executed Query on Mongo**");
	 }
	 public void close()
	 {
		 System.out.println("Disconnected from Mongo**");
	 }
}
public class InterfaceExample { 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Mysql m=new Mysql();
      m.connect();
      m.execute();
      m.close();
      IDBOps mg=new Mongo();//IDBOps super class can refer to its sub class objects
      mg.connect();
      mg.execute();
      mg.close();
	}

}
