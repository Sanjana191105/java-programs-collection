package JAVA;
import java.util.*;
public class collection {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		list.add("Banana");
		list.add("Apple");
		list.add("Orange");
		list.add("jerry");
		list.add("graps");
		System.out.println(list);
		System.out.println(list.set(2,"Mango"));
		System.out.println(list);
		list.remove(3);
		System.out.println(list);
		Collections.sort(list);
		System.out.println(list.size());
		list.clear();
		System.out.println(list.isEmpty());
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i));
		}
		
	}

}
