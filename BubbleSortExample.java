package SearchingAndSorting;
//To print the array elements in ascending order
public class BubbleSortExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int[] arr= {1,6,8,2,9};
     for(int i=0;i<arr.length-1;i++)
     {
    	 for(int j=i+1;j<arr.length;j++)
    	 {
    		 if(arr[i]>arr[j])
    		 {
    			 int temp=arr[i];
    			 arr[i]=arr[j];
    			 arr[j]=temp;
    		 }
    	 }
     }
     for(int num:arr)
     {
    	 System.out.println(num+" ");
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