import java.util.*;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n = sc.nextInt();
		int r=0,temp=0,sum=0;
		temp = n;
		while(n>0) {
			r = n%10;
			n=n/10;
			sum+=r*r*r;
		}
		if(sum == temp) {
			System.out.println("This is Armstrong NUmber");
		}
		else {
			System.out.print("Not an armstrong number");
		}

	}

}
