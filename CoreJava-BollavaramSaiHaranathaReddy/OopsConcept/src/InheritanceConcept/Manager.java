package InheritanceConcept;

public class Manager extends Employee {
     String dept;
     
     public Manager(String name , int age , String address,int empId,String dept) {
 		super(name,age,address,empId);
 		this.dept=dept;
 		System.out.println("Manager Constructor");
 	}
     
     public void display2(String name , int age , String address,int empId,String dept) {
 		super.display1(name, age, address,empId);
 		this.dept=dept;
 		System.out.println(name+" "+age+" "+address+" "+empId+" "+dept);
 		
 	}
}
