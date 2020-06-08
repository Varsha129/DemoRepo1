package Practice;

import java.util.Scanner;

public class greatestNumber {
	public static void main(String[] args) {

		int x=0, y=0,z=0;

		Scanner obj = new Scanner (System.in);
		System.out.println("Enter the numbers :");

		x= obj.nextInt();
		y= obj.nextInt();
		z= obj.nextInt();

		if(( x>y)&& (x>z) )
		{
			System.out.print( "the greatest number is x=" +x );
		}
		else if((y>x) && (y>z))
			{
			System.out.print( "the greatest number is y=" +y );
			}
				else if((z>x) && (z>x))
				{
					System.out.print( "the greatest number is z=" +z );
				}
	}
}



