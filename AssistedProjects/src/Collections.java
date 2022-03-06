import java.util.*;
public class Collections {

	public static void main(String[] args) {
		// ArrayList
		ArrayList<String> alist = new ArrayList<>();
		alist.add("DEEKSHA");
		alist.add("deeksha");
		alist.add("thakur");
		alist.add("THAKUR");
		alist.add("THAKUR");
		System.out.println("ArrayList elements are:"); 
		for(String str : alist) {
			System.out.println(str);
		}
	    //LinkedList
		LinkedList<Integer> llist = new LinkedList<>();
		llist.add(110);
		llist.add(0);
		llist.add(50);
		llist.add(0);
		System.out.println("LinkedList elements are:");
		for(Integer i : llist) {
			System.out.println(i);
			
		}
		// HashSet
		HashSet<String> hset = new HashSet<>();
		hset.add("Dell");
		hset.add(null);
        hset.add("null");
        hset.add("Lenovo");
        hset.add("Apple");
        hset.add("HP");
        System.out.println("Hashset elements are:");
        for(String str : hset) {
        	System.out.println(str);
        }
        // LinkedHashSet
        LinkedHashSet<String>lhset = new LinkedHashSet<>();
        lhset.add("Deeksha");
        lhset.add("deeksha");
        lhset.add("DeeKsha");
        lhset.add("null");
        lhset.add(null);
        System.out.println("LinkedHashSet elements are:");
        for(String str : lhset) {
        	
        	System.out.println(str);
        }
        //TreeSet
        TreeSet<String> tset = new TreeSet<>();
        tset.add("Pubg");
        tset.add("Freefire");
        tset.add("Pubg");
        tset.add("null");
        tset.add("COD");
        //tset.add(null);
        System.out.println("TreeSet elemnts are:");
        for(String str: tset) {
        	
        	System.out.println(str);
        }
        
        }

	public static List<String> emptyList() {
		// TODO Auto-generated method stub
		return null;
	}

}
