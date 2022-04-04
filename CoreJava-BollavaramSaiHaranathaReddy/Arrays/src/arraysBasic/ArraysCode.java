package arraysBasic;

public class ArraysCode {

	public static void main(String[] args) {
		
		String[] names=new String[5];
		names[0]="Hari";
		names[1]="Sushma";
		names[2]="Nithu";
		names[3]="Yashu";
		names[4]="Babbulu";
		
		for(String s:names) {
			System.out.println(s);
		}
		
		int[] arr=new int[5];
		arr[0]=1;
		arr[1]=2;
		arr[2]=4;
		arr[3]=5;
		arr[4]=6;
		for(int i:arr) {
			System.out.println(i);
		}
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
