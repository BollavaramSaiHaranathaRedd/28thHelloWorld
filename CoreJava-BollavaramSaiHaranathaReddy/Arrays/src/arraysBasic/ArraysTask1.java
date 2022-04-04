package arraysBasic;
import java.util.*;

public class ArraysTask1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt()*2;
			
		}
		
		for(int i:arr) {
			System.out.println(i);
		}

	}

}
