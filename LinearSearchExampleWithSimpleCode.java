package SearchingAndSorting;
//This is simple way to search a element in linear search
//Time complexity for lineary search is O(n)
public class LinearSearchExampleWithSimpleCode {
   public static int linearSearch(int[] arr,int target)
   {
	   for(int i=0;i<arr.length;i++)
	   {
		   if(arr[i]==target)
		   {
			   return i;
		   }
	   }
	   return -1;
   }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,6,7,6,4};
		  System.out.println(linearSearch(arr, 6)); // Output: 1
	}

}
