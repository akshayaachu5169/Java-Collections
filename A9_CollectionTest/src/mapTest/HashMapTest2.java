package mapTest;

import java.util.HashMap;
import java.util.Hashtable;

public class HashMapTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("DOB", 1993);
		map.put("age", 29);
		map.put("children", 1);

		System.out.println(map.get("age"));
			}
	}


