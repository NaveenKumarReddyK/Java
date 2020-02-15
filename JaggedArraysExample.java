import java.util.*;
public class JaggedArraysExample {

	public static void main(String[] args) {
		//Variable column sizes
				int arr[][] = {{1,3},{4,5,6,6,7},{3,4,2}};
				for(int i[]:arr)
				{
					for(int j:i) {
						System.out.print(j);
						
					}
					System.out.println("");
				}

	}

}
