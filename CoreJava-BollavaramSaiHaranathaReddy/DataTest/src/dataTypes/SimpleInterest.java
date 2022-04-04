package dataTypes;
import java.util.*;
public class SimpleInterest {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double sp;
		double pamt=sc.nextDouble();
		double time=sc.nextDouble();
		double roi=sc.nextDouble();
		sp=(pamt*time*roi)/100;
		System.out.println(sp);
		
		
		
	}

}
