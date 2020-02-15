import java.util.*;
public class EnhancedFroLoopIn2DArray {

	public static void main(String[] args) {
		//int arr[][] = new int[3][3];
		int arr[][] = {{1,2,3},{4,5,6},{3,4,2}};
		for(int i[]:arr)
		{
			for(int j:i) {
				System.out.println(j);
			}
		}

	}

}
