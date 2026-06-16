package SearchingAndSorting;
//returning the element with index position
public class LinearSearchExample2 {
	public static int linearSearch(int arr[],int target)
	{
	   int index=-1;
	   for(int i=0;i<arr.length;i++)
	   {
		   if(arr[i]==target)
		   {
			   index=i;
			  break;
		   }
	   }
	  return index;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {5,8,7,6,4};
		int target=7;
	    int result=linearSearch(arr,target);
	    if(result!=-1)
	    {
	    	System.out.println("Element Found at index:"+result);
	    }  else {
	    	System.out.println("Element Not Found");
	    }
	}

}
/*
Element Found at index:2
*/