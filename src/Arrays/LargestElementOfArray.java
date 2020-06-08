package Arrays;

public class LargestElementOfArray {

	public static void main(String[] args) {
			int i=0;
		 int arr1[]= new int[]{1,2,3,4,5};
		  
		int max=arr1[0];
		 
		  for(i=0;i<arr1.length;i++){
			  if (arr1[i]>max)
			  
				  max=arr1[i];
				   
			  
			  //System.out.println("largest element=" +max);
		  }
		  System.out.println("largest element=" +max);
	}
}
	