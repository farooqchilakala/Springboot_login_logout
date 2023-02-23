package p1;

import java.util.LinkedList;

/*public class B {
public static void main(String[] args) {
	
	LinkedList x = new LinkedList();
	x.add(10);
	x.add('F');
	x.add("Farooq");
	x.add("java");
	x.add('C');
	x.add(null);
	System.out.println(x);//[10, F, Farooq, java, C, null]
	{
	x.add(6, "Mysql");
	System.out.println(x);//[10, F, Farooq, java, C, null, Mysql]
	
	//By using for loop we read the data in linked list

	for(int i=0;i<x.size();i++) {
		System.out.println(x.get(i));
	
	
	System.out.println(x.size());//7
	x.remove(null);
	System.out.println(x);*/
	
	import java.util.LinkedList;

	public class B {

		public static void main(String[] args) {
	 LinkedList<String> l = new LinkedList<String>();
	 l.add("cat");
	 l.add("goat");
	 l.add("cow");
	 l.add("carrot"); 
	 l.add("camel");
	 l.add("Monkey");
	 System.out.println(l);//[cat, goat, cow, carrot, camel, Monkey]
	 l.addFirst("Tiger");
	 l.addLast("Lion");
	 System.out.println(l);//[Tiger, cat, goat, cow, carrot, camel, Monkey, Lion]
	 System.out.println(l.get(1));
		}

	}
	