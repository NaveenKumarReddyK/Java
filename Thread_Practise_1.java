import java.util.*;
class First_One implements Runnable{
	public void run() {
		System.out.println("First thread");
	}
}
public class Thread_Practise_1 extends Thread{
	public void run() {
		System.out.println("This main thread is running");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_Practise_1 t = new Thread_Practise_1();
		First_One f = new First_One();
		Thread t1 = new Thread(f);
		t1.start();
		t.start();
		
	}

}
