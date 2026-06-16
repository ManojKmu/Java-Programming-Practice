package multiDimensionalArrays;
import java.util.*;
public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayList<Integer> a=new ArrayList<>();
     a.add(3); a.add(4); a.add(1);
     ArrayList<Integer> b=new ArrayList<>();
     b.add(6); b.add(7);
     ArrayList<Integer> c=new ArrayList<>();
     c.add(8); c.add(9);c.add(5);
     ArrayList<ArrayList<Integer>> arr=new ArrayList<>();
     arr.add(a);
     arr.add(b);
     arr.add(c);
//     System.out.println(arr);
     for(int i=0;i<arr.size();i++)
     {
    	 for(int j=0;j<arr.get(i).size();j++)
    	 {
    		 System.out.print(arr.get(i).get(j)+" ");
    	 }
    	 System.out.println();
     }
	}

}
/*output 
[[3, 4, 1], [6, 7], [8, 9, 5]]  */