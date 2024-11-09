abstract class A{
	abstract void show();
	void display() {
		System.out.println("Inside normal method");
	}
}
class B extends A{
	@Override
	void show() {
		System.out.println("Inside abstract method");

	}
}
public class AbstractClassAndMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      B b=new B();
      b.display();
      b.show();
      
      }

}
