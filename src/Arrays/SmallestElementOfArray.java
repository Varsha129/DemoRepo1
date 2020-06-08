package Arrays;

public class SmallestElementOfArray {

	public static void main(String[] args) {
			int i=0,j=0;
		 int arr1[]= new int[]{1,2,3,4,5};
		 int min=arr1[0];
		  for(i=0;i<arr1.length;i++)
		  {
			  if(arr1[i]<min)
				   min=arr1[i];
		  }
		  System.out.println("smalllest element in array=" +min);
	}
}
		  
		 
	