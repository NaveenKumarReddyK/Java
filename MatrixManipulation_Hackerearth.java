
import java.util.*;
class MatrixManipulation_Hackerearth {
    public static void main(String args[] ) throws Exception {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int n = sc.nextInt();
            String arr[]= new String[n];
            String arrv[] = new String[n];
            int counth = 0;
            int countv = 0;
            for(int j=0;j<n;j++){
                    arr[j] = sc.next(); 
            }
            for(int z=0;z<arr.length;z++){
                String q = new String();
                for(int c=0;c<arr.length;c++){
                 q += arr[c].charAt(z);
                }
                arrv[z] = q;
            }
            for(int k=0;k<n/2;k++){
                
                if(arr[k].equals(arr[n-k-1])){
                    counth++;
                }
                if(arrv[k].equals(arrv[n-k-1])){
                    countv++;
                }
            }
//            for(String w:arrv) {
//            	System.out.println(w+"  ");
//            }
//          System.out.println(counth);
//            System.out.println(countv);
            if(counth==n/2 && countv!=n/2){
                System.out.println("HORIZONTAL");
            }
            else if(counth!=n/2 && countv==n/2){
                System.out.println("VERTICAL");
            }
            else if(counth==n/2 && countv==n/2){
                System.out.println("BOTH");
            }
            else{
                System.out.println("NO");
            }
        }

    }
}
