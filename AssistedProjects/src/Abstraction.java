import java.util.Scanner;
public class Abstraction extends user {
	String Name;
	int Age;
 String name(String n) {
	 Name = n;
 return Name;
	 }
 int age(int a) {
	 Age = a;
	 return Age;
 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Abstraction ab = new Abstraction();
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter Name:");
  String n = sc.next();
  System.out.println("Enter Age:");
  int a = sc.nextInt();
  System.out.println("Name:" + ab.name(n));
  System.out.println("Age:" +ab.age(a));
  ab.display();
	}

}
abstract class user {
	abstract String name(String n);
	abstract int age(int a);
	void display() {
		System.out.println("Non-abstract method called, viz present in abstarct class.");
	}	}