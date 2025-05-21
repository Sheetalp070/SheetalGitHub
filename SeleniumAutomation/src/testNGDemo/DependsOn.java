package testNGDemo;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOn {

	@Test
	public void applyleave()
	{
		Assert.assertEquals(true, true);
		System.out.println("Leave applied");
	}
	
	
	@Test(dependsOnMethods="applyLeave")
	public void approveleave()
	{
		System.out.println("Leave approved");
	}
}
