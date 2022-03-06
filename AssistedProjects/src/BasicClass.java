import java.util.Scanner;
public class BasicClass {
 
	void display() {
		System.out.println("Display method called");
	}
	String name;
	int age;
	 void identity(String str, int Age) {
		 name = str;
		 age = Age;
		 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BasicClass bc = new BasicClass();
		bc.display();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter name:");
		String name = sc.next();
		System.out.println("Enter age:");
		int age = sc.nextInt();
       	bc.identity(name, age);
        System.out.println("Name:" + bc.name +"\n"+ "Age:" +age);
	}

}
