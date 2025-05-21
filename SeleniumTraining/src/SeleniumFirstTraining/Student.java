package SeleniumFirstTraining;

public class Student extends Person{

	String courseName;
	int fees;
	
	public Student(String Name, int age, String address,String cn,int fee) {
		super(Name, age, address);
		this.courseName=cn;
		this.fees=fee;
	}
		// TODO Auto-generated constructor stub
	
	public void printStudent()		
	{
		System.out.println(Name);
		System.out.println(age);
	    System.out.println(courseName);
	    System.out.println(fees);	
	    System.out.println(address);
	
	}
}

