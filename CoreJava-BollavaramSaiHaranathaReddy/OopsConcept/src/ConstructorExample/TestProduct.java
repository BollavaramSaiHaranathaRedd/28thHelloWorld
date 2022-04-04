package ConstructorExample;

public class TestProduct {
  public static void main(String[] args) {
	
	  Product p1=new Product();
	  p1.name="S-20";
	  p1.brand="Samsung";
	  p1.price=20000;
	  p1.quantity=5;
	  
	  Product p2=new Product("A-33","Samsung",21000,6);
	  Product p3=new Product("Poco","RealMe",40000,3);
	  
	  Product p4=new Product("Note-5","Redmi");
	  
	  
	 
}
}
