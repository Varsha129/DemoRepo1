package Strings;

import java.util.Arrays;

public class CompareTwoStrings {

	public static void main(String[] args){

		String str1= "Varsha Deshpande";
		String str2= "Varsha Mahurkar";
		int i=0,j=0;
		//char[] string1= str1.toCharArray();
		//char[] string2= str2.toCharArray();
		
		//System.out.println(str1.length());
		//System.out.println(str2.length());

		//Arrays.sort(string1);
		//Arrays.sort(string2);

		for(i=0;i<str1.length();i++)
		{
			for(j=0;j<str2.length();)
			{
				if(str1.charAt(i)==str2.charAt(j))//i=0,j=0
					
					j++;
				 			
			}
			
			System.out.println("two strings are equal");
			 
		}
		 
			
		 
			 
		 
	}
}

