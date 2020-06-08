package Arrays;

public class FrequencyOfElementInArray {

	public static void main(String[] args) {
			int i=0,j=0,count=1;
		 int arr1[]= new int[]{1,2,2,3,3,3,4,5};
		 int Frequency[]= new int [arr1.length];
		 
		 for(i=0;i<arr1.length;i++)
		 {
			   if (arr1[i]==arr1[i+1])// 1==2,i=1 2==2,i=2,i=3 3==3,i=4 3==3,i=5,i=6 
					   {
				         count++;//2
				         System.out.println("frequency of" +arr1[i] +"=" +count);
					   }
	}
		 //System.out.println("frequency of" +arr1[i] +"=" +count);
	}
}
		  
			 
		  

