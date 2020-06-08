package Practice;

//import java.util.Scanner;

public class SumOf1to100Numbers {
	
	public static void main(String[] args) {
		int i=0,num=1,sum=0;
		
//		Scanner obj= new Scanner(System.in);
		
		for(i=0; num<=100;i++) {
			
			sum= (sum+num);
			num++;
			
		}
		
		System.out.println(sum);
	}
	
}


