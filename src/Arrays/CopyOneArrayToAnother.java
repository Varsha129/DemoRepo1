package Arrays;

public class CopyOneArrayToAnother {

	public static void main(String[] args) {
			int i=0,j=0;
		 int arr1[]= new int[]{1,2,3,4,5};
		 int arr2[]= new int[arr1.length];
		 
		 for(i=0;i<arr1.length;i++)
		 {
			  arr2[i]=arr1[i];
	}
		 System.out.println("Elements of array 1:");
		 for(i=0;i<arr1.length;i++)
		 {
			 System.out.println(arr1[i]);
			 
		 }
		System.out.println("Elements of array:2");
		for(j=0;j<arr2.length;j++)
		{
			System.out.println(arr2[j]);
		}
	}
}

