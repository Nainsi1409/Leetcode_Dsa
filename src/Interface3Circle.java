interface AreaOfCircle{
	double pi=3.14;
	double FindAreaOfCircle(double r);
}
class CircleImpl implements AreaOfCircle{
	@Override
	public double FindAreaOfCircle(double r) {
		return pi*r*r;
	}
}
public class Interface3Circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CircleImpl si=new  CircleImpl();
	       double d=si.FindAreaOfCircle(15);
	       System.out.println("Area Of Circle  is" + d);
	}

}
