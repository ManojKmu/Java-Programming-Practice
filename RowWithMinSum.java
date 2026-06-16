package multiDimensionalArrays;

public class RowWithMinSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {
				{2,0,3},//5
				{2,0,1},//3
				{2,0,1}//3
				};
		int minSum=Integer.MAX_VALUE;
		int rowIndex=-1;
		for(int i=0;i<arr.length;i++)
		{
			int sum=0;
			for(int j=0;j<arr[0].length;j++)
			{
				sum+=arr[i][j];
			}
			if(sum<minSum)
			{
				minSum=sum;
				rowIndex=i;
			}
		}
		System.out.println("Row with minimum sum: " + rowIndex);
        System.out.println("Minimum row sum: " + minSum);
		/*output
		 Row with minimum sum: 1
          Minimum row sum: 3

		 */
	}

}
