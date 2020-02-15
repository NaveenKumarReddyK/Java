
import java.util.*;
class Big_P {
public static long min(long a){
    String min = Long.toString(a);
    min.replace('6','5');
    long x = Long.parseLong(min);
    return x;
}
public static long max(long b){
    String max = Long.toString(b);
    max.replace('5','6');
    long y = Long.parseLong(max);
    return y;
}

    public static void main(String args[] ) throws Exception {
       Scanner sc = new Scanner(System.in);
       long a = sc.nextInt();
       long b = sc.nextInt();
       long min = min(a)+min(b);
       long max = max(a)+max(b);
       System.out.print(min+" "+max);
    }
}
