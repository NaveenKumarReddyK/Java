import java.util.Scanner;

interface  creditCardApp_17BCI0108 {
	void getPersonalDetails_17BCI0108();
	void perYearIncome_17BCI0108();
	void eligibility_17BCI0108();
	void printDetails_17BCI0108();
}

class ICICI_17BCI0108 implements creditCardApp_17BCI0108{
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
	public void getPersonalDetails_17BCI0108() {
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
	public void perYearIncome_17BCI0108() {
		
		System.out.print("Enter you Gross Salary: ");
		grossSalary = sc.nextDouble();
		netSalaryPerMonth = grossSalary-(grossSalary*0.2);
		incomePerYear = netSalaryPerMonth*12;
	}
	public void eligibility_17BCI0108() {

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
	public void printDetails_17BCI0108() {
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



class HDFC_17BCI0108 implements creditCardApp_17BCI0108{
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
	public void getPersonalDetails_17BCI0108() {
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
	public void perYearIncome_17BCI0108() {
		
		System.out.print("Enter you Gross Salary: ");
		grossSalary = sc.nextDouble();
		netSalaryPerMonth = grossSalary-(grossSalary*0.2);
		incomePerYear = netSalaryPerMonth*12;
	}
	public void eligibility_17BCI0108() {

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
	public void printDetails_17BCI0108() {
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


public class Lab2_Scenario2_17BCI0108  {

	public static void main(String[] args) {
		ICICI_17BCI0108 icici = new ICICI_17BCI0108();
		HDFC_17BCI0108 hdfc = new HDFC_17BCI0108();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter you bank name: ");
		String name = sc.next();
		if(name.equals("ICICI")) {
			icici.getPersonalDetails_17BCI0108();
			icici.perYearIncome_17BCI0108();
			icici.eligibility_17BCI0108();
			icici.printDetails_17BCI0108();
		}
		else if(name.equals("HDFC")) {
			hdfc.getPersonalDetails_17BCI0108();
			hdfc.perYearIncome_17BCI0108();
			hdfc.eligibility_17BCI0108();
			hdfc.printDetails_17BCI0108();
		}
		else {
			System.out.println("Enter correct bank name");
		}
		
	}

}
