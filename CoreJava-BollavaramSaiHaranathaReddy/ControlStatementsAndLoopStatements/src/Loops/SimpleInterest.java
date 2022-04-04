package Loops;
import java.util.*;
public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int pamt=sc.nextInt();
		int rate=sc.nextInt();
		int time=sc.nextInt();
		int simpleInt;
		simpleInt=(pamt*rate*time)/100;
		System.out.println(simpleInt);
		while(simpleInt<100000) {
			time++;
			simpleInt=(pamt*rate*time)/100;
		
		}
		System.out.println(time);
	}
}
