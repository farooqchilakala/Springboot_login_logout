package p1;


import java.util.Arrays;
import java.util.HashMap;

public class D {
public static void main(String[] args) {
	HashMap<Integer,String> x = new HashMap<Integer,String>  ();
	/*HashMap x = new HashMap  ();*/
	x.put(101, "Tom");
	x.put(102, "Kom");
	x.put(103, "MOM");
	x.put(104, "Dom");
	x.put(105, "TB");
	x.put(108, "Kom");
	x.put(106, "DOM");
	System.out.println(x);//{101=Farooq, 102=Yuvaraju, 103=Naveen, 104=Pavan, 105=Balaraju, 106=Pavan, 108=Siva}
	
	System.out.println(x.get(108));//Siva
x.remove(108);
System.out.println(x);
System.out.println(x.containsKey(102));
System.out.println(x.containsKey(109));
System.out.println(x.containsValue("pavan"));
System.out.println(x.containsValue("King"));
System.out.println(x.containsValue("Farooq"));
System.out.println(x.keySet());


for (int i: x.keySet()) {
	System.out.println(i);
	
}
System.out.println();

System.out.println(x.values());


for (String i:x.values()) {
	System.out.println(i);
	
}
/*for (Object i  :x.keySet()) {
	System.out.println(i+"......"+x.get(i));
	
}*/


	
	
}

}


