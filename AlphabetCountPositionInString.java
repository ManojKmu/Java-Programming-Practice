package com.example.training4.String;
//In a given string we are getting the alphabet position apart from ASCII value
public class AlphabetCountPositionInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String name="bits";
      for(char ch:name.toCharArray())
      {
    	  System.out.println(ch+"->"+(ch-96));
    	 
      }
	}

}
/*
b->2
i->9
t->20
s->19 
*/