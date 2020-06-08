package Practice;

import java.util.Scanner;

public class sumOfDigitsOfNumber {
	
	//eg : number=123
	
	public static void main(String[] args){
		
		int temp=0,num=0,sum=0;
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter the number");
		
		num=obj.nextInt();
		
		
		while(num>0)
			
			//for(i=0;i<num;i++)
				//12345
			{
				temp = (num % 10); 
				 
				sum= sum+temp;
				//System.out.println( sum);
				num = num / 10 ; 
				//System.out.println( num);
			}
				 
		
		
		System.out.println(sum);
		}
	}


