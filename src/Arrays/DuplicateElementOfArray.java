package Arrays;

public class DuplicateElementOfArray {

	public static void main(String[] args) {
			int i=0,j=0;
		 int arr1[]= new int[]{1,2,2,3,3,4,4,4,5};
		 
		/* System.out.println("Elements of array 1:");
		 
		 for(i=0;i<arr1.length;i++)
		 {
			  System.out.println(arr1[i]);
	}*/
		  for(i=0;i<arr1.length;i++)
		  {
			  for(j=i+1;j<arr1.length;j++)
			  if(arr1[i]==arr1[j])
				   
			  System.out.println(j);
				  
		  }
		   
		  
	}
}

