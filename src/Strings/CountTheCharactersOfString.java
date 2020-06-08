package Strings;

public class CountTheCharactersOfString {

	public static void main(String[] args){

		String str1= "Hello Automation" ;
		int i=0,count=0;


		for(i=0;i<str1.length();i++)
		{
			if(str1.charAt(i)!=' ')
				count++;

		}
		
		System.out.println("Total number of characters in a string:" +count);

	}
}



