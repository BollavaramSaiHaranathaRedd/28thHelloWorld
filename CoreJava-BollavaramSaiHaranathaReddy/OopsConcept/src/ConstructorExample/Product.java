package ConstructorExample;

public class Product {

	public String name;
	public String brand;
	public int price;
	public int quantity;
	
	public Product() {
		System.out.println("Person Constructor");
	}
	
	public Product(String name,String brand,int price,int quantity) {
		this.name=name;
		this.brand=brand;
		this.price=price;
		this.quantity=quantity;
		System.out.println(this.name+" "+this.brand+" "+this.price+" "+this.quantity);
	}
	
	public Product(String name ,String brand) {
		this.name=name;
		this.brand=brand;
		System.out.println(this.name+" "+this.brand);
	}
	
	
}
