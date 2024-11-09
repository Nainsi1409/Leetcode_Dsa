class ArithmeticOperation{
	double a,b;
    ArithmeticOperation() {
		a=0;
		b=0;
	}
    ArithmeticOperation(double a,double b){
    	this.a=a;
    	this.b=b;
    }
    void operation() {
    	System.out.println("Operation is not defined");
    }
}
class Addition extends ArithmeticOperation{
	public Addition() {
		super();  //ArithmeticOperation
	}
	public Addition(double a ,double b) {
		super( a ,b);  //ArithmeticOperation( a , b)
	}
	@Override
	void operation() {
		System.out.println("addition of "+a+"and"+b+" is= "+(a+b));
	}
	
}
class Substraction extends ArithmeticOperation{
	public Substraction() {
		super();  //ArithmeticOperation
	}
	public Substraction(double a ,double b) {
		super( a ,b);  //ArithmeticOperation( a , b)
	}
	@Override
	void operation() {
		System.out.println("Substraction of "+a+"and"+b+" is= "+(a-b));
	}
	
}
class Multiplication extends ArithmeticOperation{
	public Multiplication() {
		super();  //ArithmeticOperation
	}
	public Multiplication(double a ,double b) {
		super( a ,b);  //ArithmeticOperation( a , b)
	}
	@Override
	void operation() {
		System.out.println("Multiplication of "+a+"and"+b+"is= "+(a*b));
	}
	
}
class Division extends ArithmeticOperation{
	public Division() {
		super();  //ArithmeticOperation
	}
	public Division(double a ,double b) {
		super( a ,b);  //ArithmeticOperation( a , b)
	}
	@Override
	void operation() {
		System.out.println("Division of"+a+"and"+b+" is= "+(a/b));
	}
	
}
public class Polymorphism2ArithOper {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ArithmeticOperation ao;
        Addition a=new Addition(15,16);
        Substraction s=new Substraction(10,5);
        Multiplication m=new Multiplication(12,10);
        Division d= new Division(20,2);
        ao=a;
        ao.operation();
        ao=s;
        ao.operation();
        ao=m;
        ao.operation();
        ao=d;
        ao.operation();
	}

}
