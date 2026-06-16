package multiDimensionalArrays;

public class Sum2DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[][] arr= {{2,0,3},{2,0,1},{2,0,1}};
    int sum=0;
    for(int i=0;i<arr.length;i++)
    {
    	for(int j=0;j<arr[0].length;j++)
    	{
    		sum+=arr[i][j];
    	}
    }
	System.out.println(sum);
	}

}
