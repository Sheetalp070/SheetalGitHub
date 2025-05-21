package SeleniumFirstTraining;

public class methodOverloading {
	int a;
	int b;
	int c;
	

	public static void main(String[] args)
	{
		methodOverloading mo=new methodOverloading();
		//mo.add(20,10);
		mo.add(10,20,30);
	}
	public void add(int a, int b)
	{
		System.out.println(a+b);
	}
	public void add(int a, int b,int c)
	{
		System.out.println(a+b+c);
	}
}

