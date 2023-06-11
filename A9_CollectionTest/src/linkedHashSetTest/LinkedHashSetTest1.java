package linkedHashSetTest;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//LinkedHashSet  a =new LinkedHashSet();
		Set lh = new LinkedHashSet();
		lh.add("Vcentryb");
		lh.add("Vcentryc");
		lh.add("Vcentryf");
		lh.add("Vcentrye");
		
		lh.add("Vcentryb");
		lh.add("Vcentryc");
		lh.add("Vcentryf");
		lh.add("Vcentrye");
		lh.add(null);
		lh.add(20);
		lh.add('a');
		lh.add(false);
		
	Iterator it =	lh.iterator();
	while(it.hasNext()) {
	System.out.println(it.next());
	}

}
}
