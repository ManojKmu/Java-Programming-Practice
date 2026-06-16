package com.example.recurssion;

public class PrintSubsets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="abc";
      subsets(" ",s,0);
}
      private static void subsets(String ans,String s,int idx)
      {
    	  if(idx==s.length())
    	  {
    		  System.out.print(ans+ " ");
    		  return;
    	  }
    	  char ch=s.charAt(idx);
    	  subsets(ans+ch,s,idx+1);//pick
    	  subsets(ans,s,idx+1);//skip
      }
	}

/*  
abc  ab  ac  a  bc  b  c     */