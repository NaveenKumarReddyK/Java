import java.text.DecimalFormat;
import java.util.*;
public class FloatNumsUptoThreeDecimals {

	public static void main(String[] args) {
//		 f1 = new float;
//		float f2 = new float;
		Scanner sc = new Scanner(System.in);
		float f1 = sc.nextFloat();
		float f2 = sc.nextFloat();
		//DecimalFormat df = new DecimalFormat("#.00");
		//df.format(f1);
		//df.format(f2);
		f1 = Math.round(f1*1000);
		f1 = f1/1000;
		f2 = Math.round(f2*1000);
		f2 = f2/1000;
		System.out.println(f1);
		System.out.println(f2);
		if(f1 == f2) {
			System.out.println("Two floating numbers are equal upto three decimal values");
		}
		else {
			System.out.println("Two floating numbers are NOT equal upto three decimal values");
		}

	}

}
