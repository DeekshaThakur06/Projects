
public class TypeCasting {
      // Implicit type conversion
	  byte b = 5;
	  int i = b;
	  long l = 124234;
	  double d = l;
	  byte b1 = 10;
	  boolean bl = true;
	  short s = 135;
	  float f = s;
	  char c = 'd';
	  int it = c;
	  double d2 = c;
	  
	  // Explicit type conversion
	  float f1 = 1234;
	  short s1 = (short) f1;
	  double d1 = 1232.23;
	  int i1 =( int)d1;
	  
	  
	  
	public static void main(String[] args) {
		TypeCasting t = new TypeCasting();
      	System.out.println("Implicit Type casting:");
		System.out.println("byte to int: " +t.i);
		System.out.println("long to double: " +t.d);
		System.out.println("short to float: " +t.f);
		System.out.println("char to int:" +t.it);
		System.out.println("char to double:" +t.d2);
		System.out.println("Explicit Type casting:");
		System.out.println("float to short:" +t.s1);
		System.out.println("double to int:" +t.i1);
	
		
		

	}

}
