package com.ecxample.training.recursion;
//In a particular string we need to count the no.of stars
public class CountStarsFromaString {
  public static int countStars(String s)
  {
	  int count=0;
	  for(int i=0;i<s.length();i++)
	  {
		  if(s.charAt(i)=='*')
		  {
			  count++;
		  }
	  }
	  return count;
  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String s="b*isc*ll*ge";
     System.out.println("The no.of stars count is:"+countStars(s));
	}

}

/*  
The no.of stars count is:3
 */