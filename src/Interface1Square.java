interface Square{
	int p=2;
	double FindSquare(double x);
}
class SquareImpl implements Square{
	@Override
	public double FindSquare(double x) {
		return Math.pow(x,p);
	}
}
public class Interface1Square {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SquareImpl si=new  SquareImpl();
       double d=si.FindSquare(15);
       System.out.println("Square of 15 is" + d);
	}

}
