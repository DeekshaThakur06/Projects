import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList <String> list = new LinkedList<String>();
        list.add("TABLE");
        list.add("CHAIR");
        list.add("PEN");
        list.addFirst("STUDENT");
        list.add("TEACHER");
        list.add("PEN");
        for(String str : list)
	{
		System.out.println(str);
	}
	}
}
