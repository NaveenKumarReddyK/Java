class Third extends Thread{
	public void run() {
		System.out.println(Thread.currentThread().getId());
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread().getName());
	}
}
public class Thread_Practise_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Third t1 = new Third();
		Third t2 = new Third();
		Third t3 = new Third();
		t1.start();
		t2.setPriority(Thread.MIN_PRIORITY);
		t2.start();
		t3.setPriority(Thread.MAX_PRIORITY);
		t3.start();
		t2.setPriority(6);
		
		t2.run();
		t3.setName("naveen");
		t3.run();
	}

}
