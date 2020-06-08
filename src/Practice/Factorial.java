package Practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i=1, fact=1,num;// 5*4*3*2*1=
		Scanner obj= new Scanner(System.in);
		System.out.println("enter the number:");
		
		num= obj.nextInt();
		
		for (i=1;i<=num;i++){
			fact*=i;
		}
		
		 System.out.println("factorial is :" +fact);
	}

}
