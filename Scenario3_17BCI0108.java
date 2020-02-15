/**
 *
 * @author 17BCI0108
 */
import java.util.*;
class Person_17BCI0108{
    String name;
    int age;
    double height;
    double weight;
    String blood;
    Person_17BCI0108(String name,int age,double height,double weight,String blood){
        this.name = name;
        this.age = age;
        this.height = height;
        this.blood = blood;
    }
    double idealweigth(){
        if(height>5){
        double d = 50+1.9*((height-5)/0.12);
        return d;}
        else{
            double d = 50;
        return d;
        }
    }
}
public class Scenario3_17BCI0108{
    public static void main(String[] args){
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of persons:");
        int n = sc.nextInt();
        Person_17BCI0108 p[] = new Person_17BCI0108[n];
        for(int i=0;i<n;i++){
        	System.out.print("Enter you name: ");
                String name = sc.next();
                System.out.print("Enter you age: ");
                int age = sc.nextInt();
                System.out.print("Enter your height: ");
                double height = sc.nextDouble();
                System.out.print("Enter you weight: ");
                double weight = sc.nextDouble();
                System.out.print("Enter you blood type: ");
                String blood = sc.next();
                p[i] = new Person_17BCI0108(name,age,height,weight,blood);
                double w = p[i].idealweigth();
                System.out.println("Your weight should be:"+w);
                if(weight<w){
                    double x = w-weight;
                    System.out.println("You should gain:"+x+"kgs");
                }
                else{
                    double x = weight-w;
                    System.out.println("You should loose:"+x+"kgs");
                }
                String G= new String();
                String R =new String();
                
                switch(blood){
                        
                    case "A+" :
                        G= "A+,AB+";
                        R = "A+,A-,O+,O-";
                        break;
                    case "O+" :
                        G = "0+,AB+,B+,A+";
                        R = "O+,O-";
                        break;
                    case "B+" :
                        G = "B+,AB+";
                        R = "O+,O-";
                        break;
                    case "AB+" :
                        G = "AB+";
                        R = "everyone";
                        break;
                    case "A-" :
                        G = "A+,A-,AB+,AB-";
                        R = "A+,O";
                        break;
                    case "O-" :
                        G = "everyone";
                        R = "O-";
                        break;
                    case "B-" :
                        G = "B+,B-,AB+,AB-";
                        R = "O-";
                        break;
                    case "AB-" :
                        G = "AB+,AB-";
                        R = "A-,AB-,B-,O-";
                        break;
                    default:
                        System.out.println("Wrong blood type");
                
                }
                System.out.println("You can give blood to "+G+" and can receive blood from "+R);
            
        }
}}
