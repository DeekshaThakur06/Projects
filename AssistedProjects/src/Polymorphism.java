import java.util.Scanner;
public class Polymorphism {
	// Method Overloading
      static void add(int a, int b) {
    	  System.out.println("Addition of two integer numbers:" + (a+b));
      }
      static void add(double a, double b) {
    	  System.out.println("Addition of two float values:" +(a+b));
      }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Polymorphism pm = new Polymorphism();
		add(5,5);
		add(10.5,.5);
		
	}

}
