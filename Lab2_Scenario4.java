import java.util.*;
public class Lab2_Scenario4 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the URL: ");
		String url = sc.next();
		int idx1 = url.indexOf(":");
		String service_str = url.substring(0,idx1);
		int idx2 = url.indexOf("/",idx1+3);
		String host_str = url.substring(idx1+3, idx2);
		int idx3 = url.lastIndexOf("/");
		String path_str = url.substring(idx2+1, idx3);
		String file_str = url.substring(idx3+1);
		
		System.out.println("Service: "+service_str);
		System.out.println("Host: "+host_str);
		System.out.println("Path: "+path_str);
		System.out.println("File: "+file_str);
		
//		System.out.println(url.length());
//		System.out.println(idx1);
//		System.out.println(idx2);
//		System.out.println(idx3);
	}

}
