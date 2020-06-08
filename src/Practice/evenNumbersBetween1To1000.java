package Practice;

public class evenNumbersBetween1To1000 {
	
	public static void main(String[] args) {
		
		int i=0, num=1;
		
		for(i=0;num<=1000;i++) {
			
			if(num % 2==0){
				System.out.println(num);
				
			}
			num++ ;			
		}
	}

}
