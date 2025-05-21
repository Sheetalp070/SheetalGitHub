package CollectionPackage;

import java.util.ArrayList;

public class ListDemo {
	private static final boolean String = false;

	public static void main(String[] args)
	{
		ArrayList<String> list1= new ArrayList<String>();
		list1.add("One");
		list1.add("Two");
		list1.add("Three");
		list1.remove(1);
	
	
	for(int i=0;i<list1.size();i++)
		System.out.println(list1.get(i));
	}

}

	