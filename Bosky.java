import java.util.*;
class Bosky {
    public static void main(String args[] ) throws Exception {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int i,j;
            for(i=0;i<n;i++){
                int N = sc.nextInt();
                int D = sc.nextInt();
                int R = sc.nextInt();
               float T = (float) N/D;
                System.out.println(T);
                // int  M = Math.pow(10,R-1);
                int X = (int)(Math.abs(T)*Math.pow(10,R))%10;
                
                //int K = (int) T;
              //X = X%10;
                
                System.out.println(X);
            }
    }
}