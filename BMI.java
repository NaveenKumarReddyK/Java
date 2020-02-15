import java.util.*;
//import java.io.*;
//import java.lang.*;
interface BMI_17BCI0108{
    public double Calculate_BMI();
}
class Employee_Health_17BCI0108 implements BMI_17BCI0108{
    Scanner sc = new Scanner(System.in);
    String name;
    int age;
    double height;
    double weight;
    boolean diabetic;
    double bmi = 0;
    public void Input(){
        System.out.print("Name :");
        name = sc.next();
        System.out.print("Age :");
        age = sc.nextInt();
        System.out.print("Height :");
        height = sc.nextDouble();
        System.out.print("Weight :");
        weight = sc.nextDouble();
        System.out.print("Do you have diabeties:");
        diabetic = sc.nextBoolean();
    }
    @Override
    public double Calculate_BMI(){
        bmi = weight/(height*height);
        return bmi;
    }
    
    public void Fittest(){
        if(bmi>18.5 && bmi<25 && diabetic == false){
          
            System.out.println("Employee details with no diabieties is :");
            System.out.println("Name :"+name);
            System.out.println("Age :"+age);
            System.out.println("Height :"+height);
            System.out.println("Weight :"+weight);
            System.out.println("BMI is :"+bmi);
            
        }
        else{
            System.out.println("Person is not fittest.");
            System.out.println("BMI is :"+bmi);
        }}
    public void Validate(){
            
            if(height<0 || height>7.5){
               throw new ArithmeticException("Height is not valid");

            }
            else if(weight<35 || weight>125){
                throw new ArrayIndexOutOfBoundsException("Weight is invlaid");

            }
            else{
                Calculate_BMI();
                Fittest();
            }
            
        
    }
}
class Employee_Health_Main_17BCI0108{
    public static void main(String[] args){
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int num = sc.nextInt();
        Employee_Health_17BCI0108[] eh = new Employee_Health_17BCI0108[num];
        for(int i=0;i<num;i++) {
        	System.out.println("---------Enter details of employee "+(i+1)+" -------------");
        	eh[i] = new Employee_Health_17BCI0108();
        	eh[i].Input();
        	
            
        }
        for(int j=0;j<num;j++) {
        	System.out.println("-----------Result of employee "+(j+1)+" --------------");
        	eh[j].Validate();
        }
      
        
    }
}
