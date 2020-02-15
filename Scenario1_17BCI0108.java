import java.util.Scanner;
class Student_17BCI0108{
    public String name;
    public String regno;
    public int m1,m2,m3 ;
    public Student_17BCI0108(String name,String regno,int m1,int m2,int m3){
        this.name = name;
        this.regno = regno;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }
    double getAvg(){
        return (m1+m2+m3)/3;
    }
    int getTotal(){
        return m1+m2+m3;
    }
}
public class Scenario1_17BCI0108{
    public static void main(String[] args){
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students:");
        int n = sc.nextInt();
        Student_17BCI0108 arr[] = new Student_17BCI0108[n];
        for(int i=0;i<n;i++){
                String name = sc.next();
                String regno = sc.next();
                int m1 = sc.nextInt();
                int m2 = sc.nextInt();
                int m3 = sc.nextInt();
                arr[i]= new Student_17BCI0108(name, regno, m1, m2, m3);
                int total = arr[i].getTotal();
                double avg = arr[i].getAvg();
                if(total<50 ){
                    System.out.println("Pass with Average");
                }
                else if(avg>=50 && avg<60){
                    System.out.println("Second class");
                }
                else if(avg>=60 && avg<75){
                    System.out.println("First class");
                }
                else if(avg>75){
                    System.out.println("Distinction");
                }
                else{
                    System.out.println("Fail");
                }
               
    }
}}
