package hackerRankproblems;
/*
sample input:hello  java
sample output 9  NO  Hello Java
*/
public class StringInterviewQuestion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     String A="hello";
     String B="java";
     //print the length of two strings
     System.out.println(A.length()+B.length());
     //length matching or not
     if(A.length()!=B.length())
     {
    	 System.out.println("No");
     }  else {
    	 System.out.println("Yes");
     }
     //Capital
     String str=A.substring(0,1).toUpperCase()+A.substring(1);
     String str2=B.substring(0,1).toUpperCase()+B.substring(1);
     System.out.println(str+" "+str2);
	}

}
/*
9
No
Hello Java
*/