package Loops;

public class DiamondProgram {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=(n-i);j++) {
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print(" *");
			}
			for(int l=2;l<=i;l++) {
				System.out.print(" *");
			}
			
			System.out.println();
		}
		int l=n;
		for(int i=1;i<=5;i++) {
			for(int k=1;k<=i;k++) {
				System.out.print("  ");
			}
			for(int j=1;j<=(n-i);j++) {
				System.out.print(" *");
			}
			
			for(l=(n-i);l>=2;l--) {
				System.out.print(" *");
			}
			l--;
			
			System.out.println();
		}

	}

}
