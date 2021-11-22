package classlab.week13;

import java.util.HashMap;
import java.util.Map;

public class MapClassWork {

	public static void main(String[] args) {
		Map<String,Integer> map1 = new HashMap<String,Integer>(5);
		map1.put("A", 0);
		map1.put("B", 1);
		map1.put("C", 2);
		System.out.println(map1);
		map1.remove("A");
		System.out.println(map1);
	}

}
