package Practice;

import java.util.Scanner;

public class ArmstrongNumber1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		
		int num=0,a=0,b=0,temp=0, i,sum=0;
		
		Scanner obj= new Scanner(System.in);
		
		System.out.println("enter the number:");
		num= obj.nextInt();
		temp=num;
		while(num>0){
			a=num%10;
			b= a*a*a;
			sum=sum+b;
			num=num/10;
			
		 System.out.println(sum);

		}
		 if (temp==sum)
			 System.out.println("number is Armstrong num");
	}

}
