import java.util.*;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedHashSet<Integer> hash = new LinkedHashSet();
       hash.add(12);
       hash.add(20);
       hash.add(12);
       hash.add(null);
       for(Integer i : hash) {
    	   System.out.println(i);
       }
	}

}
