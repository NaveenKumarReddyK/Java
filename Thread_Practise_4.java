class Fourth implements Runnable{
	public void run() {
		try {
			if(Thread.currentThread().isDaemon()) {
				System.out.println("this is daemon thread");
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.currentThread().getPriority());
	}
}
public class Thread_Practise_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fourth f1 = new Fourth();
		Thread tf1 = new Thread(f1);
		Fourth f2 = new Fourth();
		Thread tf2 = new Thread(f2);
		tf1.setDaemon(true);
		tf1.start();
		System.out.println(tf1.getPriority());
		System.out.println(tf1.getName());
		tf2.start();
		System.out.println(tf2.getPriority());
		System.out.println(tf2.getName());
	}

}
