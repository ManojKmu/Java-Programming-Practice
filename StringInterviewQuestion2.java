package hackerRankproblems;
/*
sample input:hello  java
sample output 9  NO  hELLO jAVA
*/
public class StringInterviewQuestion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String A="hello";
    String B="java";
    //length of string
    System.out.println(A.length()+B.length());
    //compare the length
    if(A.length()!=B.length())
    {
    	System.out.println("No");
    }  else {
    	System.out.println("Yes");
    }
    //
    String str=A.substring(0,1).toLowerCase()+A.substring(1).toUpperCase();
    String str2=B.substring(0,1).toLowerCase()+B.substring(1).toUpperCase();
    System.out.println(str);
    System.out.println(str2);
	}

}
/*
9
No
hELLO
jAVA
*/