import java.util.*;
public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array length:");
		int n = sc.nextInt();
		//int n=5;
		int arr[] = new int[n];
		int i=0;
		//for(i=0;i<n;i++)
		while(i<n)
		{
			arr[i] = sc.nextInt();
			i++;
		}
		int max = 0;
		max = arr[0];
		for(i=0;i<arr.length;i++) {
			if(max<arr[i]) {
			max = arr[i];
			}
		}
		System.out.println(max);

	}

}
