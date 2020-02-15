
import java.util.*;
public class Exception_Handling1{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your input: ");
		String s = sc.next();
		try {
			if(s.equals("naveen")) {
				System.out.println("Correct");
			}
			int a = 50/0;
//			System.out.println(a);
		}
		catch(Exception e){
			System.out.println("Exception "+e);
		}
		finally {
			System.out.println("Code exectuted");
		}
	
	}

}
