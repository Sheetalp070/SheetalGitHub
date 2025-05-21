package AbstractClassDemo;

public class Bike extends Vehicle
{

	int speed;
	@Override
	public void run() 
	{
		System.out.println("This is Bike method");
	}	
	
		public Bike(String n, int sp) {
		// TODO Auto-generated constructor stub
			super(n);
			speed=sp;
	}
		public void showBike()
		{
			System.out.println("The speed of the bike is "+ speed);	
			System.out.println("The name of the bike is "+ name);
			
					
			
		}
		
	}
	
	


