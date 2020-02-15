import java.util.*;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n = sc.nextInt();
		int r=0,s=0;
		int temp=n;
		while(n>0) {
			 r =  n%10;
			 n=n/10;
			 s=s*10+r;
			
		}
		if(s == temp) {
			System.out.println("Palindrome Number");
		}
		else {
			System.out.println("Not a Palindrome ");
		}

	}

}
