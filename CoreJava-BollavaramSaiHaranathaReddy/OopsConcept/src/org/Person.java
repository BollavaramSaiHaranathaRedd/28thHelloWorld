package org;

public class Person {

	public String name ;
	public int age;
	public String address;
	
	public Person() {
		
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}

	public void setAge(int age) {
		this.age=age;
	}
	
	public int getAge() {
		return this.age;
	}

	public void setAddress(String address) {
		this.address=address;
	}
	
	public String getAddress() {
		return this.address;
	}

}
