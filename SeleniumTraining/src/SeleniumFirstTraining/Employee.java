package SeleniumFirstTraining;

public class Employee

{
	public static String collegeName;

	public static void main(String[] args)
	{
		String name="Sheetal";
		int voteAge=10;
		int salary=100000;
		int age =25;
		String address ="123 Testing way";
		System.out.println("Person name is " + name + "Age: "+ age +"lives at " + address + "has salary "+ salary +"CollegeName is " +collegeName);
		if(voteAge>=18)
		{
			System.out.println("Eligile for vote");
			
		}
		else 
			System.out.println("Not eligible for vote");
		
		
	}
}
