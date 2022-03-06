import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     TreeSet<String> tree= new TreeSet<>();
     tree.add("abc");
     tree.add("ABC");
     tree.add("null");
     tree.add("abc");
     //tree.add(null);
     for(String str : tree) {
    	 System.out.println(str);
     }
	}

}
