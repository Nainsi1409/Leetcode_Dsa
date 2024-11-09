import java.util.*;
public class CFArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String>li=new ArrayList<>();
        li.add("mansi");
        li.add("lata");
        li.add("kiran");
        li.add("simran");
        li.get(1);
        
        for(String s: li) {
        	System.out.println(s);
        }
        
        Iterator<String> iterator=li.iterator();
        while(iterator.hasNext()) {
        	String name=iterator.next();
        	System.out.println(name);
        	}
        System.out.println("ONE LIST TO ANOTHER");
        LinkedList<String> ll=new LinkedList<>(li);
        for(String s: ll) {
        	System.out.println(s);
        }
        
        
        System.out.println("ONE LIST TO ANOTHER");
        String[] array = new String[li.size()];

        // Convert List to Array
        li.toArray(array);
        for(String s: array) {
        	System.out.println(s);
        	
        }
        
        System.out.println("ONE LIST TO ANOTHER");
        List<String>atl=new ArrayList<>(Arrays.asList(array));
        for(String s: atl) {
        	System.out.println(s);
        }
	}
	

}
