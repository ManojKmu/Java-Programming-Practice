package multiDimensionalArrays;

public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[][] arr= {{2,3,4},{5,6,7},{7,8,3}};
    print(arr);
    //Transpose the matrix
    for(int i=0;i<arr.length;i++)
    {
    	for(int j=i+1;j<arr[0].length;j++)
    	{
    		int temp=arr[i][j];
    		arr[i][j]=arr[j][i];
    		arr[j][i]=temp;
    	}
    	System.out.println();
    }
    print(arr);
	}
public static void print(int[][] arr)
{
	for(int[] a:arr)
	{
		for(int ele:a)
		{
			System.out.print(ele+" ");
		}
		System.out.println();
	}
}
}

/* output 
2 3 4 
5 6 7 
7 8 3 



2 5 7 
3 6 8 
4 7 3 
*/