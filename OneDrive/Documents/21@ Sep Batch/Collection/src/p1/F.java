package p1;

import java.util.HashMap;
import java.util.Hashtable;

public class F {
public static void main(String[] args) {
	
	
	Hashtable map = new Hashtable();
	map.put(1,'f');
	map.put(4, "Farooq");
	map.put(5, "Mike");
	map.put(6, "Siva");
	map.put(7, "Farooq");
	
	System.out.println(map);
	
/*System.out.println(map.get(map));//null
System.out.println(map.keySet());//[null, 1, 3, 4, 5, 6, 7, 8]
System.out.println(map.values());//[null, f, null, Farooq, Mike, Siva, Farooq, null]

for (Object i :map.keySet()) {//it will print individual keys and values
	
	System.out.println(i+" "+map.get(i));*/
} 

	
}


