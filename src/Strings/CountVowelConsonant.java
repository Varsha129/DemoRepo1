package Strings;
// vowels=a,e,i,o,u

public class CountVowelConsonant {

	 public static void main(String[] args){
		 String str= "This is a really simple sentence";
		 
		 int i=0, Vcount=0, Ccount=0;
		 
		 str= str.toLowerCase();
		 System.out.println(str);
		 
		 for (i=0;i<str.length();i++)
		 {
			 if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
				 Vcount++;
			 else if (str.charAt(i)>'a' && str.charAt(i)<'z')
				 Ccount++;
			 
		 }
		 
		 System.out.println("Total vowels in the string are :" +Vcount);
		 System.out.println("Total consonants in the string are :" +Ccount);
		 
		 
		 
		 
		 
		 
		 
		 
		 
		 
				 
		 
		 
		 
		 
		 
				 }
}
