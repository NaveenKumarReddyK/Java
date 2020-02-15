
import java.util.*;

class BowlerFound {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int i,k=0,a=0;
        String arr[] = new String[7];
        arr[0] = "Rohit";
        arr[1] = "Dhawan";
        arr[2] = "Kohli";
        arr[3] = "Yuvraj";
        arr[4] = "Raina";
        arr[5] = "Dhoni";
        arr[6] = "Sir Jadeja"; 
        for(i=0;i<n;i++){
            k=sc.nextInt();
        if(k<=7 && k>=1){
            a = k-1;
            //System.out.print(arr[a]);
        }
        else //if(k>7)
        {
         
            a = k-7;
            if(a<=14){
            a = a/2-1;
            //System.out.print(arr[a]);
            }
            else //if(a>14)
            {
            //a = k-(k/7)*7;
            	a = k%7;
            a = a/2;
            a = a-1;
            //System.out.print(arr[a]);}
        }
           
        
        }
        System.out.println(arr[a]);
    }
}}