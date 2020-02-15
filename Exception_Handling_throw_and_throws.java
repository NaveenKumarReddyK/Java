import java.util.*;
import java.io.*;
class M{
	public void mrun1() throws IOException{
		throw new IOException("First error");
	}
	void mrun2() throws IOException{
		mrun1();
	}
	void mrun3() {
		try {
			mrun2();
		}
		catch(Exception e) {
			System.out.println("Second error");
		}
	}
}
public class Exception_Handling_throw_and_throws {
// public static void caluculate(int a) {
//	 if(a<0) {
//		 throw new ArithmeticException("Not valid");
//	 }
//	 else {
//		 System.out.println("COrrect");
//	 }
// }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		M m = new M();
		m.mrun3();
		
	}

}
