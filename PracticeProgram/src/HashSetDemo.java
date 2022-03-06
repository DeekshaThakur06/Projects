import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        HashSet<Integer> hset = new HashSet<>();
		hset.add(null);
		hset.add(5);
		hset.add(10);
		hset.add(5);
		hset.add(20);
		hset.add(null);
		System.out.println(hset.contains(9));
		System.out.println(hset.size());
		System.out.println(hset.isEmpty());
		for(Integer i : hset) {
		System.out.println(i);
	}
		HashSet<String> SET = new HashSet<>();
		SET.add("ABC");
		SET.add("null");
		SET.add("abc");
		SET.add(null);
		for(String STR : SET) {
			System.out.println(STR);
		}
	}
}
