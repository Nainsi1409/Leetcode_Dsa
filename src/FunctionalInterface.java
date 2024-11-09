interface Hello//functional interface
{
	void sayHello();
	default void hello()
	{
		System.out.println("hello");
	}
	static void bye()
	{
		System.out.println("Bye");
	}
	String toString();
	
}
class ImpleterClass implements Hello
{

	@Override
	public void sayHello() 
	{
	System.out.println("Say Hello");		
	}
	
}


public class FunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ImpleterClass ic = new ImpleterClass();
		ic.hello();
		ic.sayHello();
		Hello.bye();
	}

}
