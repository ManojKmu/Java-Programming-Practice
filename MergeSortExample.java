package SearchingAndSorting;

public class MergeSortExample {
public static void mergeSort(int[] arr,int low,int high) {
	if(low<high) {
		int mid=(low+high)/2;
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		merge(arr,low,mid,high);
	}
}
public static void merge(int[] arr,int low,int mid,int high) {
	int[] temp=new int[high-low+1];
	int i=low;
	int j=mid+1;
	int k=0;
	while(i<=mid && j<=high) {
		if(arr[i]<=arr[j]) {
			temp[k]=arr[i];
			i++;
		}else {
			temp[k]=arr[j];
			j++;
		}
		k++;
	}
		while(j<=high) {
			temp[k]=arr[j];
			j++;
			k++;
		}
			while(i<=mid) {
				temp[k]=arr[i];
				i++;
				k++;
			}
	for(k=0;k<temp.length;k++) {
		arr[low+k]=temp[k];
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[] arr= {3,6,1,8,2};
   mergeSort(arr,0,arr.length-1);
   System.out.println("Sorted Array:");
   for(int ele:arr) {
	   System.out.println(ele+" ");
   }
   
	}

}
/*
 Sorted Array:
1 
2 
3 
6 
8 
*/
