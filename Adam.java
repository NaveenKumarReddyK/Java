
//HACKEREARTH sucessful
import java.util.*;
class Adam {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,M;
        for(M=0;M<n;M++){
            int k = sc.nextInt();
            int arr[] = new int[k];
            for(j=0;j<k;j++){
                arr[j] = sc.nextInt();
            }
            ArrayList<Integer> arrs = new ArrayList<Integer>();
            for(i=0;i<k-1;i++){
                 int sum = 0;
                for(j=i+1;j<k;j++){
                    sum = sum+arr[j];
                }
                sum+=arr[i];
                arrs.add(sum);
            }
            Collections.sort(arrs);
        int diff = 0;
      
        int l = arrs.size();
        diff = arrs.get(l-1)-arrs.get(0);
        System.out.println(diff);
    }
}
}