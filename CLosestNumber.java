
import java.util.*;
class CLosestNumber {

	    public static void main(String args[] ) throws Exception {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        int i,j,k;
	        int arr[] = new int[n];
	        for(i=0;i<n;i++){
	            arr[i] = sc.nextInt();
	        }
	        int arrl[] = new int[n];
	        int arrp[] = new int[n];
	        for(j=0;j<n;j++){
	            arrl[j] = arr[j] - m;
	            arrp[j] = arrl[j];
	            if(arrl[j]<0){
	                arrl[j] = arrl[j]*(-1);
	            }
	            else{
	              arrl[j] =  arrl[j]*1;
	            }
	            arrp[j] = arrp[j]/arrl[j];
	        }
	         int temp = 0;
	        for(i=0;i<n;i++){
	            for(j=i+1;j<n;j++){
	                if(arrl[i]>arrl[j]){
	                    temp = arrl[i];
	                    arrl[i] = arrl[j];
	                    arrl[j] = temp;
	                }
	            }
	        }
	         for(k=0;k<5;k++){
	            System.out.print(arrl[k]*arrp[k]+m+" ");
	         }

	    }
	}
	// 10 6
	// 1 2 3 4 5 6 7 8 10