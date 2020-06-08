package Arrays;

public class ReverseArray {

	public static void main(String[] args) {
			int i=0;
		 int arr1[]= new int[]{1,2,3,4,5};
		 
		 
		 System.out.println("Elements of array 1:");
		 for(i=0;i<arr1.length;i++)
		 {
			 System.out.println(arr1[i]);
			 
		 }
		System.out.println("Elements of array in reverse order:");
		for(i=arr1.length-1;i>=0;i--)
		{
			System.out.println(arr1[i]);
		}
	}
}

