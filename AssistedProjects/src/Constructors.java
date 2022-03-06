
public class Constructors {
	Constructors() {
		System.out.println("default constructor called");
	}
     Constructors(int x, int y){
    	 int sum = x + y;
    	 System.out.println(sum);
    	 System.out.println("Parameterized constructor called.");
     
     }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//default constructor
    Constructors c = new Constructors();
    // Parameterized constructor
		Child cd = new Child();
    Constructors c1 = new Constructors(5,5);
	}

}
class Child extends Constructors{
	 
	 Child() {
		 super();
		 System.out.println("Child constructor called.");
	 }
}