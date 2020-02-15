import java.util.*;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer> arr_odd = new ArrayList<Integer>();
		ArrayList<Integer> arr_even = new ArrayList<Integer>();
		System.out.print("Enter the length of aray:");
		int n =sc.nextInt();
		int arr[] = new int[n];
		int i,j;
		for(i=0;i<n;i++) {
			arr[i] = sc.nextInt();
		}
		for(j=0;j<arr.length;j++) {
			if(arr[j]%2 == 0) {
				arr_even.add(arr[j]);
			}
			else if(arr[j]%2 == 1) {
				arr_odd.add(arr[j]);
			}
			else {
				System.out.print("Erroe");
			}
		}
		System.out.print("Even array is:");
		for(int c:arr_even) {
			System.out.print(c);
			System.out.print(" ");
		}
		System.out.println("");
		System.out.print("Odd array is:");
		for(int d:arr_odd) {
			System.out.print(d);
			System.out.print(" ");
		}

	}

}
