package Switch;
import java.util.*;
public class SwitchExample2 {

	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		int salary=600000;
		int tax=0;
		if(salary<600000) {
			tax=10;
		}else if(salary>600000 && salary<750000) {
			tax=20;
		}else if(salary>750000) {
			tax=30;
		}
		System.out.println(tax);
		int finalamt=0;
		int taxamount=0;
		switch(tax) {
		
		case 10:
			taxamount=(salary*10)/100;
			finalamt=salary-taxamount;
			System.out.println(finalamt);
			break;
		case 20:
			 taxamount=(salary*20)/100;
			finalamt=salary-taxamount;
			System.out.println(finalamt);
			break;
		case 30:
			taxamount=(salary*30)/100;
			finalamt=salary-taxamount;
			System.out.println(finalamt);
			break;
		default :
			System.out.println("No deductions");
		}
	}

}
