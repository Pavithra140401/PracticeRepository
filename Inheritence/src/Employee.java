public class Employee {
int employeeId;
String employeeName;
int employeeAge;


public Employee(int employeeId, String employeeName, int employeeAge) {
	super();
	this.employeeId = employeeId;
	this.employeeName = employeeName;
	this.employeeAge = employeeAge;
}


public void display() {
    System.out.println("Employee Id : "+ employeeId 
            + "Employee Name : "+ employeeName 
            + "Employee Age " + employeeAge);
}
}

public class Source {
    public static void main(String[] args) {
    Employee employee=new Employee();
    employee.employeeId=101;
    employee.employeeName="Vidhya";
    employee.employeeAge=22;
    
    employee.display();
    }

}
