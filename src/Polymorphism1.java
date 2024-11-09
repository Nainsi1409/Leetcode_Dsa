class Shape{
	double dim1 ,dim2;
	Shape(){
		dim1=0;
		dim2=0;
	}
	Shape(double dim1,double dim2){
		this.dim1=dim1;
		this.dim2=dim2;
	}
	void area() {
		System.out.println("Area is undefined");
	}
}

class Rectangle extends Shape{
	Rectangle(){
		super();//Shape()
	}
	Rectangle(double dim1,double dim2){
		super(dim1,dim2);//Shape(double dim1,double dim2)
	}
	@Override
	void area() {
		double a;
		a=dim1*dim2;
		System.out.println("Area Of Reactangle="+a);
	}
}

class Traingle extends Shape{
	Traingle(){
		super();//Shape()
	}
	Traingle(double dim1,double dim2){
		super(dim1,dim2);//Shape(double dim1,double dim2)
	}
	@Override
	void area() {
		double a;
		a=(dim1*dim2)/2;
		System.out.println("Area Of Traingle="+a);
	}
}

class Circle extends Shape{
	Circle(){
		super();//Shape()
	}
	Circle(double dim1,double dim2){
		super(dim1,dim2);//Shape(double dim1,double dim2)
	}
	@Override
	void area() {
		double a;
		a=3.14*dim1*dim1;
		System.out.println("Area Of Circle="+a);
	}
}
public class Polymorphism1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Shape s;
       Rectangle r=new Rectangle(3,4);
       Traingle t=new Traingle(5,9);
       Circle c =new Circle(10,10);
       s=t;
       s.area();
       s=r;
       s.area();
       s=c;
       s.area();
       
	}

}
