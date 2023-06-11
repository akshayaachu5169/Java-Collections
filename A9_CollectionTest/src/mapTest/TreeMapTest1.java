package mapTest;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap <String,String>tm = new TreeMap<String,String>();
tm.put("username", "Akshaya");
tm.put("password", "Pass@123");
tm.put("password", "a@123");//last insertion
tm.put("company", "vcentry");
tm.put("place", "Bangalore");
tm.put("address", null);//accepts null value
//tm.put(null, "udhayanagar");//does not accept null key
Iterator <String>it = tm.keySet().iterator();
while(it.hasNext()) {
	String key= it.next();
	System.out.println(key + "-----"+ tm.get(key));
}

	}

}
