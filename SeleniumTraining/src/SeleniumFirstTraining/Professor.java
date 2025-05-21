package SeleniumFirstTraining;

public class Professor extends Person
{
	int salary;
	int exp;
	
	
	 public  Professor(String nm,int ag,String address,int sal ,int ex)
	   {
		 super(nm,ag,address);
		 this.salary=sal;
		 this.exp=ex;
		 
	    }
	public void printProfessor()
	{
		System.out.println(Name);
		System.out.println(age);
		System.out.println(address);
		System.out.println(salary);
	   System.out.println(exp);

    }
   
}
