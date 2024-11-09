import java.util.Scanner;
interface Arithmetic{
	int addition(int a,int b);
	int substraction(int a,int b);
	int multiplication(int a,int b);
	int division(int a,int b);
}
class Calculation implements Arithmetic{
	@Override
	public int addition(int a,int b) {
		return a+b;
	}
	@Override
	public int substraction(int a,int b) {
		return a-b;
	}
	@Override
	public int multiplication(int a,int b) {
		return a*b;
	}
	@Override
	public int division(int a,int b) {
		return a/b;
	}
}


public class Interface5ArithmeticOperation {

	public static void main(String[] args) {
		Calculation cal=new Calculation();
		// TODO Auto-generated method stub
	  int choice,result;
       System.out.println("enter two numbers");
       Scanner s =new Scanner(System.in);
       int x=s.nextInt();
       int y=s.nextInt();
       System.out.println("enter 1 for performing Add");
       System.out.println("enter 2 for performing Sub");
       System.out.println("enter 3 for performing Mul");
       System.out.println("enter 4 for performing Div");
       System.out.println("enter your choice for performing operation");
       choice=s.nextInt();
       switch(choice) {
       case 1: 
    	   
    	   result=cal.addition(x,y);
    	   System.out.println(result);
    	   break;
    	   
       case 2: 
    	   result=cal.substraction(x,y);
    	   System.out.println(result);
    	   break;
    	   
       case 3: 
    	   
    	   result=cal.multiplication(x,y);
    	   System.out.println(result);
    	   break;
    	   
       case 4: 
    	  
    	   result=cal.division(x,y);
    	   System.out.println(result);
    	   break;
    	   
       default : 
    	    System.out.println("INVALID CHOICE");
    	   break;
       }
	}

}
