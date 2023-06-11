package setTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//HashSet h = new HashSet();
Set h=new HashSet();	
h.add("Vcentryb");
h.add("Vcentryc");
h.add("Vcentryf");
h.add("Vcentrye");

h.add("Vcentryb");
h.add("Vcentryc");
h.add("Vcentryf");
h.add("Vcentrye");

Iterator it = h.iterator();
//System.out.println(it.hasNext());
//System.out.println(it.next());
//System.out.println(it.hasNext());
//System.out.println(it.next());
//System.out.println(it.hasNext());
//System.out.println(it.next());
//System.out.println(it.hasNext());
//System.out.println(it.next());
//
//System.out.println(it.hasNext());
//System.out.println(it.next());//no such element exception

while(it.hasNext()) {
	System.out.println(it.next());
}
	}

}
