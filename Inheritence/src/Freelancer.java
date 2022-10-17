
public class Freelancer extends Employee{
	String department;
	public Freelancer(int employeeId, String employeeName, int employeeAge) {
		super(employeeId, employeeName, employeeAge);
		// TODO Auto-generated constructor stub
	}
public void display() {
	super.display();
	System.out.println(this.department);
}
}
