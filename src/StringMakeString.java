
public class StringMakeString {

   public static void main(String[] args) 
	{
		String s = "Hello ";
		System.out.println("s.hashCode() : "+s.hashCode());
		s = s+"Java";
		System.out.println("s.hashCode() : "+s.hashCode());
	
		String s1 = new String("Radhe");
		String s2 = new String(s1);
		System.out.println("s = "+s);
		System.out.println("s1 = "+s1);
		System.out.println("s2 = "+s2);
		
		
	}

}
