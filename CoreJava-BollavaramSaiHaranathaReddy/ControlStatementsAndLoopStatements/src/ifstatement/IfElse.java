package ifstatement;
import java.util.*;
public class IfElse {

	public static void main(String[] args) {
		
		int a=40;
		int b=30;
		int c=1;
		if(a>b) {
			if(a>c) {
				System.out.println("a is bigger");
			}else {
				System.out.println("c is bigger");
			}
		} else if(b>a) {
			if(b>c) {
				System.out.println("b is bigger");
			}else {
				System.out.println("c is bigger");
			}
		}else {
			System.out.println("c is bigger");
		}
	}

}
