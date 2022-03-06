
public class StringB {
   static String str = "My name is Deeksha.";
   static String str1 = "Hello fellas.";
   static int a = 10;
   static String str2 = "      Java  ";
    static String str3 = "Hello";
   static String str4 = "Hello";
	public static void main(String[] args) {
   StringB b = new StringB();
   System.out.println("String is:" +str);
   // chartAt()
   System.out.println("Character at index:" +str.charAt(9));
   
   // compareTo()
   System.out.println(" CompareTo() output:" + str.compareTo(str1));
    
   // equals()
  System.out.println("Equals() output:" + str3.equals(str4));
   
   // ==
   System.out.println("== to check refernce:" +(str3 == str4));
	
	// length()
	System.out.println("Length of string:" + str.length());
	
	// toUpperCase()
	System.out.println("Conversion of string to uppercase:" + str.toUpperCase());
	
	// toLowerCase()
	System.out.println("Conversion to lowerCase:" + str.toLowerCase());
	
	// substring(begin index, end index)
	System.out.println("Substring is:" + str.substring(8,15));
	
	// concat()
	System.out.println("To concat two strings:" + str.concat(str1));
	
	// endsWith()
	System.out.println("Check if ends with given string:" + str.endsWith("Deeksha."));
	
	// startsWith()
	System.out.println("Check if starts With given string:" +str.startsWith("hey"));
	
	// replace()
	System.out.println("After replacing:" + str.replace("Deeksha","deeksha"));
	
	// valueOf()
	System.out.println("Using valueOf():" +(String.valueOf(a) + 10));
	
	// trim()
	System.out.println("String after using trim():" + str2.trim());
	
	
	// StringBuffer
	 StringBuffer sb = new StringBuffer("Hello Beautiful");
	 
	 // append()
	 sb.append(" Welcome");
	 System.out.println(sb);
	 
	 // insert()
	 sb.insert(1, "HE");
	 System.out.println(sb);
	 
	 // replace()
	 sb.replace(1, 7, "ey");
	 System.out.println(sb);
	 
	 // delete()
	 sb.delete(11, 15);
	 System.out.println(sb);
	 
	 // reverse()
	 System.out.println(sb.reverse());
	 
	 //capacity()
	 System.out.println(sb.capacity());
	 
	// StringBuilder
		 StringBuilder sB = new StringBuilder("Hello World.");
		 
		 // append()
		 sB.append(" Welcome");
		 System.out.println(sB);
		 
		 // insert()
		 sB.insert(1, "HE");
		 System.out.println(sB);
		 
		 // replace()
		 sB.replace(1, 7, "ey");
		 System.out.println(sB);
		 
		 // delete()
		 sB.delete(11, 15);
		 System.out.println(sB);
		 
		 // reverse()
		 System.out.println(sB.reverse());
		 
		 //capacity()
		 System.out.println(sB.capacity());
	}
}
