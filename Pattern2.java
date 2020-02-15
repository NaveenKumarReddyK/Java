import java.util.Scanner;

public class Pattern2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number of rows:");
		int n =  sc.nextInt();
		int i,j,k;
		for(i=n;i>0;i--) {
			for(k=0;k<n-i;k++) {
				System.out.print(" ");
			}
			for(j=0;j<i;j++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println("");
		}
		for(i=0;i<n;i++) {
			for(k=0;k<n-i-1;k++) {
				System.out.print(" ");
			}
			for(j=0;j<=i;j++) {
				System.out.print("*");
				System.out.print(" ");
			}
			System.out.println("");
		}
	}

}
