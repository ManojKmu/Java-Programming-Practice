import java.util.Scanner;

public class AlphabetOrDigitOrSpecialSymbol {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter a character:");
     char ch=sc.next().charAt(0);
     if(ch>='A'&& ch<='Z') {
    	 System.out.println("Capital Letter alphabet");
     } else if(ch>='a' && ch<='z') {
    	 System.out.println("Small letter alphabet");
     } else if(ch>='0' && ch<='9') {
    	 System.out.println("Digit symbol");
     }else {
    	 System.out.println("Special Symbol");
     }
     sc.close();
	}

}
