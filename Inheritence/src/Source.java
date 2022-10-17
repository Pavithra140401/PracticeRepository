import java.util.*;
public class Source {
	
	public static void main(String[]args) {
		int id;
		String name;
		int age;
		String dname;
		Scanner obj= new Scanner(System.in);
		id=obj.nextInt();
		name=obj.nextLine();
		age=obj.nextInt();
		dname=obj.next();
		Freelancer obj1= new Freelancer(id, name, age, dname);
		obj1.display();
	}

}
