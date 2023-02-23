package p1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeSet;

public class E {
public static void main(String[] args) {
	TreeSet t = new TreeSet();
	t.add("A");
	t.add("C");
	t.add("D");
	t.add("B");
	t.add("D");
	
	System.out.println(t);
	System.out.println(t.size());
	System.out.println(t.contains("mom"));
	System.out.println(t.isEmpty());
	t.remove("lion");
	System.out.println(t);
	System.out.println(t.size());
	/*for (Object e : t) {
		System.out.println(e);*/
		Iterator itr = t.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
			
			
			String arr[]= {"Tom","Mom","Kom"};
			for(String val: arr){
				System.out.println(val);//Tom
				//Mom
				//Kom
			}
			
		
TreeSet a = new TreeSet(Arrays.asList(arr));
		System.out.println(a);//[Tom, Mom, Kom]

}}}
