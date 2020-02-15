import java.util.*;
public class RandomClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number:");
		int n = sc.nextInt();
		Random r = new Random();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = r.nextInt(n);
		}
		for(int j:arr)
		{
			System.out.println(j);
		}

	}

}
