package mapTest;

import java.util.Iterator;
import java.util.TreeMap;

public class TreeMapTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
TreeMap <String,Integer>tm  = new TreeMap<String,Integer>();
tm.put("DOB", 1993);
tm.put("age", 29);
tm.put("children", 1);

Iterator<String> it = tm.keySet().iterator();
while(it.hasNext()) {
	String key=it.next();
	System.out.println(key + "-----"+ tm.get(key));
}
	}

}
