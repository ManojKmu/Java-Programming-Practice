import java.util.Scanner;
//IN this we need to convert small alphabet to capital alphabet
public class ConvertSmallToCapitalAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter a charatcer");
    char ch=sc.next().charAt(0);
    if(Character.isLowerCase(ch)) {
    	System.out.println(Character.toUpperCase(ch));
    }else {
    	System.out.println(Character.toLowerCase(ch));
    }
    sc.close();
	}

}
/*
Enter a charatcer
A
a
*/
/*
Enter a charatcer
a
A

*/