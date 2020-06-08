package Practice;

import java.util.Scanner;
// num=131

public class palindromNumber {
	public static void main(String[]args){
		int num=0,sum=0,temp=0,rev=0;
		
		Scanner obj= new Scanner(System.in);
		
		System.out.println("enter the number");
		num=obj.nextInt();
		temp=num;
		
		while(num>0)
		{
			rev=(num%10); // 131 % 10= 1 , 13%10=3, 1%10=1
			sum=(sum*10)+rev; //(0*10)+1== 1, (1*10)+3=10+3=13, (13*10)+1=131
			num=(num/10); // 131/10= 13, 13/10=1, 1/10=0
			 
		}
		
		System.out.println(sum);
	
	 if(temp==sum)
	 {
		 System.out.println("number is palindrome");
	 }
	 else
	 {
		 System.out.println("number is not palindrome");
	 }
}

}
		   