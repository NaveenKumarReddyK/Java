
import java.util.*;
class SoftSort {
    public static int fact(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n*fact(n-1);
        }
    }
    public static void main(String args[] ) {
            int a,b,c;
            Scanner sc = new Scanner(System.in);
            a = sc.nextInt();
            for(int i=0;i<a;i++){
                b = sc.nextInt();
                c = (3*fact(b)+3)%1000000007;
                System.out.println(c);
                c = 0;
                b = 0;
            }
    }
}
