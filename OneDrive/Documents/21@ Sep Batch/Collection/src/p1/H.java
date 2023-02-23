package p1;

import java.util.Vector;

public class H{
public static void main(String args[]) {  
    Vector v = new Vector();  
    v.add("Tiger");  
    v.add("Lion");  
    v.add("Dog");  
    v.add("Elephant"); 
    v.add(100);
    v.add(100);
    v.add('f');
    v.add(null);
    System.out.println(v);//[Tiger, Lion, Dog, Elephant, 100, 100, f]
    
    System.out.println(v.contains(100));//true
    
    System.out.println(v.get(4));
    for (Object object : v) {
    	System.out.println(object);
		
	}
}}