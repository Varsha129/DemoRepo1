package Arrays;

public class LeftRotateElementsOfArray {

	public static void main(String[] args) {
			 
		 int arr1[]= new int[]{1,2,3,4,5};// arr length=4
		 int i,first=arr1[0];//first=1
		 
		 System.out.println("Elements of array 1:");
		 for(i=0;i<=arr1.length;i++)
		 {
			 System.out.println(arr1[i]);
			 
		 }
		 System.out.println("Elements of left rotated array:");
		 for(i=0;i<arr1.length-1;i++)
		 {
			  arr1[i]=arr1[i+1];//{2
			  first=arr1[i];//first=2
			  
			  System.out.println(arr1[i]);
	} 
		 
		 
		 
		}
	}


