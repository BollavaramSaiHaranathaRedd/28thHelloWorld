package AbstarctionAndPolymorphism;

public class TestJava {
    public static void main(String[] args) {
		
    	Person p=new Employee();
    	p.doSomething();
    	
    	Person p1=new Student();
    	p1.doSomething();
    	
    	Person p2=new HouseWife();
    	p2.doSomething();
    	
    	
    	
	}
}
