package mapTest;

import java.util.Iterator;
import java.util.LinkedHashMap;

public class LinkedHashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LinkedHashMap <String ,String>lm = new LinkedHashMap<String,String>();
lm.put("username", "Akshaya");
lm.put("Password", "Pass@123");
lm.put("company", "vcentry");
lm.put("place", "Bangalore");
lm.put("address", null);
lm.put(null, "udhayanagar");
Iterator<String> it = lm.keySet().iterator();

while(it.hasNext()) {
	String key =  it.next();
	System.out.println(key + "----" +lm.get(key));
}
	}

}
