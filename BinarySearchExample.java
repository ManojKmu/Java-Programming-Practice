package SearchingAndSorting;
//Binary search time complexity of O(log n) best than linear search
public class BinarySearchExample {
public static int binarySearch(int[] arr,int target)
{
	int low=0,high=arr.length-1;
	while(low<=high)
	{
		int mid=low+(high-low)/2;
		if(arr[mid]==target)
		{
			return mid;
		} else if(target<arr[mid])
			{
			   high=mid-1;//left half
			}  else {
				low=mid+1;//right half
			}
		}
	return -1;//not found element
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr= {10,20,30,40,50};
      int res=binarySearch(arr,30);
      if(res!=-1)
      {
    	  System.out.println("Element found at index: "+res);
      }  else {
    	  System.out.println("Element not Found");
      }
	}

}
/*
Element found at index: 2
*/