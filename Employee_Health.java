
import java.util.*;
//Naveen Reddy
class Account_17BCI0108{
    Scanner sc = new Scanner(System.in);
    String name;
    String ac_type;
    long ac_number;
    double balance;
    Account_17BCI0108(){
    	balance = 12000;
    }
    public void getData(){
        System.out.print("Enter your name: ");
        name = sc.next();
        System.out.print("Enter your account number: ");
        ac_number = sc.nextLong();
        System.out.print("Enter your account type: ");
        ac_type = sc.next();
    }
}
class Sav_acct_17BCI0108 extends Account_17BCI0108{
    double s_withdraw;
    double deposit,c_int;
    public void Sav_withdraw(){
        System.out.println("Enter the amount to be drawn: ");
        s_withdraw = sc.nextDouble();
        if(s_withdraw>0){
        balance = balance-s_withdraw;}
        else if(s_withdraw>balance) {
        	System.out.println("You dont have that much money in your account");
        }
        else {
        	System.out.println("Enter amount greater than zero");
        }
    }
    public void Sav_deposit(){
          System.out.print("Enter the amount to be deposited: ");
          deposit = sc.nextDouble();
           if (deposit>0){
            balance += deposit;}
    }
    public void compound_intrest(){
        c_int = balance*0.7;
        System.out.println("Your compund interest is:"+c_int);
    }
    public void updated_bal(){
        balance+=c_int;
         System.out.println("Your updated balance is:"+balance);
    }
    
}
class Cur_acct_17BCI0108 extends Account_17BCI0108{
     double c_withdraw;
    double c_deposit;
    int c_charge = 0;
    public void curr_withdraw(){
        System.out.println("Enter the amount to be withdrawn using checkbook: ");
        c_withdraw = sc.nextDouble();
        balance = balance-c_withdraw;
        if(balance<4000){
            c_charge = 100;
        }
    }
    public void curr_deposit(){
        System.out.print("Enter the amount to be deposited: ");
        c_deposit = sc.nextDouble();
        balance = balance+c_deposit;
        if(balance<4000){
            c_charge = 100;
        }
    }
    public void curr_charge(){
    System.out.println("Your imposed penalty is :"+c_charge);
}
    public void curr_balance(){
        balance = balance-c_charge;
        System.out.println("Your updated balance is :"+balance);
    }
    
}
public class Employee_Health_17BCI0108 {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        Sav_acct_17BCI0108 sa = new Sav_acct_17BCI0108();
        Cur_acct_17BCI0108 ca = new Cur_acct_17BCI0108();
        sa.getData();// or we can use ca
        String ac_type = sa.ac_type;
        switch(ac_type){
//       ------------------  savings account  ------------------
            case("Savings"):{
            	System.out.println("Your current is balance is "+sa.balance);
                System.out.println("We don't accept check books");
                System.out.print("Withdrwal or Deposit: ");
                String Sav_option = sc.next();
                
                switch(Sav_option) {
                case("Withdrawl"):{
                	sa.Sav_withdraw();
                	break;
                }
                case("Deposit"):{
                	sa.Sav_deposit();
                	break;
                }
                default:{
                	System.out.println("You entered wrong option");
                }
                }
                sa.compound_intrest();
                sa.updated_bal();
                break;
            }
//       ------------------  current account  ------------------
            case("Current"):{
            	System.out.println("Your current is balance is "+ca.balance);
                System.out.println("You should maintian minimum balnace");
                System.out.println("We charge 100 Rupees in balance is less than 4000 Rupees");
                System.out.print("Withdrwal or Deposit: ");
                String Cur_option = sc.next();
                
                switch(Cur_option) {
                case("Withdrawl"):{
                	ca.curr_withdraw();
                	break;
                }
                case("Deposit"):{
                	ca.curr_deposit();
                	break;
                }
                default:{
                	System.out.println("You entered wrong option");
                }
                }
                ca.curr_charge();
                ca.curr_balance();
                break;
            }
                
            // default
            default:{
            	System.out.println("Enter correct account type");
                
        }
    }
    
}}
