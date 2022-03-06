
public class ReturnTypes {

	 // void return type
	void show() {
		System.out.println("SHow method having void return type executed.");
	}
	// int return type
	int sum (int a, int b) {
		int add = a + b;
		return add;
	}
	// String return type
	String name (String n) {
		String Name = n;
		return Name;
	}
	public static void main(String[] args) {
		ReturnTypes rt = new ReturnTypes();
		rt.show();
		System.out.println(rt.sum(10, 20));
		System.out.println(rt.name("Deeksha"));

	}

}
