interface A1
{
	void show();
}
interface B1 
{
	 void display();
}

class ABImpl implements A1,B1
{

	@Override
	public void show() 
	{
		System.out.println("Inside Show");		
	}

	@Override
	public void display() 
	{
		System.out.println("Inside Display");
	}
	
}


public class Interface7Multiple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ABImpl b = new ABImpl();
		b.show();
		b.display();

	}

}
