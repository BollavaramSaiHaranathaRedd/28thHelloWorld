package methodExample;

public class TestCalculator {

	public static void main(String[] args) {
		
		Calculator cal=new Calculator();
		cal.x=200;
		cal.y=300;
		cal.sum1();
		int result=cal.sum2();
		System.out.println(result);
		int sum=cal.sum3(20, 25);
		System.out.println(sum);
		System.out.println(cal.sum3(20, 25));
		
		cal.sum(20, 30);
		cal.sum(22.5f,40);
		cal.sum(22, 33,44);
		
		System.out.println(cal.sum4(22, 33));
		System.out.println(cal.sum4(22.5f,22.4f));
		

	}

}
