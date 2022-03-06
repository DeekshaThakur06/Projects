
public class InnerClass {
private int data = 10;
private void show() {
	System.out.println("Outer class method called.");
}
// Member Inner Class
	class inner{
		void display() {
			System.out.println("Example of member inner class.");
			System.out.println("Value of data is:" +data);
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InnerClass ic = new InnerClass();
    InnerClass.inner in = ic.new inner();
    in.display();
    ic.show();
	}

}
