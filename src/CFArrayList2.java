import java.util.*;
public class CFArrayList2 {
	public static void main(String[] args) {
		List<Integer>li=new ArrayList<>();
		li.add(12);
		li.add(34);
		li.add(78);
		li.add(36);
		li.add(18);
		li.add(90);
		Iterator<Integer> iterator=li.iterator() ;
		while(iterator.hasNext()) {
		Integer i=iterator.next();
		System.out.println(i);
		}
		}
}