import java.util.*;

interface  creditCardApp {
	void getPersonalDetails();
	void perYearIncome();
	void eligibility();
	void printDetails();
}

class ICICI implements creditCardApp{
	Scanner sc = new Scanner(System.in);
	String name;
	long mobile;
	String address;
	String nominee;
	int age;
	String mail;
	double grossSalary;
	double netSalaryPerMonth;
	double incomePerYear;
	int EligibilityScore;
	double EMI;
	public void getPersonalDetails() {
		System.out.print("Enter your name: ");
		name = sc.next();
		System.out.print("Enter your mobile number: ");
		mobile = sc.nextLong();
		System.out.print("Enter your address: ");
		address = sc.next();
		System.out.print("Enter your nominee: ");
		nominee = sc.next();
		System.out.print("Enter your age: ");
		age = sc.nextInt();
		System.out.print("Enter your email: ");
		mail = sc.next();
	}
	public void perYearIncome() {
		
		System.out.print("Enter you Gross Salary: ");
		grossSalary = sc.nextDouble();
		netSalaryPerMonth = grossSalary-(grossSalary*0.2);
		incomePerYear = netSalaryPerMonth*12;
	}
	public void eligibility() {

		System.out.print("Enter you EMI: ");
		EMI = sc.nextDouble();
		if(EMI == 0) {
			EligibilityScore = 3;
		}
		else if(EMI<(0.2*incomePerYear)) {
			EligibilityScore = 2;
		}
		else if(EMI<(0.4*incomePerYear)) {
			EligibilityScore = 1;
		}
		else if(EMI<(0.6*incomePerYear)) {
			EligibilityScore = 0;
		}
		else {
			System.out.print("Error");
		}
	}
	public void printDetails() {
		System.out.println("----------ICICI BANK DETAILS----------");
		System.out.println("Your name is: "+name);
		System.out.println("Your number is: "+mobile);
		System.out.println("Your address is: "+address);
		System.out.println("Your nominee is: "+nominee);
		System.out.println("Your age is: "+age);
		System.out.println("Your email is: "+mail);
		System.out.println("Your grossSalary is: "+grossSalary);
		System.out.println("Your netSalaryPerMonth is: "+netSalaryPerMonth);
		System.out.println("Your incomePerYear is: "+incomePerYear);
		System.out.println("Your EMI is: "+EMI);
		System.out.println("Your EligibilityScore is: "+EligibilityScore);
		
	}
}



class HDFC implements creditCardApp{
	Scanner sc = new Scanner(System.in);
	String name;
	long mobile;
	String address;
	String nominee;
	int age;
	String mail;
	double grossSalary;
	double netSalaryPerMonth;
	double incomePerYear;
	int EligibilityScore;
	double EMI;
	public void getPersonalDetails() {
		System.out.print("Enter your name: ");
		name = sc.next();
		System.out.print("Enter your mobile number: ");
		mobile = sc.nextLong();
		System.out.print("Enter your address: ");
		address = sc.next();
		System.out.print("Enter your nominee: ");
		nominee = sc.next();
		System.out.print("Enter your age: ");
		age = sc.nextInt();
		System.out.print("Enter your email: ");
		mail = sc.next();
	}
	public void perYearIncome() {
		
		System.out.print("Enter you Gross Salary: ");
		grossSalary = sc.nextDouble();
		netSalaryPerMonth = grossSalary-(grossSalary*0.2);
		incomePerYear = netSalaryPerMonth*12;
	}
	public void eligibility() {

		System.out.print("Enter you EMI: ");
		EMI = sc.nextDouble();
		if(EMI == 0) {
			EligibilityScore = 3;
		}
		else if(EMI<(0.2*incomePerYear)) {
			EligibilityScore = 2;
		}
		else if(EMI<(0.4*incomePerYear)) {
			EligibilityScore = 1;
		}
		else if(EMI<(0.6*incomePerYear)) {
			EligibilityScore = 0;
		}
		else {
			System.out.print("Error");
		}
	}
	public void printDetails() {
		System.out.println("----------HDFC BANK DETAILS----------");
		System.out.println("Your name is: "+name);
		System.out.println("Your number is: "+mobile);
		System.out.println("Your address is: "+address);
		System.out.println("Your nominee is: "+nominee);
		System.out.println("Your age is: "+age);
		System.out.println("Your email is: "+mail);
		System.out.println("Your grossSalary is: "+grossSalary);
		System.out.println("Your netSalaryPerMonth is: "+netSalaryPerMonth);
		System.out.println("Your incomePerYear is: "+incomePerYear);
		System.out.println("Your EMI is: "+EMI);
		System.out.println("Your EligibilityScore is: "+EligibilityScore);
		
	}
}


public class Lab2_Scenario2 {

	public static void main(String[] args) {
		ICICI icici = new ICICI();
		HDFC hdfc = new HDFC();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you bank name: ");
		String name = sc.next();
		if(name.equals("ICICI")) {
			icici.getPersonalDetails();
			icici.perYearIncome();
			icici.eligibility();
			icici.printDetails();
		}
		else if(name.equals("HDFC")) {
			hdfc.getPersonalDetails();
			hdfc.perYearIncome();
			hdfc.eligibility();
			hdfc.printDetails();
		}
		else {
			System.out.println("Enter correct bank name");
		}
		
	}

}
