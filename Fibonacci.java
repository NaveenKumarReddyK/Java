import java.util.*;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter the number:");
			int n = sc.nextInt();
			int k=0;
			int a=1,b=1;
			System.out.print(1+" "+1);
			while(k<n) {
				k = a+b;
				System.out.print(" "+k);
				a=b;
				b=k;
				k++;
			}
	}

}
