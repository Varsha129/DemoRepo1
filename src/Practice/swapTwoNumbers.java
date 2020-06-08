package Practice;

import java.util.Scanner;
import java.io.*;
public class swapTwoNumbers {
	public static void main(String[] args){
		
		int i=0,a=0,b=0;
		
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the two numbers :");
		
		a= obj.nextInt();
		b=obj.nextInt();
		
		i= a;
		a=b;
		b=i;
		
		System.out.println("a=" +a);
		System.out.println("b=" +b);
		
		
	}
	

}