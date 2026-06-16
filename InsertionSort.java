package SearchingAndSorting;

public class InsertionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  int[] arr= {4,3,6,1,7,2,8};
  for(int i=0;i<arr.length;i++)
  {
	  int temp=arr[i];
	  int j=i-1;
	  while(j>=0 && arr[j]>temp) {
		  arr[j+1]=arr[j];
		  j--;
	  }
	  arr[j+1]=temp;
  }
  for(int ele:arr) {
	  System.out.println(ele+" ");
  }
	}

}
/*
1 
2 
3 
4 
6 
7 
8 
*/