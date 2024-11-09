interface SimpleInterest{
	int r=2;
	double FindSimpleInterest(double p,double t);
}
class SimpleInterestimpl implements SimpleInterest{
	@Override
	public double FindSimpleInterest(double p,double t) {
		
		return ((p*r*t)/100);
	}
}
public class Interface2SimpleInterest {
   public static void main(String[]args) {
	   SimpleInterestimpl si=new SimpleInterestimpl();
	   double simInt=si.FindSimpleInterest(5000,5);
	   System.out.println("simple interest is="+simInt);
   }     
}
