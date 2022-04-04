package InheritanceConcept;

public class Employee extends Person {

	int empId;
	
	public Employee(String name , int age , String address,int empId) {
		super(name,age,address);
		this.empId=empId;
		System.out.println("Employee Constructor");
	}
	public void display1(String name , int age , String address,int empId) {
		super.display(name, age, address);
		this.empId=empId;
		System.out.println(name+" "+age+" "+address+" "+empId);
		
	}
}
