package SearchingAndSorting;
//returning the element in array exist or not
public class LinearSearchExample {
public static int linearSearch(int arr[],int target)
{
   int index=-1;
   boolean elementFound=false;
   for(int i=0;i<arr.length;i++)
   {
	   if(arr[i]==target)
	   {
		   index=i;
		   elementFound=true;
	   }
   }
   if(elementFound==true)
   {
	   return index;
   }  else {
	   return -1;
   }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int[] arr= {5,6,7,6,4};
    System.out.println(linearSearch(arr,6));//1
	}

}
