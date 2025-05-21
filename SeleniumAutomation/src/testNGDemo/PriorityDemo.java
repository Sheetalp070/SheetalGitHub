package testNGDemo;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class PriorityDemo
{
	@Test(groups="Login")
	public void test1()
	{
	System.out.println("First Test");

    }
	
	@Test(groups="Login")
	public void test2() {
		System.out.println("Second test");
	}
	
	@Test(groups="Admin")
	public void test3()
	{
	System.out.println("Third Test");

    }

	@Test(groups="Admin")
	public void test4()
	{
	System.out.println("Forth Test");

    }
}
