
import java.util.*;

class  OddDivisorCount {
	
  
    
    
    public static int divisorCount(long n){
        long count = 0;
        int sum = 0;
        for(long i=1;i<=n;i++){
            if(n%i == 0){
                count++;
            }
        }
        if(count%2 == 1){
            sum = 1;}
        else{
            sum = 0;
        }
        return sum;
    }
    
    public static void getDivisors(long a,long b){
        long flag = 0;
        for(long i=a;i<=b;i++){
            flag+=divisorCount(i);
        }
        System.out.println(flag);
    }
    
    public static void main(String args[] ) throws Exception {
       @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
       long n = sc.nextInt();
       for(int i=0;i<n;i++){
           long m = sc.nextLong();
           long  r = sc.nextLong();
           getDivisors(m,r);
       }
   
    
    }
}
