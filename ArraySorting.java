import java.util.Scanner;
public class ArraySorting {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array length:");
		int n = sc.nextInt();
		//int n=5;
		int arr[] = new int[n];
		int i=0,j,temp=0;
		//for(i=0;i<n;i++)
		while(i<n)
		{
			arr[i] = sc.nextInt();
			i++;
		}
		for(i=0;i<arr.length;i++) {
		for(j=1;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		}
		for(int crr: arr) {//enhanced for loop
			System.out.println(crr);
		}

	}

}
