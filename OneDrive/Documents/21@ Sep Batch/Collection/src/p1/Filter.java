package p1;

import java.util.ArrayList;
import java.util.List;



/*class product{//Here iam creating class product and paramitrerized constuctor.
	private int id;
	private String name;
	double price;

	public product(int id, String Name, double price){
		this.id=id;
		this.name= Name;
		this.price=price;
	}
}
public class Filter {
public static void main(String[] args) { // here i am creating class filter and also create list Object
	List<product> productlist= new ArrayList<product>();
	productlist.add(new product(1,"Hp Laptop",26000));
	productlist.add(new product(2,"Dell Laptop",36000));
	productlist.add(new product(3,"Omn Laptop",28000));
	productlist.add(new product(4,"Mi Laptop",16000));
	productlist.add(new product(5,"Lenovo Laptop",20000));
	productlist.add(new product(6,"Apple Laptop",260000));
	//Here i am using API
	
	productlist.stream()
		.filter(p->p.price<36000)
			.forEach(pr->System.out.println(pr.price));
	/*26000.0
	28000.0
	16000.0
	20000.0*/

	
	
class Student {
	
	long id;
	String Name;
	String Course;
	
	public  Student(long id, String Name,String Course) {
	
	this.id=id;
	this.Name=Name;
	this.Course=Course;
}


}

public class Filter{
	
	public static void main(String...x) {
		
		List<Student> studentlistobject= new ArrayList<Student>();
		
		// Y i am creating of new Student(100,"Farooq","Mechanical")) because i am  create student object here.
		
		studentlistobject.add(new Student(100,"Farooq","Mechanical"));
		studentlistobject.add(new Student(101,"Mallika","PHB"));
		studentlistobject.add(new Student(102,"Siva","Next Wave"));
		studentlistobject.add(new Student(103,"Tom","CSE"));
		studentlistobject.add(new Student(104,"Cat","IT"));
		studentlistobject.add(new Student(105,"King","ECE"));
		studentlistobject.add(new Student(106,"Lion","Forest"));
		studentlistobject.add(new Student(107,"Mom","CIVIL"));
		studentlistobject.add(new Student(108,"Farooq","EEE"));
		studentlistobject.add(new Student(109,"Giraffe","Food Technology"));
		
		
		studentlistobject.stream()
			.filter(Student->Student.id>106)//107,108,109
			.forEach(Stu->System.out.println(Stu.Course));//Mom,Farooq,Giraffe
	}
}