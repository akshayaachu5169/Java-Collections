package mapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashMap<String,String> map = new HashMap<String,String>();
map.put("username", "Akshaya");
map.put("Password", "Pass@123");
map.put("company", "vcentry");
map.put("place", "Bangalore");
map.put(null, null);//accepts null value
map.put("place", "chennai");//last insertion gives the value
//System.out.println(map.keySet());
//Iterator it = map.keySet().iterator();

Set<String> key = map.keySet();
Iterator<String> it = key.iterator();

while(it.hasNext()) {
	String keys = it.next();
	System.out.println(keys + " - " + map.get(keys));
	
}
	}

}
