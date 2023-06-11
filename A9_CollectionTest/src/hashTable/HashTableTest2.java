package hashTable;

import java.util.Hashtable;

public class HashTableTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable<String, Integer> table = new Hashtable<String, Integer>();
table.put("DOB", 1993);
table.put("age", 29);
table.put("children", 1);

System.out.println(table.get("age"));
	}

}
