
public class AccessSpecifiers {
	// public access specifier
public int x = 10; 
public void display() {
	System.out.println("Public access specifier called.");
}
void show() {
	System.out.println("Default access specifier called.");
}
protected void visible() {
	System.out.println("Protected access specifier called.");
}
private void see() {
	System.out.println("Private access specifier called.");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessSpecifiers a = new AccessSpecifiers();
		System.out.println(a.x);
		a.show();
		a.see();
		a.visible();
		a.display();
		}
}
