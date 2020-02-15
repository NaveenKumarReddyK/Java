
import java.util.*;
import java.lang.Math;

/**
 *
 * @author Naveen Reddy
 */
@SuppressWarnings("unused")
class Events {
	int value;
    int countE1=0;
    int countE2=0;
    int countE3=0;
    int countE4=0;
    int countE5=0;
    
    public void eventCounter() {
    	synchronized (this) {
    	if(value == 0) {
    		countE1++;
    	}
    	else if(value == 1) {
    		countE2++;
    	}
    	else if(value == 2) {
    		countE3++;
    	}
    	else if(value == 3) {
    		countE4++;
    	}
    	else if(value == 4) {
    		countE5++;
    	}}
    }
   public void getCount() {
	   System.out.println("Count for event-1 is "+countE1);
	   System.out.println("Count for event-2 is "+countE2);
	   System.out.println("Count for event-3 is "+countE3);
	   System.out.println("Count for event-4 is "+countE4);
	   System.out.println("Count for event-5 is "+countE5);
   }
    
}
public class Gravitas_LabExercise  {
    public static void main(String[] args){
    	Events e = new Events();
    	
   //   ----------- first event gravitas thread------------
        Thread thread_E1 = new Thread(new Runnable() {
        	@Override
        	public void run() {
              for(int i=0;i<1000;i++){
              int r = (int)(1000 * Math.random());

              e.value = r%5;
              e.eventCounter();


          }

        	}}
        );
        //   ----------- second event gravitas thread------------
        Thread thread_E2 = new Thread(new Runnable() {
        	@Override
        	public void run() {
        		   for(int i=0;i<1000;i++){
        	              int r = (int)(1000 * Math.random());
        	              e.value = r%5;
        	              e.eventCounter();

        	          }

        	}}
        );
        //   ----------- third event gravitas thread------------
        Thread thread_E3 = new Thread(new Runnable() {
        	@Override
        	public void run() {
        		   for(int i=0;i<1000;i++){
        	              int r = (int)(1000 * Math.random());
        	              e.value = r%5;
        	              e.eventCounter();

        	          }

        	}}
        );
        //   ----------- fourth event gravitas thread------------
        Thread thread_E4 = new Thread(new Runnable() {
        	@Override
        	public void run() {
        		   for(int i=0;i<1000;i++){
        	              int r = (int)(1000 * Math.random());
        	              e.value = r%5;
        	              e.eventCounter();

        	          }

        	}}
        );
        //   ----------- fifth event gravitas thread------------
        Thread thread_E5 = new Thread(new Runnable() {
        	@Override
        	public void run() {
        		   for(int i=0;i<1000;i++){
        	              int r = (int)(1000 * Math.random());
        	              e.value = r%5;
        	              e.eventCounter();

        	          }

        	}}
        );
        //   ----------- sixth event total count display thread------------
        Thread thread_E6 = new Thread(new Runnable() {
        	@Override
        	public void run() {
        		 e.getCount();
        	}}
        );
        thread_E1.start();
        thread_E2.start();
        thread_E3.start();
        thread_E4.start();
        thread_E5.start();
        thread_E6.start();
        
        try{
        	thread_E1.join();
        	thread_E2.join();
        	thread_E3.join();
        	thread_E4.join();
        	thread_E5.join();
        	thread_E6.join();
        }
        catch(Exception x) {
        	System.out.println("Error "+ x.getMessage());
        }
   
        
}
}