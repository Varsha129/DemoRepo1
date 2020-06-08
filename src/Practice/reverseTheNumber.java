package Practice;

import java.util.Scanner;

public class reverseTheNumber {
	
	public static void main(String[] args) {
		
		int num=0,temp=0;
		
		Scanner obj = new Scanner (System.in);
		System.out.println("Enter the number :");
		
		num= obj.nextInt();
		while(num>0)
		{
			temp= (num % 10);
			System.out.print( temp);
			num= (num/10);
		}
		
	}
}
