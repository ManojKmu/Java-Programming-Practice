package multiDimensionalArrays;

public class RowWithMaxSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr= {{2,0,3},{2,0,1},{2,0,1}};
		int maxSum=Integer.MIN_VALUE;
		int row=-1;
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[0].length;j++)
			{
				sum+=arr[i][j];
			}
			if(sum > maxSum)
			{
				maxSum=sum;
				row=i;
			}
			//maxSum=Math.max(maxSum, sum);
		}
		System.out.println(row+" "+maxSum);//0 (row) 5(sum) from array({2,0,3})
	}

}
