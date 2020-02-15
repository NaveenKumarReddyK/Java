import java.util.Scanner;
public class Scenario2_17BCI0108{
	public static void valid(String password) {
			int count=0;
			for(int i=0;i<password.length();i++) {
				 char p = password.charAt(i) ;
				if(!Character.isLetterOrDigit(p)) {
					count++;
				}
			}
			if(password.length()<6 && count<=0) {
				System.out.println("Good password");
			}
			else if(password.length()<6 && count>0) {
				System.out.println("Password is good and should not contian special character");
			}
			else if(password.length()>=6 && count>0) {
				System.out.println("Password should be less than 6 characters");
			}
			else{
				System.out.println("Bad password");
			}
			
		
	}
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("USER NAME:");
		String name = sc.next();
		System.out.print("PASSWORD:");
		String pwd = sc.next();
		System.out.println("Your user name is: "+name);
		valid(pwd);
	}

}
