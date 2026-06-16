package multiDimensionalArrays;
//Snake printing pattern column wise
public class SnakePrintingPatternColumnWise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{2,0,3},{2,0,1},{2,0,1}};
		for(int j=0;j<arr[0].length;j++)
		{
			if(j%2==0)
			{
				for(int i=0;i<arr.length;i++)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			else
			{
				for(int i=arr.length-1;i>=0;i--)
				{
					System.out.print(arr[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

}
/*output 
2 2 2 
0 0 0 
3 1 1 
*/