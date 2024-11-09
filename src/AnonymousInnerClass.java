interface Anonymous
{
	int add(int x,int y);
}
public class AnonymousInnerClass {

	public static void main(String[] args) 
	{
	     Anonymous a1=new Anonymous() 
	     {
    	    @Override
    	    public int add(int x,int y)
    	    {
    	        return (x+y);
            }
	     };
      int z=a1.add(50, 60);
      System.out.println(z);
    }
}