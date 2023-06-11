package hashTable;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Hashtable<String,String> table = new Hashtable<String,String>();
table.put("username", "Akshaya");
table.put("Password", "Pass@123");
table.put("company", "vcentry");
table.put("place", "Bangalore");
table.put("place", "chennai");//last insertion gives the value
Enumeration<String> e = table.keys();

//System.out.println(e.hasMoreElements());
//System.out.println(e.nextElement());

//System.out.println(table.get(key));
while(e.hasMoreElements()) {
	String key  = e.nextElement();
	System.out.println(key + " - " +table.get(key));
	
}
}
	}


