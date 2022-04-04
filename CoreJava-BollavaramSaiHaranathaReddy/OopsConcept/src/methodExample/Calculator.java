package methodExample;

public class Calculator {
    public int x;
    public int y;
    
    public void sum1() {
    	System.out.println(x+y);
    }
    
    public int sum2() {
    	return x+y;
    }
    public int sum3(int a,int b) {
    	return a+b;
    }
    
   public void sum(int a,int b) {
	   System.out.println(a+b );
   }
   public void sum(int a,int b,int c) {
	   System.out.println(a+b+c);
   }
   
   public void sum(float a,int b) {
	   System.out.println(a+b);
   }
   
   public int sum4(int a,int b) {
	   return a+b;
   }
   public float sum4(float a,float b) {
	   return a+b;
   }
}
