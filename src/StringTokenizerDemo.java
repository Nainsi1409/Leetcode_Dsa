// Demonstrate StringTokenizer.
import java.util.StringTokenizer;
class StringTokenizerDemo
{

public static void main(String args[]) 
{
String in = "title=Java: The Complete Reference;author=Schildt;publisher=Osborne/McGraw-Hill;copyright=2002";
StringTokenizer st = new StringTokenizer(in, " ");
System.out.println("st.countTokens() = "+st.countTokens());
while(st.hasMoreTokens()) 
{
String key = st.nextToken();
//String val = st.nextToken();
//System.out.println(key + "\t::" + val);
System.out.println(key +",");
}
System.out.println("charAt : "+in.charAt(5));
System.out.println("indexOf : "+in.indexOf('T'));
System.out.println(in.length());
System.out.println(in.endsWith("abc"));
System.out.println(in.endsWith("2002"));
System.out.println(in.startsWith("title"));
System.out.println(in.isEmpty());
String str="";
System.out.println(str.isEmpty());

}
}
