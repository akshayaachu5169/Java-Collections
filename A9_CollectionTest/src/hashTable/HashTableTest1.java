package hashTable;

import java.util.Hashtable;

public class HashTableTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Hashtable<K, V> ht =new Hashtable<K, V>();
		Hashtable<String,String> table = new Hashtable<String,String>();
		table.put("username", "Akshaya");
		table.put("Password", "Pass@123");

		 //table.put(null, null);//- nullPointerException
		System.out.println(table.get("username"));
		// System.out.println(table.get(null));

	}

}
