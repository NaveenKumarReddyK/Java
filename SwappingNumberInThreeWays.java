import java.util.*;
public class SwappingNumberInThreeWays {
	
public static void swap1(int a,int b) {
	int temp = 0;
	temp = a;
	a = b;
	b = temp;
	System.out.println("a="+a+"b="+b);
}
public static void swap2(int a,int b) {
	a = a+b;
	b = a-b;
	a = a-b;
	System.out.println("a="+a+"b="+b);
}
public static void swap3(int a,int b) {
	a = a^b;
	b = a^b;
	a = a^b;
	System.out.println("a="+a+"b="+b);
}
public static void swap4(int a,int b) {
	b = a+b-(a=b);
	System.out.println("a="+a+"b="+b);
}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		swap1(a,b);
		swap2(a,b);
		swap3(a,b);
		swap4(a,b);
	}

}
