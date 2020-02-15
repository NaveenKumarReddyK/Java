import java.util.*;

class Account{
    Scanner sc = new Scanner(System.in);
    String name;
    String ac_type;
    long ac_number;
    public void getData(){
        System.out.print("Enter your name: ");
        name = sc.next();
        System.out.print("Enter your account type: ");
        ac_type = sc.next();
        System.out.print("Enter your account number: ");
        ac_number = sc.nextLong();
    }
}
class Sav_acct extends Account{
    double s_balance,s_withdraw;
    double deposit,c_int;
    Sav_acct(){
        s_balance = 12000;
    }
    public void sav_withdraw(){
        System.out.println("Enter the amount to bedrawen: ");
        s_withdraw = sc.nextDouble();
        if(s_withdraw>0){
        s_balance = s_balance-s_withdraw;}
    }
    public void Sav_deposit(){
          System.out.print("Enter the amount to be deposited: ");
          deposit = sc.nextDouble();
           if (deposit>0){
            s_balance += deposit;}
    }
    public void compound_intrest(){
        c_int = s_balance/0.7;
        System.out.println("Your compund interest is:"+c_int);
    }
    public void updated_bal(){
        s_balance+=c_int;
         System.out.println("Your updated balance is:"+s_balance);
    }
    
}
class Cur_acct extends Account{
     double c_balance,c_withdraw;
    double c_deposit;
    int c_charge;
    Cur_acct(){
        c_balance = 14000;
        int c_charge=0;
    }
    public void curr_withdraw(){
        System.out.println("Enter the amount to be withdrawn using checkbook: ");
        c_withdraw = sc.nextDouble();
        c_balance = c_balance-c_withdraw;
        if(c_balance<4000){
            c_charge = 100;
        }
    }
    public void cur_deposit(){
        System.out.print("Enter the amount to be deposited: ");
        c_deposit = sc.nextDouble();
        c_balance = c_balance+c_deposit;
        if(c_balance<4000){
            c_charge = 100;
        }
    }
    public void cur_charge(){
    System.out.println("Your imposed penalty is :"+c_charge);
}
    public void curr_balance(){
        c_balance = c_balance-c_charge;
        System.out.println("Your updated balance is :"+c_balance);
    }
    
}
public class example_lab3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account a = new Account();
        Sav_acct sa = new Sav_acct();
        Cur_acct ca = new Cur_acct();
        a.getData();
        String ac_type = a.ac_type;
        switch(ac_type){
            case("Savings"):{
                System.out.println("We dont accept check books");
                System.our.print("Withdrwal or Deposit: ");
                
        }
    }
    
}
