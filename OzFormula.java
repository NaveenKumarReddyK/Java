
import java.util.*;
class OzFormula {
    public static void main(String args[] ) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i,j,k;
        int arr[] = new int[n];
        for(i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        for(j=2;j<100;j++){
            int count = 0;
            for(k=0;k<arr.length-1;k++){
            if(arr[k]%j == arr[k+1]%j){
                count++;
            }
            int sum = 0;
            sum = count/arr.length;
            if(sum == 1){
                System.out.print(j+" ");
            }
        }

    }
}}
class TestClass
{
public static void printFactors(int diff)
{
int i=2;

while(i<=diff)
{
if(diff%i==0)
System.out.print(i +" ");

i++;
}

if(diff==1)
System.out.println("1");
}

public static void main(String args[])
{
Scanner sc=new Scanner(System.in);

int m=sc.nextInt();

int[] a=new int[m];

for(int i=0; i<m; i++)
a[i]=sc.nextInt();

int size=m*(m-1)/2;

int[] diff=new int[size];
int h=0;

for(int i=0; i<m-1; i++)
{
for(int j=i+1; j<m; j++)
{
diff[h]=Math.abs(a[i]-a[j]);
h++;
}
}

Arrays.sort(diff);

int min=diff[0];

printFactors(min);
}
}