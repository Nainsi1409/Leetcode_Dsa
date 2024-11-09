interface Sports
{
	void show();
}
interface Match extends Sports
{
	 void display();
}

class BImpl implements Match
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


public class Interface6MultiLevel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BImpl b = new BImpl();
		b.show();
		b.display();
	}

}
