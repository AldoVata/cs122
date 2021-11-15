package classSamples.collections.ListAPI;

import java.util.LinkedList;

public class LinkedListAPI {
	public static void main(String[] args) {
		LinkedList<String> aList = new LinkedList<String>();
		System.out.println(aList);
		aList.add("a");
		aList.add("b");
		aList.add("c");
		aList.add("d");
		aList.add("e");
		aList.add("f");
		System.out.println(aList);
		aList.push("z");
		aList.pop();
		System.out.println(aList);


	}
}
