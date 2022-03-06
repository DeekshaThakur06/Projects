
public class Inheritance {
 void parent() {
	 System.out.println("Parent class method called.");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
  child c = new child();
  c.parent();
  c.Child();
  
	}

}
class child extends Inheritance{
	void Child() {
		System.out.println("Child class method called.");
	}
}