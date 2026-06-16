package multiDimensionalArrays;
//The snake printing pattern in the row wise
public class SnakePatternPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{2,0,3},{2,0,1},{2,0,1}};
		for(int i=0;i<arr.length;i++)
		{
			if(i %2==0)
			{
				for(int j=0;j<arr[0].length;j++)
				{
					System.out.print(arr[i][j]+ " ");
				}
			}
			else {
				for(int j=arr[0].length-1;j>=0;j--)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

}
/*   output:
2 0 3 
1 0 2 
2 0 1 */