
import java.util.*;
class  NavisProblem  {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i=0;
        while(i<n){
            int m = sc.nextInt();
            int arr[] = new int[m];
            ArrayList<Integer> arrs = new ArrayList<Integer>();
            for(int j=0;j<m;j++){
                arr[j] = sc.nextInt();
            }
            for(int l=0;l<arr.length-1;l++){
                for(int j=l+1;j<arr.length;j++){
                    if(arr[l]<arr[j]){
                        arr[l] = arr[l]+arr[j];
                        arr[j] =  arr[l]-arr[j];
                        arr[l] = arr[l]-arr[j];
                    }
                }
            }
            int sum = 0,mul = 1;
            for(int k=0;k<arr.length;k++){
                sum = sum+arr[k];
                mul=mul*arr[k];
                int temp = 0;
                temp = mul/sum;
                temp = temp%1000000007;
                arrs.add(temp);
            }
            i++;
            for(int w:arr) {
            	System.out.print(w+" ");
            }
            System.out.println(i);
            System.out.println("Case #"+(i)+": "+arrs.get(1));
        }
 
    }
}
