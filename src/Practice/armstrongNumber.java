package Practice;

import java.util.Scanner;


// sum of cubes of digits is equal to the number
public class armstrongNumber {

	public static void main(String[] args) {

		int num=0,temp=0,sum=0,a=0,b=0;

		Scanner obj = new Scanner (System.in);
		System.out.println("Enter the number :");

		num= obj.nextInt();
		temp=num;
		while(num>0){
			a=num%10;
			b= a*a*a;
			sum= sum +b;
			num=num/10;
			 
		}

		if(sum==temp)
		{
			System.out.println("number is an armstrong Number");
			
		}
		else
		{
			System.out.println("number is not an armstrong Number");
		}
	}	
		
}