package AbstractClassDemo;

public abstract class Vehicle {
 String name;
	public abstract void run();
	
	public void testMethod()
	{
		System.out.println("This is not abstract method of vehicle class");
	}
	public Vehicle(String n)
	{
		this.name=n;
	}
}
