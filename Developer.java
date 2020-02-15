import java.util.Scanner;

class Company_17BCI0108{
	 String Emp_name;
	 int Emp_id;
	 String Address;
	 String Mail_id;
	 long Mobile_no;
	 Scanner sc = new Scanner(System.in);
	 public void getDetails() {
		 System.out.print("Enter you name: ");
		 Emp_name = sc.next();
		 System.out.print("Enter you id: ");
		 Emp_id = sc.nextInt();
		 System.out.print("Enter you Address: ");
		 Address = sc.next();
		 System.out.print("Enter you Mail: ");
		 Mail_id = sc.next();
		 System.out.print("Enter you Moile number: ");
		 Mobile_no = sc.nextLong();
	 }
	 public void showDetails() {
		 System.out.println("\n");
		 System.out.println("Name is: "+Emp_name);
		 System.out.println("Id is: "+Emp_id);
		 System.out.println("Address is: "+Address);
		 System.out.println("Mail is: "+Mail_id);
		 System.out.println("Mobile number is: "+Mobile_no);
		 System.out.println("");
	 }
}


class Developer_17BCI0108 extends Company_17BCI0108{
	double BasicPay,DA,HRA,PF,StaffFund;
	double grossSalary,netSalary;
	Developer_17BCI0108(){
		BasicPay = 12000;
	}
	public void calc_Salary() {
		DA = 0.97*BasicPay;
		HRA = 0.1*BasicPay;
		PF = 0.12*BasicPay;
		StaffFund = 0.001*BasicPay;
		grossSalary = BasicPay+DA+HRA;
		netSalary = grossSalary-PF-StaffFund;
	}
	public void show_Salary() {
		System.out.println("Your gross Salary is: "+grossSalary);
		System.out.println("Your net Salary is: "+netSalary);
	}
}


class Testing_17BCI0108 extends Company_17BCI0108{
	double BasicPay,DA,HRA,PF,StaffFund;
	double grossSalary,netSalary;
	Testing_17BCI0108(){
		BasicPay = 19000;
	}
	public void calc_Salary() {
		DA = 0.97*BasicPay;
		HRA = 0.1*BasicPay;
		PF = 0.12*BasicPay;
		StaffFund = 0.001*BasicPay;
		grossSalary = BasicPay+DA+HRA;
		netSalary = grossSalary-PF-StaffFund;
	}
	public void show_Salary() {
		System.out.println("Your gross Salary is: "+grossSalary);
		System.out.println("Your net Salary is: "+netSalary);
	}
}


class Support_17BCI0108 extends Company_17BCI0108{
	double BasicPay,DA,HRA,PF,StaffFund;
	double grossSalary,netSalary;
	Support_17BCI0108(){
		BasicPay = 12000;
	}
	public void calc_Salary() {
		DA = 0.97*BasicPay;
		HRA = 0.1*BasicPay;
		PF = 0.12*BasicPay;
		StaffFund = 0.001*BasicPay;
		grossSalary = BasicPay+DA+HRA;
		netSalary = grossSalary-PF-StaffFund;
	}
	public void show_Salary() {
		System.out.println("Your gross Salary is: "+grossSalary);
		System.out.println("Your net Salary is: "+netSalary);
	}
	
}

public class Lab2_Scenario1_17BCI0108 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the designation of the employee:");
		String  n = sc.next();
		Developer_17BCI0108 dev = new Developer_17BCI0108();
		Testing_17BCI0108 ts = new Testing_17BCI0108();
		Support_17BCI0108 sp = new Support_17BCI0108();
		
		if(n.equals("Developer")) {
			dev.getDetails();
			dev.showDetails();
			dev.calc_Salary();
			dev.show_Salary();
			}
		else if( n.equals("Tester")) {
			ts.getDetails();
			ts.showDetails();
			ts.calc_Salary();
			ts.show_Salary();
		}
		else if( n.equals("Support")) {
			sp.getDetails();
			sp.showDetails();
			sp.calc_Salary();
			sp.show_Salary();
		}
		else {
			System.out.println("Enter correct designation.");
		}
	}

}
