
public class LocalInnerClass {
 void show() {
	 System.out.println("Local outer method called.");
	 int data = 20;
	 class inner {
		 void display() {
			 int data = 5;
			 System.out.println("Local inner method called.");
			 System.out.println("Value of data is:" +data);
		 }
	 }
	 inner in = new inner();
	 in.display();
 }
	public static void main(String[] args) {
   LocalInnerClass lc = new LocalInnerClass();
   lc.show();
   
	}

}
