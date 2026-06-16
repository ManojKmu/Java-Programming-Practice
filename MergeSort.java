package com.example.recurssion;
public class MergeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int arr[]= {-3,5,2,8,4,1,6,7,5};
      mergeSort(arr);
      for(int ele:arr) System.out.print(ele+" ");
	}
	public static void mergeSort(int[] arr)
	{
		int n=arr.length;
		if(n==1) return;//length of array is sorted
		//step-1: create two new empty arrays of size n/2 each
		int[] a=new int[n/2]; int[] b=new int[n-n/2];
		//step-2:copy and paste arr into a and b
		int idx=0;//travel
		for(int i=0;i<a.length;i++) a[i]=arr[idx++];
		for(int i=0;i<b.length;i++) b[i]=arr[idx++];
		//step-3:Magic
		mergeSort(a);
		mergeSort(b);
		//step-4:Merge a and b into arr
		merge(a,b,arr);
	}
	public static void merge(int[] a,int[] b,int[] c)
	{
		int i=0,j=0,k=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<=b[j]) c[k++]=a[i++];
			else
				c[k++]=b[j++];
		}
		while(i<a.length) c[k++]=a[i++];
		while(j<b.length) c[k++]=b[j++];
	}

}
/* output
1 2 4 5 5 6 7 8  */