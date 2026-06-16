package multiDimensionalArrays;

public class RowToColumnWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{2,0,3},{2,0,1},{2,0,1}};
		//TO reverse row to column
         for(int j=0;j<arr[0].length;j++)
         {
        	 for(int i=0;i<arr.length;i++)
        	 {
        		 System.out.print(arr[i][j]+" ");
        	 }
        	 System.out.println();
         }
         //To reverse column to row
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
