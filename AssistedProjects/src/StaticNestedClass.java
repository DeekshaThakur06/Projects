
public class StaticNestedClass {
  void outer() {
	  System.out.println("Outer method called.");
  }
	static class inner{
		static void msg() {
			System.out.println("Static inner class method called.");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticNestedClass s = new StaticNestedClass();
//StaticNestedClass.inner sc = new StaticNestedClass.inner();
s.outer();
StaticNestedClass.inner.msg();
//sc.msg();
	}

}
