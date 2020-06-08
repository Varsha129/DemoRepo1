package Practice;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class GroupTest {
	@BeforeClass(groups ={"Sanity","Database","Regression"})
	
	public void setUP(){
		
		System.out.println("setUP() ");
		
	}

	@Test(groups ={"Sanity","Database","Regression"})

	public void test1(){
		
		System.out.println("(groups ={Sanity,Database,Regression})");

	}
	
	@Test(groups ={"Sanity","Database"})

	public void test2(){
		System.out.println("(groups ={Sanity,Database})");

	}

	@Test(groups ={"Sanity"})

	public void test3(){
		
		System.out.println("(groups ={Sanity})");

	}
	
	@Test(groups ={"Sanity","Regression"})

	public void test4(){
		
		System.out.println("(groups ={Sanity,Regression})");

	}


}
