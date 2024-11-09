interface SayHello{
	String sayhello(String s);
}
public class LambdaExpression2 {

 	public static void main(String[] args) {
		// TODO Auto-generated method stub
       SayHello s1=(String s)->
       {
    	  return (s+",welcome at my home");
       };
       System.out.println(s1.sayhello("nainsi"));
       SayHello s2=(String s)->
       {
    	  return (s+",welcome at my home");
       };
       System.out.println(s2.sayhello("bhoomika"));
       SayHello s3=(String s)->
       {
    	  return (s+",welcome at my home");
       };
       System.out.println(s3.sayhello("chandu"));
	}

}
