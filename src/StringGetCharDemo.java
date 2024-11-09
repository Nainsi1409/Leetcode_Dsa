
public class StringGetCharDemo {

	public static void main(String[] args) 
	{
		String s = "Hello Student's Padai Kar Liya Karo.";
		char ar[] = new char[9];
		s.getChars(6, 15, ar, 0);
		//s.getChars(startsrc, endsrc, stordest, deststartindex);
		System.out.println(ar);
		System.out.println("s.charAt(5):"+s.charAt(5));
		System.out.println("s.indexOf(\"u\")"+s.indexOf('u'));
		System.out.println("s.endsWith(Abc)"+s.endsWith("Abc"));
		System.out.println("s.endsWith(Karo.)"+s.endsWith("Karo."));
		System.out.println("s.startsWith(hello)"+s.startsWith("hello"));
		System.out.println("s.startsWith(Hello)"+s.startsWith("Hello"));
		
	}

}
