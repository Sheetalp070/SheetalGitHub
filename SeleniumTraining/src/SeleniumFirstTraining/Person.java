package SeleniumFirstTraining;

public class Person {
	String Name;
	int age;
	String address;
	
	public void prinPerson()
	{
	
		System.out.println(Name);
		System.out.println(age);
		System.out.println(address);
}
			public Person(String Name,int age, String address) {
					this.Name=Name;
					this.age= age;
				this.address=address;
		
	}
}
