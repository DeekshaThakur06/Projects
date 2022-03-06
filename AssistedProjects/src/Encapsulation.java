import java.util.Scanner;

public class Encapsulation {
 private String name;
 private int age;
 
 void set(String Name, int Age) {
	 name = Name;
	 age = Age;
	 
 }
 void get(){
	 System.out.println("Name is:" + name + "\n" + "Age is:" +age);
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Encapsulation e = new Encapsulation();
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter name:");
     String n = sc.next();
     System.out.println("Enter age:");
     int a = sc.nextInt();
     e.set(n,a);
     e.get();
	}

}
