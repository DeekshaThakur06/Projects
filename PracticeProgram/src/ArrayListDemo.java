import java.util.*;
public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<String> data = new ArrayList<>();
		data.add("Deeksha");
		data.add("Shruti");
		data.add("Sejal");
		data.add(3,"Sangwan");
		data.set(1,"Thakur");
		data.add("Deeksha");
		data.remove(2);
		data.remove("sangwan");
		System.out.println(data.get(1));
		System.out.println(data.contains("saroj"));
		System.out.println(data.size());
		Collections.sort(data);
		System.out.println(data);
		for(String str : data) {
			System.out.println(str);
		}
		ArrayList<String> item = new ArrayList<String>();
		item.add("Apple");
		item.add("Banana");
		item.add("Orange");
		item.add("Strawberry");
		item.add("Grapes");
		System.out.println(item);
		item.add(0,"Mango");
		item.add(1, "peach");
		System.out.println(item);
		item.remove("Banana");
		item.remove("Orange");
		item.remove(2);
		System.out.println(item);
	}

}
