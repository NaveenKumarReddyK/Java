//import java.util.*;
//import java.io.*;
//class First{
//	void frun() {
//		System.out.println("Error occured");
//	}
//}
//public class Exception_Handling_Method_Overriding extends First{
// void frun() throws ArithmeticException{
//	System.out.println("Second error");
//}
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		
//		Exception_Handling_Method_Overriding f = new Exception_Handling_Method_Overriding();
//		f.frun();
//	}
//
//}

//import java.util.*;
import java.io.*;
class First{
	void frun() throws Exception{
		System.out.println("Error occured");
	}
}
public class Exception_Handling_Method_Overriding extends First{
 void frun() throws Exception{
	System.out.println("Second error");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Exception_Handling_Method_Overriding f = new Exception_Handling_Method_Overriding();
		try {
			f.frun();
		}
		catch(Exception e) {
			System.out.println("Fianl error");
		}
	}

}

