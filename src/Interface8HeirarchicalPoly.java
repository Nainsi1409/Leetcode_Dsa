interface Greeting
{
	void greet();
}
class Hindi implements Greeting
{
	public void greet()
	{
		System.out.println("Namaskar............!");
	}
}
class English implements Greeting
{
	public void greet()
	{
		System.out.println("Hello................!");
	}
}
class Gujarati implements Greeting
{
	public void greet()
	{
		System.out.println("Jai Shri Krishna.......!");
	}
}


public class Interface8HeirarchicalPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Greeting g;
		
		g = new Hindi();
		g.greet();
		
		g = new English();
		g.greet();
		
		g = new Gujarati();
		g.greet();
	}

}
