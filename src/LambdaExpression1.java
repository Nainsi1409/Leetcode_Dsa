interface Add{
	int add(int a,int b);
}
public class LambdaExpression1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Add a1=(int a,int b)->
     {
    	 return a+b;
     };
     System.out.println("sum="+a1.add(500,600));
     Add a2=( a, b)->
     {
    	 return a+b;
     };
     System.out.println("sum="+a2.add(300,200));
     Add a3=(a,b)->a+b;
     System.out.println("sum="+a3.add(800,700));
	}

}
