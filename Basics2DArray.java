package multiDimensionalArrays;

public class Basics2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[][] arr= {{2,3},{4,5},{6,7}};
     // arr.length(To print how many rows in a 2D array)
      // arr[0].length(To print how many columns in a 2D array)
      System.out.println(arr.length+" "+arr[0].length);//3  4
      for(int i=0;i<arr.length;i++)
      {
    	  for(int j=0;j<arr[0].length;j++)
    	  {
    		  System.out.print(arr[i][j]+" ");
    	  }
    	  System.out.println();
      }
	}

}
