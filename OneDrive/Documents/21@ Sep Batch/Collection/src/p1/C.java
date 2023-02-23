package p1;

import java.util.HashSet;
import java.util.Iterator;

public class C {
public static void main(String[] args) {
	HashSet hs= new HashSet();
	hs.add("Farooq");
	hs.add(100);
	hs.add('F');
	hs.add(null);
	System.out.println(hs);
	
	/*Iterator itr= hs.iterator();
	while(itr.hasNext()) {
		System.out.println(itr.next());*/
	{
hs.remove(null);
System.out.println(hs);
System.out.println(hs.contains("Farooq"));

	System.out.println(hs.contains(1000));

		}
	for (Object e : hs) {
		System.out.println(e);
		System.out.println(hs.size());
		System.out.println(hs.containsAll(hs));
	}
	}

}
/*import java.util.HashSet;

public class C {
public static void main(String[] args) {
	HashSet<Integer> evennumbers = new HashSet<Integer>();
	evennumbers.add(100);
	evennumbers.add(200);
	evennumbers.add(300);
	evennumbers.add(400);
	evennumbers.add(500);
	evennumbers.add(600);
	System.out.println(evennumbers);//[400, 100, 500, 200, 600, 300]
	
	HashSet<Integer> numbers = new HashSet<Integer>();
	
	
	numbers.addAll(evennumbers);
	numbers.add(20);
	numbers.add(40);
	numbers.add(80);
	System.out.println("After add all numbers:"+ numbers);//[400, 80, 100, 500, 20, 200, 600, 40, 300]
	
	System.out.println(numbers.size());//9
	
	numbers.removeAll(evennumbers);
	System.out.println("After removeAll evennumbers: "+numbers);//[80, 20, 40]
	System.out.println(numbers.size());//3
			

	System.out.println(numbers.contains(20));//true
	System.out.println(numbers.contains(203));//false
	
	System.out.println(numbers.remove(1));
	package p1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

////public class A { it convert array to hasset


public static void main(String[] args) {

String arr[]= {"tom","kom","ring"};
for (String val : arr) {
	System.out.println(val);
}

HashSet<String> a = new HashSet<String>(Arrays.asList(arr));
System.out.println(a);
}
}
}
}*/
