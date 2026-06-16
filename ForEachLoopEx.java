package multiDimensionalArrays;

public class ForEachLoopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First Method
		int[][] arr= {{2,0,3},{2,0,1},{2,0,1}};
		for(int[] a:arr)
		{
			for(int ele:a)
			{
				System.out.print(ele+" ");
			}
			System.out.println();
		 }
		//Second method
//		int[][] arr= {{2,0,3},{2,0,1},{2,0,1}};
//		for(int i=0;i<arr.length;i++)
//		{
//			for(int ele:arr[i])
//			{
//				System.out.print(ele+" ");
//			}
//			System.out.println();
//		 }
	}
}
/* output
2 0 3 
2 0 1 
2 0 1 
*/