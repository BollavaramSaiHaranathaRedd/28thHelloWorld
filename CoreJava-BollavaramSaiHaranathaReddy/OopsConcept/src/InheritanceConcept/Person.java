package InheritanceConcept;

public class Person {

	public String name ;
	public int age;
	public String address;
	
	public Person(String name , int age,String address) {
		System.out.println("Person Constructor");
	}
	public void display(String name,int age,String address) {
		System.out.println(name+" "+age+" "+address);
	}

}
