package SearchingAndSorting;
/*Time complexity:
 Best case: O(n log n)
  worst case:O(n^2)
 */
public class QuickSort {
public static int partition(int[] arr,int lb,int ub) {
	int pivot=arr[lb];
	int start=lb;
	int end=ub;
	while(start<end) {
		if(arr[start]<=pivot) {
			start++;
		}
		if(arr[end]>pivot) {
			end--;
		}
		if(start<end) {
			//we need to swap the start with end
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
		}
	}
	//we need to swap the lower bound with end when start is greater than end
	int temp=arr[lb];
	arr[lb]=arr[end];
	arr[end]=temp;
	return end;
}
public static void quickSort(int[] arr,int lb,int ub) {
	if(lb<ub) {
		int loc=partition(arr, lb,ub);
		quickSort(arr,lb,loc-1);
		quickSort(arr,loc+1,ub);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int[] arr= {3,2,1,4,5,6};
      quickSort(arr,0,arr.length-1);
      for(int ele:arr) {
    	  System.out.println(ele+" ");
      }
	}

}
