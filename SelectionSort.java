package SearchingAndSorting;
//It will select a element compare with smallest element then swap that 
//Selection sort for ascending order
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] arr= {1,6,8,2,9};
   for(int i=0;i<arr.length-1;i++)
   {
	   int minIndex=i;
	   for(int j=i+1;j<arr.length;j++)
	   {
		   if(arr[j]<arr[minIndex])
		   {
			   minIndex=j;
		   }
	   }
	   int temp=arr[minIndex];
	   arr[minIndex]=arr[i];
	   arr[i]=temp;
   }
   for(int ele:arr)
   {
	   System.out.println(ele+" ");
   }
	}

}
/*
1 
2 
6 
8 
9 
*/