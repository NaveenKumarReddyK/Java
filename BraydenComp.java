import java.util.*;
class BraydenComp {
    public static void main(String args[] ) throws Exception {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int i,j,k;
            for(i=0;i<n;i++){
                int N = sc.nextInt();
                int Q = sc.nextInt();
                int arr[] = new int[N];
                for(j=0;j<N;j++){
                    arr[j] = sc.nextInt();
                }
                for(k=0;k<Q;k++){
                    int K = sc.nextInt();
                    int L = sc.nextInt();
                    int R = sc.nextInt();
                    for(int a=0;a<arr.length;a++){
                            int min = 0;
                            int max = 0;
                        //     if(L == R){
                        //         System.out.println("0");
                        //     }
                        if(arr[a] == L){
                            min = a;
                             //System.out.println(min);
                        }
                        if(arr[a] == R){
                            max = a;
                             //System.out.println(max);
                        }
                        for(int x = min;x<max;x++){
                            if(K == 0){
                                int count =0;
                                if(arr[x]%2 == 0){
                                    count++;
                                }
                                int diff = 0;
                                diff = max-min+1;
                                System.out.println(count+" "+diff);
                            }
                            else {
                                        int count =0;
                                if(arr[x]%2 == 1){
                                    count++;
                                }
                                int diff = 0;
                                diff = max-min+1;
                                System.out.println(count+" "+diff);
                            }
                        }
                    }
                }
            }

    }
}
