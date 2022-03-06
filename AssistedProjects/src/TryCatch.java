import java.util.Scanner;
public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first value:");
		int a = sc.nextInt();
		System.out.println("Enter second value:");
		int b = sc.nextInt();
	    try {
		int x = a / b;
		System.out.println("Value after dividing is:" +x);
	    }
	    catch(ArithmeticException e) {
	    	System.out.println("Exception in try block." + e.getMessage());
	    	
	    }

	}

}
