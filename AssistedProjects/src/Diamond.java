
public class Diamond implements First,Second{
 public void show() {
	 System.out.println("show method called by class viz implementing two interfaces");
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   Diamond d = new Diamond();
	d.show();
	}

}
interface First{
	void show();
}
interface Second{
	void show();
}