class Seco extends Thread{
	public void run() {
		for(int i=1;i<5;i++) {
		try {
			
				Thread.sleep(200);
			}
		
		catch(Exception e) {
			System.out.println(e);
		}
		System.out.println(i);}
	}
}
public class Thread_Practise_2 {

	public static void main(String[] args) {
		Seco s1 = new Seco();
		Seco s2 = new Seco();
		Seco s3 = new Seco();
		s1.start();
		try {
			
			s1.join(1000);
		}
		catch(Exception e) {
			System.out.println(e);
		}
		s2.start();
		s3.start();
		System.out.println(s1.getName());
		System.out.println(s2.getName());
		System.out.println(Thread.currentThread().getName());
		System.out.println(s3.getName());
	}

}
