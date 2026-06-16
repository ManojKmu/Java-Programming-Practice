package com.example.training4.String;
//String is a built in class not a datatype
//Strings can be declared int two ways 
public class StringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1)String literal
		String name="Manoj";
		//Fetch the char from index we use the charAt() method 
		System.out.println(name.charAt(1));//charAt means index position
		//2)String object
		String name2=new String("Kumar");
		System.out.println(name2);//Kumar
		System.out.println(name + name2);//ManojKumar
	}

}
