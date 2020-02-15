
import java.util.*;
import Temperature.*;
import Distance_Time_converter.*;
public class Lab2_Scenario3_17BCI0108  {

    
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        Temperature tempr = new Temperature();
        Distance_Time_converter dtc = new Distance_Time_converter();
        System.out.print("Enter the type which you want to convert: ");
        String type = sc.next();
        if(type.equals("Temperature")){
            System.out.print("Enter the type of temperature: ");
            String temp_type = sc.next();
            switch (temp_type) {
                case "cs_to_fh":
                    {
                        System.out.print("Enter temperature in Celsuis: ");
                        double celsius = sc.nextDouble();
                        tempr.cs_to_fh(celsius);
                        break;
                    }
                case "fh_to_cs":
                    {
                        System.out.print("Enter temperature in Fahrenheit: ");
                        double celsius = sc.nextDouble();
                        tempr.fh_to_cs(celsius);
                        break;
                    }
                default:
                    System.out.println("double values are only accepted");
                    break;
            }
        }
        //distance converter
        
        else if(type.equals("Distance_Time")){
            System.out.print("Enter the type of value to be converted: ");
            String dt_type = sc.next();
            switch (dt_type) {
                case "Distance":
                    {
                        System.out.print("Enter Distance type: ");
                        String dtype = sc.next();
                        switch (dtype){
                        case "m_to_cm":
                        {
                        System.out.print("Enter Distance in meter: ");
                        double dmeter = sc.nextDouble();
                        dtc.m_to_cm(dmeter);
                        break;
                        }
                        case "cm_to_m":
                        {
                        System.out.print("Enter Distance in centimeter: ");
                        double dcentimeter = sc.nextDouble();
                        dtc.cm_to_m(dcentimeter);
                        break;
                        }
                        default:
                        {
                        System.out.println("double values are only accepted");
                        break;
                        }
                    }
                        break;
                    }
                        
                case "Time":
                    {
                        System.out.print("Enter Time type: ");
                        String ttype = sc.next();
                        switch (ttype){
                        case "min_to_h":{
                        System.out.print("Enter Time in minutes: ");
                        double tmin = sc.nextDouble();
                        dtc.min_to_h(tmin);
                        break;
                            }
                            
                        case "h_to_min":{
                        System.out.print("Enter Time in hours: ");
                        double thr = sc.nextDouble();
                        dtc.h_to_min(thr);
                        break;
                            }
                        default:{
                        System.out.println("Only double values of time is accepted");
                        break;
                        }
                        }
                        break;
                    }
                default:
                    System.out.println("double values are only accepted");
                    break;
            }
        }

    
    }   
}
