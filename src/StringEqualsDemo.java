
public class StringEqualsDemo {


public static void main(String args[]) 
{
String s1 = "Hello";
String s2 = "Hello";
String s3 = "Good-bye";
String s4 = "HELLO";
System.out.println(s1 + " equals " + s2 + " -> " +s1.equals(s2));  //compare values with case sensitivity
System.out.println(s1 + " equals " + s3 + " -> " +s1.equals(s3));
System.out.println(s1 + " equals " + s4 + " -> " +s1.equals(s4));
System.out.println(s1 + " equalsIgnoreCase " + s4 + " -> "+s1.equalsIgnoreCase(s4));//Compare values without case sensitivity

String s = "abcd";
String ss = new String(s);
System.out.println(s + " equals " + ss + " -> " +(s.equals(ss)));
System.out.println(s + " == " + ss + " -> " +(s==ss));  //Compare address
String sss;
sss = s;
System.out.println(s + " == " + sss + " -> " +(s==sss));

System.out.println(s1 + " compareTo " + s2 + " -> " +s1.compareTo(s2));  //compare values with case sensitivity
System.out.println(s1 + " compareTo " + s3 + " -> " +s1.compareTo(s3));
System.out.println(s1 + " compareTo " + s4 + " -> " +s1.compareTo(s4));
System.out.println(s1 + " compareToIgnoreCase " + s4 + " -> " +s1.compareToIgnoreCase(s4));//Compare values without case sensitivity
}
}

