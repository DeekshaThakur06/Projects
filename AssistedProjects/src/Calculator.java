import java.util.Scanner;
public class Calculator {
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter first number: ");
    int a = sc.nextInt();
    System.out.println("Enter second number: ");
    int b = sc.nextInt();
    System.out.println("Press 1 for addition");
    System.out.println("Press 2 for subtraction");
    System.out.println("Press 3 for multiplication");
    System.out.println("Press 4 for division");
    int choice = sc.nextInt();
    switch(choice) {
    case 1 :{
    	int sum = a + b;
    	System.out.println("Addition of two numbers:" + sum);
    	break;
    }
    case 2 :{
    	int diff = a - b;
    	System.out.println("Subtraction of two numbers:" + diff);
    	break;
    }
    case 3 :{
    	int multi = a * b;
    	System.out.println("Multiplication of two numbers:" + multi);
    	break;
    }
    case 4 :{
    	int div = a / b;
    	System.out.println("Division of two numbers:" + div);
    	break;
    }
    default :
    	System.out.println("Incorrect Choice.");
    }
	}

}
