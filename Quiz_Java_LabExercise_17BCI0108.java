
import java.util.*;

/**
 *
 * @author Naveen Reddy
 */
class Quiz_17BCI0108 {
    String[][] arr = {{"Q1 Op-1","Q1 Op-2","Q1 Op-3","Q1 Op-4"},
        {"Q2 Op-1","Q2 Op-2","Q3 Op-3","Q4 Op-4"},
        {"Q3 Op-1","Q3 Op-2","Q3 Op-3","Q3 Op-4"},
                {"Q4 Op-1","Q4 Op-2","Q4 Op-3","Q4 Op-4"}};
    
    Scanner sc = new Scanner(System.in);
    Character[] urr = new Character[4];
    
public void examThread_17BCI0108() {
    new Thread(new Runnable() {
    public synchronized void run(){
        for(int i=0;i<4;i++){
             System.out.println("This is Question "+ (i+1));
            for(int j=0;j<4;j++){
               
                System.out.println(arr[i][j]);
            }
             System.out.println("Your answer for question "+ (i+1));
                 try{
               wait(2000);

            }
            catch(Exception e){
            System.out.println("Error occured in exam thread");
        }
                 notify();

        }
    }}).start();
}

public void userThread_17BCI0108() {
new Thread(new Runnable() {
    public synchronized void run(){
        for(int k=0;k<4;k++){
//            urr[k] = sc.next().charAt(0);
        	System.out.println("Answer -"+(k+1));
            
            try{
               Thread.sleep(2000);
               notify();
               
            }
            catch(Exception e){
                System.out.println("Exception occured at User thread");
            }
        if(k == 4) {
        	for(Character c: urr) {
        		System.out.println(c);
        	}
        }
    }
}
}).start();
}
    }
public class Quiz_Java_LabExercise_17BCI0108 {
    public static void main(String[] args){
        Quiz_17BCI0108 q = new Quiz_17BCI0108();
        q.examThread_17BCI0108();
        q.userThread_17BCI0108();
        
    }
}
