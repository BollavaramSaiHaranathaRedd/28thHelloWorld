package dataTypes;

public class Operations {
      
	    public static void main(String[] args) {
			int n=20;
			int m=50;
			long k=256l;
			float f=22.345f;
			double d=2000.345667;
			
			//narrowing
			int z=n+m+(int)k;
			float r=f+(float)d;
			System.out.println(z);
			System.out.println(r);
			
			//Widening 
			
			long l=m+n;
			System.out.println(l);
			
			double b=d+f;
			System.out.println(b);
			
			
		}
}
