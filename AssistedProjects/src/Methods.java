import java.util.Scanner;
public class Methods {
    // method declaration
	void display() {
		System.out.println("Display method called");
	
	}
	int x = 10;
	void show(int y) {
		x = y;
		System.out.println(x);
	}
	// method overloading
	int sum (int a, int b)
	{   
		int c = a + b;
		return c;
	}
	int sum (int a, int b, int c) {
	int d = a + b + c;
	return d;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
    Methods m = new Methods();
    // method calling
    m.display();
    System.out.println("Before calling value of x is:" + m.x);
    System.out.println("After calling value of x is:");
    m.show(20);
    System.out.println("how many arguments you want to use?");
    int arg = sc.nextInt();
    if(arg==2) {
    	System.out.println("Enter first number:");
        int x = sc.nextInt();
        System.out.println("Enter second number:");
        int y = sc.nextInt();
        int z = m.sum(x,y);
        System.out.println("Sum of two numbers:" +z);
    }
    else if(arg == 3)
    {
    	System.out.println("Enter first number:");
        int x = sc.nextInt();
        System.out.println("Enter second number:");
        int y = sc.nextInt();
        System.out.println("Enter third number:");
        int z = sc.nextInt();
        int add = m.sum(x,y,z);
        System.out.println("Sum of three numbers:" +add);
    }
    else {
    	System.out.println("Arguments out of numbers.");
    }
    
	}

}
