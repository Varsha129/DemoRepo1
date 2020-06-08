package Practice;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {

		int year=0;

		Scanner obj = new Scanner (System.in);
		System.out.println("Enter the year :");

		year= obj.nextInt();
		 
		if((year % 4==0)&& (year % 100 ==0) )
		{
			System.out.print( year+" year is leap year :" );
		}
		else if
		((year % 4==0)&& (year % 100 !=0)&& (year%400==0))
		{
			System.out.print( year+" year is leap year :" );
		}
		else
		
		{
			System.out.print(" year is not leap year :");			
		}
	}
	
}
